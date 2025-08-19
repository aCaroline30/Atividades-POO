package Lista2;

import java.util.Scanner;

public class Reajuste {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe seu salário: ");
		float salario = input.nextFloat();
		
		float reajuste;
		
		  if (salario <= 280.0) {
	            reajuste = 0.20f;
	        } else if (salario <= 700.0) {
	            reajuste = 0.15f;
	        } else if (salario <= 1500.0) {
	            reajuste = 0.10f;
	        } else {
	            reajuste = 0.05f;
	        }
		  
		float aumento = salario * reajuste;
		float salarioAumento = salario + aumento;
		
		  
	        System.out.println("Salário antes do reajuste: " + salario + "R$");
	        System.out.println("Percentual de aumento: " + reajuste + "%");
	        System.out.println("Valor do aumento: " + aumento + "R$");
	        System.out.println("Novo salário: " + salarioAumento + "R$");

	        input.close();
	}

}
