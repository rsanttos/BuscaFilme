package br.com.ufrn.protocolo.buscafilme.main;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.json.JSONException;
import org.json.JSONObject;

public class Buscador {

	private String apiKey = "4c4597bb";
	private String urlPrincipal = "http://www.omdbapi.com/?apikey=" + apiKey;

	public Filme buscaFilme(String nome) throws JSONException {
		Filme filme = new Filme();
		String urlRequisicao = urlPrincipal + "&t=" + formataNomeBusca(nome);
		String jsonResultado = requisicao(urlRequisicao);
		JSONObject obj = new JSONObject(jsonResultado);

		if (obj != null) {
			filme.setAno(obj.getString("Year"));
			filme.setDiretor(obj.getString("Director"));
			filme.setGenero(obj.getString("Genre"));
			filme.setNotaIMDB((float) obj.getDouble("imdbRating"));
			filme.setPoster(obj.getString("Poster"));
			filme.setPrincipaisAtores(obj.getString("Actors"));
			filme.setSinopse(obj.getString("Plot"));
			filme.setTitulo(obj.getString("Title"));
		}

		return filme;
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
