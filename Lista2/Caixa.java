package Lista2;

import java.util.Scanner;

public class Caixa {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);

	        
	        System.out.print("Digite o valor para saque (mínimo R$10 e máximo R$600): ");
	        int valor = input.nextInt();

	     
	        if (valor < 10 || valor > 600) {
	            System.out.println("Valor inválido, digite um valor entre R$10 e R$600.");
	        } else {
	            int resto = valor;

	            int nota100 = resto / 100;
	            resto %= 100;

	            int nota50 = resto / 50;
	            resto %= 50;

	            int nota10 = resto / 10;
	            resto %= 10;

	            int nota5 = resto / 5;
	            resto %= 5;

	            int nota1 = resto;

	           
	            System.out.println("Notas fornecidas:");
	            if (nota100 > 0) System.out.println(nota100 + " nota(s) de R$100");
	            if (nota50 > 0) System.out.println(nota50 + " nota(s) de R$50");
	            if (nota10 > 0) System.out.println(nota10 + " nota(s) de R$10");
	            if (nota5 > 0) System.out.println(nota5 + " nota(s) de R$5");
	            if (nota1 > 0) System.out.println(nota1 + " nota(s) de R$1");
	        }

	        input.close();

	}

}
