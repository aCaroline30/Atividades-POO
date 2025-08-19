package Lista2;
//Faça um Programa que peça dois números e imprima o maior deles.

import java.util.Scanner;

public class maiorNum {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número: ");
		float num1 = input.nextFloat();
		System.out.println("Informe o segundo número: ");
		float num2 = input.nextFloat();
		
		if (num1 > num2) {
			System.out.println(num1 + " é maior");
		
				} if (num2 > num1) {
					System.out.println(num2 + "é maior");
						} if (num1 == num2) {
							System.out.println(num1 + " = " + num2);
				
		input.close();
		}

	}

}
