package Lista2;

import java.util.Scanner;

public class Bhaskara {

	public static void main(String[] args) {
		
		  Scanner input = new Scanner(System.in);

	        System.out.print("Digite o valor de A: ");
	        float a = input.nextFloat();

	        if (a == 0) {
	            System.out.println("O valor de A não pode ser zero");
	            input.close();
	            return;
	        }

	        System.out.println("Digite o valor de B: ");
	        float b = input.nextFloat();

	        System.out.print("Digite o valor de C: ");
	        float c = input.nextFloat(); 

	        float delta = b * b - 4 * a * c;

	        if (delta < 0) {
	            System.out.println("Delta = " + delta + ". A equação não possui raízes reais.");
	        } 
	        else if (delta == 0) {
	            float raiz = -b / (2 * a);
	            System.out.println("Delta = " + delta + ". A equação possui apenas uma raiz real:");
	            System.out.println("Raiz: " + raiz);
	        } 
	        else {
	            float raiz1 = (float)(-b + Math.sqrt(delta)) / (2 * a);
	            float raiz2 = (float)(-b - Math.sqrt(delta)) / (2 * a);
	            System.out.println("Delta = " + delta + ". A equação possui duas raízes reais:");
	            System.out.println("Raiz 1: " + raiz1);
	            System.out.println("Raiz 2: " + raiz2);
	        }

	        input.close();

	}

}
