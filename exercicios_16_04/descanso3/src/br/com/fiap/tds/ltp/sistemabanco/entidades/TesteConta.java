package br.com.fiap.tds.ltp.sistemabanco.entidades;

import java.util.Scanner;

public class TesteConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		Endereco e = new Endereco("Alagoas",(short) 33, "AP 07", "Brás", "85561-387");
		Cliente c = new Cliente("Olavo de Carvalho","369.785.699-12",e);
		ContaCorrente conta = new ContaCorrente(7950.33 , c);
		System.out.println("|-------------------------------------------------------------------------------------|");
		System.out.println("|Conta Corrente|             Cliente              |              Endereco             |");
		System.out.println("|-------------------------------------------------------------------------------------|");
		System.out.println("|    Saldo     |Nome              |CPF            |Rua     |Nº|Compl.|Bairro|Cep      |");
		System.out.println("|-------------------------------------------------------------------------------------|");
		System.out.println("|R$:"+conta.retornarSaldo()+"    |"+conta.titular.nome+" |"+conta.titular.cpf+" |"+conta.titular.endereco.rua+" |"+conta.titular.endereco.getNumero()+"|"+conta.titular.endereco.complemento+" |"+conta.titular.endereco.bairro+"  |"+conta.titular.endereco.cep+"|");
		System.out.println("|-------------------------------------------------------------------------------------|");
	
	
	}

}
