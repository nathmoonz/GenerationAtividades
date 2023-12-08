package lacosRepeticao;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int cond = 1, maior = 0, menor = 0, idade;

		while (cond == 1) {
			System.out.println("Insira uma idade: ");
			idade = leia.nextInt();

			if (idade < 21) {
				menor++;
			} else if (idade > 50) {
				maior++;
			}

			System.out.println("Insira 1 para inserir uma idade ou 0 para parar");
			cond = leia.nextInt();
		}

		System.out.println("Total de pessoas menores de 21 anos: " + menor);
		System.out.println("Total de pessoas maiores de 21 anos: " + maior);

	}

}
