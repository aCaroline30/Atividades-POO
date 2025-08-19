package Lista3;

//17. Faça um programa que peça um número inteiro e determine se ele é ou não um número
//primo. Um número primo é aquele que é divisível somente por ele mesmo e por 1.

import java.util.Scanner;

public class Ex17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe um número: ");
		int num = input.nextInt();
		if (num % 2 != 0 && num % 3 != 0 && num % 5 != 0) {
			
			System.out.println(num + " é um número primo");
			
		} else {
			System.out.println(num + " não é um número primo");
		}input.close();
	}

}
