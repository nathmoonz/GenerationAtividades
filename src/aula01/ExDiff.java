package aula01;

import java.util.Scanner;

public class ExDiff {

	public static void main(String[] args) {
		float n1,n2,n3,n4,calculo;
		
		System.out.print("N1: ");
		Scanner leiaN1 = new Scanner(System.in);
		n1 = leiaN1.nextFloat();
		
		System.out.print("N2: ");
		Scanner leiaN2 = new Scanner(System.in);
		n2 = leiaN1.nextFloat();
		
		System.out.print("N3: ");
		Scanner leiaN3 = new Scanner(System.in);
		n3 = leiaN1.nextFloat();
		
		System.out.print("N4: ");
		Scanner leiaN4 = new Scanner(System.in);
		n4 = leiaN1.nextFloat();
		
		calculo = (n1 * n2) - (n3 * n4);
		
		System.out.println("Calculo de diferença é: " + calculo);
		
		

	}

}
