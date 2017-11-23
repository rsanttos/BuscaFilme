package br.com.ufrn.protocolo.buscafilme.main;

import org.json.JSONException;

public class Main {

	public static void main(String[] args) throws JSONException {
		// TODO Auto-generated method stub
		Buscador buscador = new Buscador();
		imprime(buscador.buscaFilme("batman uau"));
	}	
	
	public static void imprime(Filme filme) {
		System.out.println("Título: " + filme.getTitulo());
		System.out.println("Ano: " + filme.getAno());
		System.out.println("Gênero: " + filme.getGenero());
		System.out.println("Autor: " + filme.getAutor());
		System.out.println("Atores principais: " + filme.getPrincipaisAtores());
		System.out.println("Nota no imdb: " + filme.getNotaIMDB());
		System.out.println("Sinopse: " + filme.getSinopse());
		System.out.println("Poster: " + filme.getPoster());
	}

}
