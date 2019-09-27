package br.com.fiap.excecao;

public class Excecao extends Exception {

	/*public Excecao(Exception e) {
		if (e.getClass().toString().equals
				("class java.lang.NullPointerException")) {
			System.out.println("Objeto Nulo");
		}else if (e.getClass().toString().equals
				("class java.lang.NumberFormatException")) {
			System.out.println("Número Inválido");
		} else {
			System.out.println("Deu ruim....");
		}
	}
	NÃO DEVO USAR COM CONSTRUTOR NO AM E NEM NA PS
	O HUMBERTO VAI DESCONTAR NOTA
	 */
	public static String getExcecao(Exception e) {
		if (e.getClass().toString().equals
				("class java.lang.NullPointerException")) {
			return "Objeto Nulo";
		}else if (e.getClass().toString().equals
				("class java.lang.NumberFormatException")) {
			return "Número Inválido";
		} else {
			return "Deu ruim....";
		}
	}

}
