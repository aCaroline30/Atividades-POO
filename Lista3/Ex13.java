package Lista3;

//13. Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.

import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Escolha um número: ");
		int num = input.nextInt();
		
		int fatorial = 1;
		
		for (int i = 1; i < num; i++) {
			fatorial = fatorial + (fatorial * i);  
		} System.out.println(num + "! = " + fatorial);
		input.close();
	}
}
