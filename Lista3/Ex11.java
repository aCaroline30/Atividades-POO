package Lista3;

//11. Faça um programa que peça 10 números inteiros, calcule e mostre a quantidade de
//números pares e a quantidade de números impares.

import java.util.Scanner;

public class Ex11 {
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		
		int pares = 0;
		int impares = 0;
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("Informe o " + i + " número: ");
			int num = input.nextInt();
			if (num % 2 == 0) {
				pares = pares + 1;
			} else {
				impares = impares + 1;
			}
		} System.out.println("Total de números pares: " + pares);
		  System.out.println("Total de números ímpares: " + impares);
		  input.close();
	}

}
