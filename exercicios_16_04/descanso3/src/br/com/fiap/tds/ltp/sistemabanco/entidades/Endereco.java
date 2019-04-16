package br.com.fiap.tds.ltp.sistemabanco.entidades;

public class Endereco {
	public String rua;
	private short numero;
	public String complemento;
	public String bairro;
	public String cep;
	
	public Endereco(String rua, short num, String com, String bairro, String cep) {
		this.rua = rua;
		this.numero =num;
		this.complemento = com;
		this.bairro = bairro;
		this.cep = cep;
	}
	public short getNumero() {
		return this.numero;
	}
	public void setNumero(short novoNumero) {
		this.numero = novoNumero;
	}
}
