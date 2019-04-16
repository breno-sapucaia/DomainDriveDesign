package br.com.fiap;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaCorrente conta = new ContaCorrente();
		
		conta.deposito(20);
		System.out.println(conta.deposito(100));
		
		conta.titular = "Fora Temer";
		
		System.out.println(conta.saque(5000));
		
		conta.exibirSaldo();
		
	}

}
