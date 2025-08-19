package Lista1;

import java.util.Scanner;

public class salarioImpostp {
//14.Faça um Programa que pergunte quanto você ganha por hora e o número de horas
	//trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês, sabendo-se
	//que são descontados 11% para o Imposto de Renda, 8% para o INSS e 5% para o
	//sindicato, faça um programa que nos dê:
	//a. salário bruto.
	//b. quanto pagou ao INSS.
	//c. quanto pagou ao sindicato.
	//d. o salário líquido.
	//e. calcule os descontos e o salário líquido, conforme a tabela abaixo:
	//f. + Salário Bruto : R$
	//g. - IR (11%) : R$
	//h. - INSS (8%) : R$
	//i. - Sindicato ( 5%) : R$
	//j. = Salário Liquido : R$
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		float valor;
		
		int horas;
		 
		
		System.out.println("Informe qual o valor que recebe por hora: ");
		valor = input.nextFloat();
		System.out.println("Informe quantas horas trabalha por mês: ");
		horas = input.nextInt();
		
		float salario = valor * horas;
		
		System.out.println("Salário bruto: " + salario + "R$ por mês");
		System.out.println("Valor pago ao INSS: " + (salario * 0.08) + "R$");
		System.out.println("Valor pago ao sindicato: " + (salario * 0.05) + "R$");
		System.out.println("Valor cobrado do imposto de renda: " + (salario * 0.11) + "R$");
		System.out.println("Valor do salário líquido: " + (salario -(salario * 0.08)-(salario * 0.05)-(salario * 0.11)) + "R$");
		
		input.close();

	}

}
