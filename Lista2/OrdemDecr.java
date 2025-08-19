package Lista2;

import java.util.Scanner;

public class OrdemDecr {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		float a, b, c;
		float maior, menor, meio;
		
		System.out.println("Informe o  primeiro número: ");
		a = input.nextFloat();
		System.out.println("Informe o  segundo número: ");
		b = input.nextFloat();
		System.out.println("Informe o  terceiro número: ");
		c = input.nextFloat();
		
		if (a >= b && a >= c) {
			maior = a;
			if (b >= c) {
				meio = b;
				menor = c;
			} else {
				meio = c;
				menor = b;
			}
		} else if (b >= a && b >= c){
			maior = b;
			if (a >= c) {
				meio = a;
				menor = c;
			} else {
				meio = c;
				menor = a;
			}
		} else {
			maior = c;
			 if (a >= b) {
			meio = a;
			menor = b; 
				} else {
					meio = a;
					menor = b;
				
				}
		}
		System.out.println("Ordem decrescente: " + maior + ", " + meio + ", " + menor);
				
		input.close();		
		}
}

