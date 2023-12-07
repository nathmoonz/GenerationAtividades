package exercicios02;

import java.util.Scanner;

public class exCargo {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		String nome;
		int opcao, percentual = 0;
		float salario, novoSalario;

		System.out.println("Qual o nome do Colaborador ? ");
		nome = leia.nextLine();

		System.out.println("Informe o código do cargo de " + nome);
		System.out.println("1 --- Gerente");
		System.out.println("2 --- Vendedor");
		System.out.println("3 --- Supervisor");
		System.out.println("4 --- Motorista");
		System.out.println("5 --- Estoquista");
		System.out.println("6 --- Técnico de TI");
		opcao = leia.nextInt();

		switch (opcao) {
		case 1:
			percentual = 10;
			break;
		case 2:
			percentual = 7;
			break;
		case 3:
			percentual = 9;
			break;
		case 4:
			percentual = 6;
			break;
		case 5:
			percentual = 5;
			break;
		case 6:
			percentual = 8;
			break;
		default:
			System.out.println("Número inválido");
		}
		
		System.out.println("Qual o salário ?: ");
		salario = leia.nextFloat();
		
		novoSalario = salario + (percentual * salario);
		
		System.out.printf("Nome do colaborador: %s, Cargo: %d, Salário: R$ %.2f", nome, opcao, novoSalario);
	}
}
