package estruturaDados;
import java.util.Scanner;
import java.util.Stack;

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		Stack<String> pilhaLivros = new Stack<String>();
		int optionMenu = 0;
		String nomeLivro;

		do {
			System.out.println("******************************");
			System.out.println("      1 - Adicionar livro na pilha");
			System.out.println("      2 - Listar todos os livros");
			System.out.println("      3 - Retirar livro da pilha");
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
				System.out.print("Insira o nome do livro: ");
				leia.nextLine();
				nomeLivro = leia.nextLine();
				pilhaLivros.push(nomeLivro);
				System.out.println("Livro " + nomeLivro + " adicionado!\n");
				break;
			case 2: 
				if(!pilhaLivros.isEmpty()) {
					System.out.println("Pilha: ");
					for(String livro: pilhaLivros) {
						System.out.println(livro);
					}
				} else {
					System.out.println("Pilha está vazia\n");
				}
				break;
			case 3:
				if(pilhaLivros.isEmpty()) {
					System.out.println("Não há nenhum livro para ser retirado");
				} else {
				System.out.println("O livro " + pilhaLivros.pop() + " foi retirado!\n");
				}
				break;
			case 0:
				System.out.println("Programa Finalizado");
				break;
			}
			
			
		} while (optionMenu != 0);
		
		 leia.close();

	}

}
