package Lista3;

//7. Faça um programa que receba dois números inteiros e gere os números inteiros que estão
//no intervalo compreendido por eles.

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
	System.out.println("Informe um número inicial: ");
	int a = input.nextInt();
	System.out.println("Informe um número final: ");
	int b = input.nextInt();
	
	int menor = Math.min(a, b);
	int maior = Math.max(a, b);
	
	for (int i = menor; i <= maior; i++) {
		System.out.println(i);
		
	}
		
	input.close();
	}

}
