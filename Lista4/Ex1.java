package Lista4;

//1. Faça um Programa que leia um vetor de 5 números inteiros e mostre-os.

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num[] = new int [5];
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Insira o " + (i+1) + "° número: " );
			num[i] = input.nextInt();
		}
		System.out.println("Números inseridos:");
		for (int i = 0; i < 5; i++) {
			System.out.print(num[i] + " ");
		}
		
		input.close();
		
	}

}
