package br.com.fiap.tds.ltp.sistemabanco.entidades;

public class Cliente {
	public String nome;
	public String cpf;
	public Endereco endereco;

	public Cliente(String nome,String cpf, Endereco end) {
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = end;
	}
}

