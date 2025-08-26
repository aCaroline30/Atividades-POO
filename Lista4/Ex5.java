package Lista4;

//5. Faça um Programa que leia 20 números inteiros e armazene-os num vetor. Armazene os
//números pares no vetor PAR e os números IMPARES no vetor impar. Imprima os três
//vetores.

import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		final int TAM = 20;
		int num[] = new int[TAM];
		int pares[] = new int[TAM];
		int impar[] = new int[TAM];
	
		int contPar = 0;
		int contImpar = 0;
		
		for (int i = 0; i < TAM; i++) {
			System.out.print("Insira o " + (i+1) + "° número: ");
			num[i] = input.nextInt();
			if (num[i] % 2 == 0) {
				pares[contPar] = num[i];
				contPar++;
			
			} else {
				impar[contImpar] = num[i];
				contImpar++;
			}
		}
		System.out.println("Números pares:");
		for (int i = 0; i < contPar; i++) {
			System.out.print(pares[i] + " ");
		}
		System.out.println("");
		System.out.println("Números ímpares:");
		for (int i = 0; i < contImpar; i++) {
			System.out.print(impar[i] + " ");
		}
		
		input.close();
		
	}
	
}
