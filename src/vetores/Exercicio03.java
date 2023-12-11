package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		int aux = 1;
		Scanner leia = new Scanner(System.in);
		double resultadoNotas[] = new double[10];
		double mediaNotas[] = new double[10];
		double notas[][] = new double[10][4];

		
		for (int linha = 0; linha < notas.length; linha++) {
			System.out.println("Digite a nota do " + (linha+1) + "° aluno: ");
			for (int coluna = 0; coluna < 4; coluna++) {
				System.out.println("Nota " + (coluna+1) + ": ");
				notas[linha][coluna] = leia.nextDouble();
			}
			aux++;
		}

		for (int linha = 0; linha < notas.length; linha++) {
			resultadoNotas[linha] = 0;
			for (int coluna = 0; coluna < 4; coluna++) {
				resultadoNotas[linha] += notas[linha][coluna];
			}
		}

		for (int i = 0; i < resultadoNotas.length; i++) {
			mediaNotas[i] = resultadoNotas[i] / 4;
		}
		for (double nota : mediaNotas) {
			System.out.printf("%.1f\n", nota);
		}

	}

}
