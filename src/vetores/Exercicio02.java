package vetores;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int matrizInteiros[] = new int[10];
		int soma = 0, media;
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite um número: ");
			matrizInteiros[i] = leia.nextInt();
		}

		System.out.println("Elementos nos índices ímpares: ");
		for (int i = 0; i < matrizInteiros.length; i++) {
			soma += matrizInteiros[i];
			if (i % 2 == 1) {
				System.out.println(matrizInteiros[i]);
			}
		}

		System.out.println("Elementos nos índices pares: ");
		for (int i = 0; i < matrizInteiros.length; i++) {
			if (i % 2 == 0) {
				System.out.println(matrizInteiros[i]);
			}
		}

		System.out.println("Soma: " + soma + "\n" + "Média: " + soma / 10);
	}
}
