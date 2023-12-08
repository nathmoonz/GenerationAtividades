package lacosRepeticao;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int idade, numeroPessoas = 0, idadeTotal = 0, opicaoGenero, cargo;
		int mulherCis = 0, homemCis = 0, naoBi = 0, homemTrans = 0, mulherTrans = 0, mulherFrontend =0, homemMobile = 0;
		int backend = 0, frontend = 0, mobile = 0, fullstack = 0, naobiDevFullStack = 0;
		String cond = "s";

		while (!cond.equals("n")) {
			System.out.println("Informe a idade do colaborador: ");
			idade = leia.nextInt();
			idadeTotal += idade;
			System.out.println("Identidade de Gênero do Colaborador: \n" + "1 - Mulher Cis \n" + "2 - Homem Cis \n"
					+ "3 - Não Binário \n" + "4 - Mulher Trans \n" + "5 - Homem Trans \n" + "6 - Outros \n");
			opicaoGenero = leia.nextInt();
			switch (opicaoGenero) {
			case 1:
				mulherCis++;
				break;
			case 2:
				homemCis++;
				break;
			case 3:
				naoBi++;
				break;
			case 4:
				mulherTrans++;
				break;
			case 5:
				homemTrans++;
				break;
			default:
				System.out.println("Opção Inválida");
				break;
			}
			System.out.println("Pessoa desenvolvedora: \n" + "1 - Backend \n" + "2 - Frontend \n" + "3 - Mobile \n"
					+ "4 - FullStack \n");
			cargo = leia.nextInt();

			switch (cargo) {
			case 1:
				backend++;
				break;
			case 2:
				frontend++;
				if(opicaoGenero == 1 && opicaoGenero == 4) {
					mulherFrontend++;
				}
				break;
			case 3:
				mobile++;
				if(idade > 40 && opicaoGenero == 2 && opicaoGenero == 5) {
					homemMobile++;
				}
				break;
			case 4:
				fullstack++;
				if(idade > 30 && opicaoGenero == 3) {
					naobiDevFullStack++;
				}
				break;
			default:
				System.out.println("Opção Inválida");
				break;
			}

			numeroPessoas++;
			System.out.println("continuar ?");
			cond = leia.next();
		}
		
		System.out.println("Número de pessoas desenvolvedoras Backend: " + backend);
		System.out.println("Número de Mulheres Cis e Trans desenvolvedoras Frontend " + mulherFrontend);
		System.out.println("O número de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos " + homemMobile);
		System.out.println("O número de Não Binários desenvolvedores FullStack menores de 30 anos " + naobiDevFullStack);
		System.out.println("O número total de pessoas que responderam á pesquisa: " + numeroPessoas);
		System.out.println("A média de idade das pessoas que responderam à pesquisa: " + idadeTotal/numeroPessoas);

	}

}
