package lacosRepeticao;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int num, pares = 0, impares = 0;
		
		for (int i = 1; i <= 10; i++) {
			System.out.print("Digite o " + i + "º número ");
			num = leia.nextInt();
			
			if(num % 2 == 0) {
				pares++;
			} else {
				impares++;
			}
		}
		
		System.out.println("Quantidade de número pares " + pares);
		System.out.println("Quantidade de número impares " + impares);

	}

}
