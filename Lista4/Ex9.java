package Lista4;

//Faça um programa que peça um texto e coloque-o em um vetor onde cada carácter ocupará
//uma posição do vetor.

import java.util.Scanner;

public class Ex9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Informe a quantidade de caracteres do texto: ");
		int caracteres = input.nextInt();
		input.nextLine();
		
		char vetor[] = new char[caracteres];
		
		for (int i = 0; i < caracteres; i++) {
			System.out.print((i+1) + "° caracter: ");
			vetor[i] = input.nextLine().charAt(0);
			
		}
		System.out.println("Texto digitado:");
		for (int i = 0; i < caracteres; i++) {
			System.out.print(vetor[i]);
		
			
		}
		
		input.close();
	}
	
}
