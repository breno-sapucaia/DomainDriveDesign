package descanso6;

import java.util.Scanner;

public class Loja {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
	String[] produtos = new String[3];
	int[] qunatidades = new int[3];
	double[] precos = new double[3];
	double[] descontos = new double[3];
	
	
	for(int i = 1; i<4; i++) {
		System.out.println("Digite o nome do porduto " + i + ":");
		produtos[i-1] = entrada.next();
		System.out.println("Digite a quantidade do produto " + i + ":");
		qunatidades[i-1] = entrada.nextInt();
		System.out.println("Digite o preco do produto " + i + ":");
		precos[i-1] = entrada.nextDouble();
		System.out.println("Digite o desconto do produto " + i + ":");
		descontos[i-1] = entrada.nextDouble();
		}
	
	double valorTotal = 0;
	
		for(int i = 0; i < 3; i++) {
			valorTotal += precos[i] * qunatidades[i] - descontos[i];
		}
		System.out.println("O valor total da compra é de R$:" + valorTotal);
	}
}
