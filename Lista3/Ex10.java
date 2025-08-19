package Lista3;

//10. Faça um programa que peça dois números, base e expoente, calcule e mostre o primeiro
//número elevado ao segundo número. Não utilize a função de potência da linguagem.

import java.util.Scanner;

public class Ex10 {
	public static void main (String[] args) {
	
		int contador = 1;
		int resultado = 1;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Informe um número de base: ");
		int base = input.nextInt();
		System.out.println("Informe um número para expoente: ");
		int expo = input.nextInt();
		
		do {
			resultado = resultado * base;
			contador = contador + 1;
		} while (contador <= expo);
		System.out.println(base + " elevado a " + expo + " = " + resultado);
		
		input.close();
	} 
}
