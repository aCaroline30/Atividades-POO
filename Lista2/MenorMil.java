package Lista2;
//22. Faça um Programa que leia um número inteiro menor que 1000 e imprima a quantidade
//de centenas, dezenas e unidades do mesmo.

import java.util.Scanner;

public class MenorMil {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);

	        System.out.println("Digite um número inteiro menor que 1000: ");
	        int numero = input.nextInt();

	        if (numero < 0 || numero >= 1000) {
	            System.out.println("Número inválido, digite um número entre 0 e 999.");
	        } else {
	            int centenas = numero / 100;
	            int dezenas = (numero % 100) / 10;
	            int unidades = numero % 10;

	            System.out.println(numero + " = " + centenas + " centena(s), " 
	                               + dezenas + " dezena(s) e " 
	                               + unidades + " unidade(s).");
	        }

	        input.close();
	        
	}

}
