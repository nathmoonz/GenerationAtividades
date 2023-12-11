package vetores;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int matrizInteiros[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		int numero, indiceNumero = 0;
		boolean temNumero = false;
		
		System.out.println("Insira um número a verificar se existe na matriz: ");
		numero = leia.nextInt();
		
		for(int i = 0; i < matrizInteiros.length;i++) {
			if(numero == matrizInteiros[i]) {
				indiceNumero = i;
				temNumero = true;
			} else {
				temNumero = false;
			}
		};
		
		if(temNumero == true) {
			System.out.println(numero + " está localizado na posição " + indiceNumero);
		} else {
			System.out.println("O número " + numero + " não foi encontrado");
		}
	}

}
