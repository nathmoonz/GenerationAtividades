package aula01;

import java.util.Locale;
import java.util.Scanner;

public class ExSalarioLiq {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		float salarioBruto, adcNoturno, horasExt, desc, salarioLiq;
		
		System.out.print("Digite seu Salário Bruto: ");
		Scanner leiaSalarioBruto = new Scanner(System.in);
		salarioBruto = leiaSalarioBruto.nextFloat();
		
		System.out.print("Digite seu Adicional Noturno: ");
		Scanner leiaAdcNoturno = new Scanner(System.in);
		adcNoturno = leiaAdcNoturno.nextFloat();
		
		System.out.print("Digite suas horas extras: ");
		Scanner leiaHoraExt = new Scanner(System.in);
		horasExt = leiaAdcNoturno.nextFloat();
		
		System.out.print("Digite descontos: ");
		Scanner leiaDesc = new Scanner(System.in);
		desc = leiaDesc.nextFloat();
		
		salarioLiq = salarioBruto + adcNoturno + (horasExt * 5) - desc;
		
		
		System.out.printf("Salário Líquido = %.2f", salarioLiq);
	}

}
