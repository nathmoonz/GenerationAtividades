package collections01;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exercicio03 {

	public static void main(String[] args) {
		Set<Integer> setNumeros = new HashSet<Integer>();
		Scanner leia = new Scanner(System.in);
		int numero;
		
		for(int i = 0; i < 10 ; i++) {
			System.out.print("Insira o " + (i+1) + "° número: ");
			numero = leia.nextInt();
			setNumeros.add(numero);
		}
		
		Iterator<Integer> isetNumeros = setNumeros.iterator();
		
		while(isetNumeros.hasNext()) {
			System.out.println(isetNumeros.next());
		}

	}

}
