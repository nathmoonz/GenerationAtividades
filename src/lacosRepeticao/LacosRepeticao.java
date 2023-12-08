package lacosRepeticao;

import java.util.Scanner;

public class LacosRepeticao {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int n1, n2;

		System.out.print("Informe o primeiro número: ");
		n1 = leia.nextInt();
		System.out.print("Informe o segundo número: ");
		n2 = leia.nextInt();

		if (n1 < n2) {
			for (int i = n1; i < n2; i++) {
				if (i % 3 == 0 && i % 5 == 0) {
					System.out.println(i + " é multiplo de 3 e 5");
				}
			}
		} else {
			System.out.println("Intervalo Inválido");
		}
	}

}
