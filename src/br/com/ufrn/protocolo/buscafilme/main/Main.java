package br.com.ufrn.protocolo.buscafilme.main;

import java.util.List;
import java.util.Scanner;

import org.json.JSONException;

public class Main {
	static Scanner leitorTeclado = new Scanner(System.in);


	public static void main(String[] args) throws JSONException {
		// TODO Auto-generated method stub
		Buscador buscador = new Buscador();
		List<Filme> filmes = buscador.buscaFilmes("batman");
		if(filmes != null) { 
			for(Filme filme : filmes) {
				filme.imprimeFilme();
			}	
			
			System.out.println("Digite o imdbID do filme desejado: ");
			String imdbID = leitorTeclado.nextLine();	
			Filme filmeEscolhido = buscador.buscaFilme(imdbID);
			if(filmeEscolhido != null) {
				filmeEscolhido.imprimeDetalhesFilme();
			}
		}
	}	
}
