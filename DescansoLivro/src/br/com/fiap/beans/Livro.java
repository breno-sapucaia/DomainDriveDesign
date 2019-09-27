package br.com.fiap.beans;

public class Livro {
	private int isbn;
	private String nome;
	private String autor;
	private double valor;
	private Editora editora;
	
	public Livro() {}

	public Livro(int isbn, String nome, String autor, double valor, Editora editora) {
		super();
		this.isbn = isbn;
		this.nome = nome;
		this.autor = autor;
		this.valor = valor;
		this.editora = editora;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Editora getEditora() {
		return editora;
	}

	public void setEditora(Editora editora) {
		this.editora = editora;
	}
	
	
}
