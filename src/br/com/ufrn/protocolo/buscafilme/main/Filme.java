package br.com.ufrn.protocolo.buscafilme.main;

public class Filme {
	
	private String titulo;
	private String ano;
	private String genero;
	private String diretor;
	private String autor;
	private String principaisAtores;
	private String sinopse;
	private String poster;
	private String imdbID;
	private float notaIMDB; 


	public Filme() {
		super();
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getAno() {
		return ano;
	}


	public void setAno(String ano) {
		this.ano = ano;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public String getDiretor() {
		return diretor;
	}


	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public String getPrincipaisAtores() {
		return principaisAtores;
	}


	public void setPrincipaisAtores(String principaisAtores) {
		this.principaisAtores = principaisAtores;
	}


	public float getNotaIMDB() {
		return notaIMDB;
	}


	public void setNotaIMDB(float notaIMDB) {
		this.notaIMDB = notaIMDB;
	}


	public String getSinopse() {
		return sinopse;
	}


	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}


	public String getPoster() {
		return poster;
	}


	public void setPoster(String poster) {
		this.poster = poster;
	}

	
	public String getImdbID() {
		return imdbID;
	}


	public void setImdbID(String imdbID) {
		this.imdbID = imdbID;
	}


	public void imprimeFilme() {
		System.out.println("Título: " + this.getTitulo());
		System.out.println("Ano: " + this.getAno());
		System.out.println("Poster: " + this.getPoster());
		System.out.println("imdbID: " + this.getImdbID());
		System.out.println("**************************************************");
		//System.out.println("Autor: " + filme.getAutor());
	}
	
	public void imprimeDetalhesFilme() {
		System.out.println("Título: " + this.getTitulo());
		System.out.println("Ano: " + this.getAno());
		System.out.println("Gênero: " + this.getGenero());
		//System.out.println("Autor: " + filme.getAutor());
		System.out.println("Atores principais: " + this.getPrincipaisAtores());
		System.out.println("Nota no imdb: " + this.getNotaIMDB());
		System.out.println("Sinopse: " + this.getSinopse());
		System.out.println("Poster: " + this.getPoster());
		System.out.println("**************************************************");
	}
	
}
