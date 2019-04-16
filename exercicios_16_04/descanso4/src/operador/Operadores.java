package operador;

import java.util.Scanner;

public class Operadores {
	public static void main(String args[]){
		Scanner read = new Scanner(System.in);
		System.out.println("digite o valor a ser multiplicado por 10");
		int m = read.nextInt();
		System.out.println( m + " x 10 ="+ (m*10));
		System.out.println("digite o valor a ser dividido por 2");
		double d = read.nextDouble();
		System.out.println( d + " / 2 ="+ (d/2));
		System.out.println("Dividindo 10 por 2 = " + d);
		
		System.out.println("Digite o ");
		int r = 10 % 3;
		System.out.println("Resto da divisão 10/3=" + r);
		int i = m++;
		System.out.println("Incrementando " + i + " em 1 = " + m);
}
}
