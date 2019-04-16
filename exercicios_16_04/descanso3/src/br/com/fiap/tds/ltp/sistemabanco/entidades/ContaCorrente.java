package br.com.fiap.tds.ltp.sistemabanco.entidades;

public class ContaCorrente {

	public double saldo;
	public Cliente titular;
	
	public ContaCorrente(double s, Cliente t) {
		this.saldo = s;
		this.titular = t;
	}
	public double retornarSaldo() {
		return saldo;
	}
}
