package collections01;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		ArrayList<Integer> listaNumeros = new ArrayList<Integer>();
		Scanner leia = new Scanner(System.in);
		int numeroAencontrar;
		listaNumeros.add(14);
		listaNumeros.add(34);
		listaNumeros.add(54);
		listaNumeros.add(23);
		listaNumeros.add(67);
		listaNumeros.add(3);
		listaNumeros.add(87);
		listaNumeros.add(55);
		listaNumeros.add(33);
		listaNumeros.add(26);
		listaNumeros.add(5);

		System.out.println("Digite o número que você deseja encontrar: ");
		numeroAencontrar = leia.nextInt();
		if (listaNumeros.indexOf(numeroAencontrar) >= 0) {
			System.out.println(
					"O " + numeroAencontrar + " está localizado na posição " + listaNumeros.indexOf(numeroAencontrar));
		} else {
			System.out.println("O " + numeroAencontrar + " Não foi encontrado");
		}

	};

}
