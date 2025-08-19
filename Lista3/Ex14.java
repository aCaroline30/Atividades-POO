package Lista3;

//14. Faça um programa que mostre os n termos da Série a seguir:
//• S = 1/1 + 2/3 + 3/5 + 4/7 + 5/9 + ... + n/m.

import java.util.Scanner;

public class Ex14 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Escolha um termo da sequência: ");
		int n = input.nextInt();
		
		int denominador = 1;
		int numerador = 1;
		
		if (n >= 1) {
			System.out.print(numerador + "/" + denominador + " ");
		}
		
		for (int i = 2; i <= n; i++) {
			denominador = denominador + 2;
			numerador = numerador + 1;
		System.out.print(numerador + "/" + denominador + " ");	
		} input.close();
	}
}
