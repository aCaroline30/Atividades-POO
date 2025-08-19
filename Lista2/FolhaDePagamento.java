package Lista2;

import java.util.Scanner;

public class FolhaDePagamento {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float valorHora;
		int horasTra;
		
		System.out.println("Informe quanto você recebe por hora: ");
		valorHora = input.nextFloat();
		System.out.println("Informe quantas horas você trabalha por mês: ");
		horasTra = input.nextInt();
		
		float salarioBruto = valorHora * horasTra;
		
		 float percentualIR;
	        if (salarioBruto <= 900) {
	            percentualIR = 0;
	        } else if (salarioBruto <= 1500) {
	            percentualIR = 0.05f;
	        } else if (salarioBruto <= 2500) {
	            percentualIR = 0.10f;
	        } else {
	            percentualIR = 0.20f;
	        }
	        float valorIR = salarioBruto * percentualIR;
	        float valorINSS = salarioBruto * 0.10f;
	        float valorSindicato = salarioBruto * 0.03f;
	        float valorFGTS = salarioBruto * 0.11f;
	        
	        float totalDescontos = valorIR + valorINSS + valorSindicato;
	        float salarioLiquido = salarioBruto - totalDescontos;

	        System.out.printf("Salário Bruto: : " + salarioBruto);
	        System.out.printf("(-) IR: " + valorIR);
	        System.out.printf("(-) INSS: " + valorINSS);
	        System.out.printf("(-) Sindicato: " + valorSindicato);
	        System.out.printf("FGTS: " + valorFGTS);
	        System.out.printf("Total de descontos: " + totalDescontos);
	        System.out.printf("Salário Líquido: " + salarioLiquido);
	        
	        input.close();
	}

}
