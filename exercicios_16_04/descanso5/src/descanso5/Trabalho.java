package descanso5;

import java.util.Scanner;

public class Trabalho {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		System.out.println("digite o valor de horas trabalhdas");
		int horas = read.nextInt();
		System.out.println("digite o valor por hora trabalhada");
		double valor = read.nextDouble();
		System.out.println("O seu salário é de R$:"+ (horas*valor));
	}

}
