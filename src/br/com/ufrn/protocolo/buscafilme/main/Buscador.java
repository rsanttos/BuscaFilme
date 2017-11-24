package br.com.ufrn.protocolo.buscafilme.main;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Buscador {

	private String apiKey = "4c4597bb";
	private String urlPrincipal = "http://www.omdbapi.com/?apikey=" + apiKey;

	public List<Filme> buscaFilmes(String nome) throws JSONException {
		Filme filme = new Filme();
		String urlRequisicao = urlPrincipal + "&s=" + formataNomeBusca(nome);
		String jsonResultado = requisicao(urlRequisicao);
		JSONObject obj = new JSONObject(jsonResultado);

		String sucesso = obj.getString("Response");

		if (obj != null && sucesso.equals("True")) {

			return getArrayFilme(obj);
		} else if (sucesso.equals("False")) {
			if (!obj.isNull("Error")) {
				System.out.println("Erro: " + obj.getString("Error"));
				return null;
			} else {
				System.out.println("Ops. Ocorreu algo errado!");
				return null;
			}
		} else {
			return null;
		}
	}
	
	public Filme buscaFilme(String imdbID) throws JSONException {
		Filme filme = new Filme();
		String urlRequisicao = urlPrincipal + "&i=" + imdbID;
		String jsonResultado = requisicao(urlRequisicao);
		JSONObject obj = new JSONObject(jsonResultado);
		filme = getDetalhesFilme(obj);
		return filme;
	}

	public Filme getFilme(JSONObject obj) throws JSONException {
		Filme filme = new Filme();
		filme.setTitulo(obj.getString("Title"));
		filme.setAno(obj.getString("Year"));
		filme.setImdbID(obj.getString("imdbID"));
		filme.setPoster(obj.getString("Poster"));
		
		return filme;
	}

	public Filme getDetalhesFilme(JSONObject obj) throws JSONException {
		Filme filme = new Filme();
		filme.setAno(obj.getString("Year"));
		filme.setDiretor(obj.getString("Director"));
		filme.setGenero(obj.getString("Genre"));
		filme.setNotaIMDB((float) obj.getDouble("imdbRating"));
		filme.setPoster(obj.getString("Poster"));
		filme.setPrincipaisAtores(obj.getString("Actors"));
		filme.setSinopse(obj.getString("Plot"));
		filme.setTitulo(obj.getString("Title"));
		return filme;
	}
	
	public List<Filme> getArrayFilme(JSONObject obj) throws JSONException {
		JSONArray arrayJson = obj.getJSONArray("Search");
		List<Filme> filmes = new ArrayList<Filme>();
		for(int i = 0 ; i < arrayJson.length() ; i++) {
			filmes.add(getFilme(arrayJson.getJSONObject(i)));
		}
		return filmes;
	}

	public String formataNomeBusca(String nome) {
		if (nome.contains(" ")) {
			return nome.replace(' ', '+').toLowerCase();
		} else {
			return nome.toLowerCase();
		}
	}

	public String requisicao(String url) {
		try {
			URL u = new URL(url);
			InputStream in = u.openStream();
			int c;
			String json = "";
			while ((c = in.read()) != -1) {
				// System.out.print((char) c);
				json += (char) c;
			}
			in.close();

			return json;
		} catch (IOException ex) {
			System.err.println(ex);
			return null;
		}
	}

}
