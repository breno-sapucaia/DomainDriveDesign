package br.com.fiap;

public class ContaCorrente {
	public String titular;
	private int agencia;
	private String nCorrente;
	private double saldo;
	
	public  double deposito(double valor){
		this.saldo += valor;
		return this.saldo;
	}
	public double saque(double valor) {
		this.saldo -= valor;
		return this.saldo;
	}
	public double getSaldo() {
		return this.saldo;
	}
	public void exibirSaldo() {
		System.out.println("Olá "+this.titular+", o seu saldo é R$:"+saldo);
	}
		
		

}
