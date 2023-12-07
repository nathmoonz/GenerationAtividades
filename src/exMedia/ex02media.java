package exMedia;

import java.util.Locale;
import java.util.Scanner;

public class ex02media {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		float nota1, nota2, nota3, nota4, media;
		
		System.out.print("Digite sua 1° nota: ");
		Scanner leiaNota1 = new Scanner(System.in);
		nota1 = leiaNota1.nextFloat();
		
		 System.out.print("Digite sua 2° nota: ");
		 Scanner leiaNota2 = new Scanner(System.in);
		 nota2 = leiaNota2.nextFloat();
		 
		 System.out.println("Digite sua 3° nota: ");
		 Scanner leiaNota3 = new Scanner(System.in);
		 nota3 = leiaNota3.nextFloat();
		 
		 System.out.println("Digite sua 4º nota: ");
		 Scanner leiaNota4 = new Scanner(System.in);
		 nota4 = leiaNota4.nextFloat();
		 
		 media = (nota1 + nota2 + nota3 + nota4)/4;
		 System.out.printf("Sua média é %.1f", media);
	}

}
