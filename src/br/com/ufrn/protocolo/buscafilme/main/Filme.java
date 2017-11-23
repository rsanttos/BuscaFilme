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
	private float notaIMDB;

	
	public Filme(String titulo, String ano, String genero, String diretor, String autor, String principaisAtores,
			float notaIMDB, String sinopse, String poster) {
		super();
		this.titulo = titulo;
		this.ano = ano;
		this.genero = genero;
		this.diretor = diretor;
		this.autor = autor;
		this.principaisAtores = principaisAtores;
		this.notaIMDB = notaIMDB;
		this.sinopse = sinopse;
		this.poster = poster;
	}


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
	
	
}
