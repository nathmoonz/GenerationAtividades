package lacosRepeticao;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		float numSoma = 0, num, contador = 0;

		do {
			
			System.out.println("Informe um número: ");
			
			num = leia.nextFloat();
			if(num % 3 == 0 && num != 0) {
				numSoma += num;
				contador++;
			} 

		} while (num != 0);
		
		System.out.println("A média de todos os números múltiplos de 3 é " + numSoma/contador);

	}

}
