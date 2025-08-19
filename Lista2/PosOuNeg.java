package Lista2;
//2. Faça um Programa que peça um valor e mostre na tela se o valor é positivo, negativo ou zero.

import java.util.Scanner;

public class PosOuNeg {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		float num;
		
		System.out.println("Insira um número: ");
		num = input.nextFloat();
		
		if (num == 0) {
			System.out.println("Número é igual a 0");
		} else {
			if (num > 0) {
				System.out.println("O número é positivo");
			} else {
				System.out.println("O número é negativo");
			}
		}
		
		input.close();

	}

}
