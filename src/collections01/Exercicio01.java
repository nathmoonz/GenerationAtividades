package collections01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		ArrayList<String> cores = new ArrayList<String>();
		String cor;
		Scanner leia = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Insira uma cor: ");
			cor = leia.nextLine();
			cores.add(cor);
		}
		
		System.out.println("Cores listadas: ");	
		for(String cadaCor: cores) {
			System.out.println(cadaCor);
		}
		
		Collections.sort(cores);
		
		System.out.println("Cores ordenadas: ");	
		for(String cadaCor: cores) {
			System.out.println(cadaCor);
		}

	}

}
