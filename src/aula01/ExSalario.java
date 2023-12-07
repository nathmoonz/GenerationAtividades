package aula01;

import java.util.Scanner;

public class ExSalario {

	public static void main(String[] args) {
		
		float salario, abono;
		System.out.print("Digite o salário: ");
		Scanner salario1 = new Scanner(System.in);
		salario = salario1.nextFloat();	
		System.out.print("Digite o abono: ");
		Scanner abono2 = new Scanner(System.in);
		abono = abono2.nextFloat();
		
		System.out.printf("Seu novo salário é de: %.2f", abono);
		
	}

}
