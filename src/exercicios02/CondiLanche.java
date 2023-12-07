package exercicios02;

import java.util.Scanner;

public class CondiLanche {

	public static void main(String[] args) {
		int opcaoMenu, qtdItem;
		float precoItem = 0, precoTot;
		String item = null;

		System.out.println("------MENU------");
		System.out.println("1 - Cachorro Quente (R$ 10.00)");
		System.out.println("2 - X-Salada (R$ 15.00)");
		System.out.println("3 - X-Bacon (R$ 18.00)");
		System.out.println("4 - Bauru (R$ 12.00)");
		System.out.println("5 - Refrigerante (R$ 8.00)");
		System.out.println("6 - Suco de Laranja (R$ 13.00)");
		System.out.println("-------------------");

		System.out.print("Escolha o item do menu: ");
		Scanner leiaItem = new Scanner(System.in);
		opcaoMenu = leiaItem.nextInt();

		switch (opcaoMenu) {
		case 1:
			item = "Cachorro Quente";
			precoItem = 10;
			break;
		case 2:
			item = "X-Salada";
			precoItem = 15;
			break;
		case 3:
			item = "X-Bacon";
			precoItem = 18;
			break;
		case 4:
			item = "Bauru";
			precoItem = 12;
			break;
		case 5:
			item = "Refrigerante";
			precoItem = 8;
			break;
		case 6:
			item = "Suco de Laranja";
			precoItem = 13;
			break;
		}
		;

		System.out.print("Qual a quantidade de " + item + " ?");
		Scanner leiaQtd = new Scanner(System.in);
		qtdItem = leiaQtd.nextInt();

		precoTot = precoItem * qtdItem;

		System.out.printf("Você escolheu %d-%s Preço Total a pagar: R$ %.2f", qtdItem, item, precoTot);
	}

}
