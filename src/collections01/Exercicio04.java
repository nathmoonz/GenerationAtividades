package collections01;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercicio04 {

	public static void main(String[] args) {
		Set<Integer> setNumeros = new HashSet<Integer>();
		int findNumber;
		Scanner leia = new Scanner(System.in);
		
		setNumeros.add(3);
		setNumeros.add(2);
		setNumeros.add(5);
		setNumeros.add(8);
		setNumeros.add(9);
		setNumeros.add(10);
		setNumeros.add(7);
		setNumeros.add(1);
		setNumeros.add(4);
		setNumeros.add(6);
		
		System.out.println("Qual número você quer encontrar ?: ");
		findNumber = leia.nextInt();
		
		if(setNumeros.contains(findNumber)) {
			System.out.println("O " + findNumber + " foi encontrado");
		} else {
			System.out.println("O " + findNumber + " não foi encontrado");
		}
		
		

	}

}
