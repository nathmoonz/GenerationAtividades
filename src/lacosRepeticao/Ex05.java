package lacosRepeticao;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int numSoma = 0, num;

		do {
			System.out.println("Informe um número: ");
			
			num = leia.nextInt();
			if(num > 0) {
				numSoma += num;
			}
			
		} while (num != 0);
		
		System.out.println("A soma de todos os números informados é: " + numSoma);
	}

}
