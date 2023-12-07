package exercicios02;

import java.util.Scanner;

public class ExSomaMaior {

	public static void main(String[] args) {
		int n1, n2, n3, soma;
		
		System.out.print("N1: ");
		Scanner leiaN1 = new Scanner(System.in);
		n1 = leiaN1.nextInt();
		
		System.out.print("N2: ");
		Scanner leiaN2 = new Scanner(System.in);
		n2 = leiaN1.nextInt();
		
		System.out.print("N3: ");
		Scanner leiaN3 = new Scanner(System.in);
		n3 = leiaN1.nextInt();
		
		soma = n1 + n2;
		
		if(soma > n3){
			System.out.println("A soma de A + B é maior que C");
		} else {
			System.out.println("A soma de A + B é Menor que C");
		};
	}
}
