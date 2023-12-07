package exercicios02;

import java.util.Scanner;

public class VeirifcarParImpar {

	public static void main(String[] args) {
		int num;
		
		System.out.print("Número: ");
		Scanner leiaNum = new Scanner(System.in);
		num = leiaNum.nextInt();
		
		if(num >= 0 && num % 2 == 0) {
			System.out.println(num + " É um número par e positivo");
		}
		
		if(num < 0 && num % 2 == 0) {
			System.out.println(num + " É um número par e negativo");
		}
		
		if(num >= 0 && num % 2 == 1) {
			System.out.println(num + " É um número positivo e ímpar");
		}
		
		if(num < 0 && num % 2 < 0) {
			System.out.println(num + " É um número negativo e ímpar");
		}
	}
}
