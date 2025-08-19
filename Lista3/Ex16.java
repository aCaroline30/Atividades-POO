package Lista3;

//16. Faça um programa que, dado um conjunto de N números, determine o menor valor, o
//maior valor e a soma dos valores.

import java.util.Scanner;

public class Ex16 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe quantos elementos tem o conjunto: ");
		int n = input.nextInt();
		
		System.out.println("Informe o 1° número do conjunto: ");
		float maior = input.nextFloat();
		float menor = maior;
		
		for (int i = 2; i <= n; i++) {
			System.out.println("Informe o " + i + "° do conjunto: ");
				float cont = input.nextFloat();
				if (cont > maior) {
					maior = cont;
				}
				if (cont < menor) {
					menor = cont;
				}
		}System.out.println("Maior: " + maior);
		System.out.println("Menor: " + menor);
		input.close();
	}
}
