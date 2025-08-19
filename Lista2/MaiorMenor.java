package Lista2;

import java.util.Scanner;

//10.Faça um Programa que leia três números e mostre o maior e o menor deles.

public class MaiorMenor {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float a, b, c;
		float maior, menor;
		
		System.out.println("Informe o  primeiro número: ");
		a = input.nextFloat();
		System.out.println("Informe o  segundo número: ");
		b = input.nextFloat();
		System.out.println("Informe o  terceiro número: ");
		c = input.nextFloat();
		
		if (a >= b && a >= c) {
			maior = a;
			if (b >= c) {
				menor = c;
				
			} else {
				
				menor = b;
			}
		} else if (b >= a && b >= c){
			maior = b;
			if (a >= c) {
				menor = c;
			} else {
				menor = a;
			}
		} else {
			maior = c;
			 if (a >= b) {
			menor = b; 
				} else {
					menor = a;
				
				}
		}
		System.out.println("Maior: " + maior);
		System.out.println("Menor: " + menor);
				
		input.close();	

	}

}
