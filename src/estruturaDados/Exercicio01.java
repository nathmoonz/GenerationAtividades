package estruturaDados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Queue<String> filaClientes = new LinkedList<String>();
		int optionMenu = 0;
		String nomeCliente;

		do {

			System.out.println("******************************");
			System.out.println("      1 - Adicionar Clientes na Fila");
			System.out.println("      2 - Listar todos os Clientes");
			System.out.println("      3 - Retirar Cliente da Fila");
			System.out.println("      0 - Sair");
			System.out.println("******************************");
			System.out.print("Entre com a opção desejada: ");
			optionMenu = leia.nextInt();
			if (optionMenu > 3) {
				System.out.println("Opção Inválida!");
				optionMenu = 0;
			}

			switch (optionMenu) {
			case 1:
				System.out.print("Insira o nome do cliente: ");
				leia.nextLine();
				nomeCliente = leia.nextLine();
				filaClientes.add(nomeCliente);
				System.out.println("Cliente " + nomeCliente + " adicionado!\n");
				break;
			case 2:
				if (!filaClientes.isEmpty()) {
					System.out.println("Fila: ");
					for (String cliente : filaClientes) {
						System.out.println(cliente);
					}
				} else {
					System.out.println("Fila está vazia\n");
				}
				break;
			case 3:
				System.out.println("O(a) cliente " + filaClientes.remove() + " foi chamado!\n");
				break;
			case 0:
				System.out.println("Programa Finalizado");
				break;
			}

		} while (optionMenu != 0);

	}

}
