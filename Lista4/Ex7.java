package Lista4;

//7. Faça um Programa que leia um vetor de 5 números inteiros, mostre a soma, a multiplicação
//e os números.

import java.util.Scanner;

public class Ex7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		float num[] = new float [5];
		float multiplicacao = 1;
		float soma = 0;
		
		for (int i = 0; i <5; i++) {
						
		System.out.println("Informe o " + (i+1) + "° número: ");
			num[i] = input.nextFloat();
		
		 soma += num[i];
		 multiplicacao *= num[i];
		
		}
		System.out.println("Números informados: ");
		for (int i = 0; i <5; i++) {
			System.out.print(num[i] + " ");
		
		}
		System.out.println("");
		System.out.println("Multiplicação dos números: " + multiplicacao);
		System.out.println("Soma dos números: " + soma);
		input.close();
	}
}
