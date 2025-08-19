package Lista3;

//15. Mostre e calcule a série S = (37*38)/1 + (36*37)/2 + (35*36)/3 + ... + (1*2)/37.

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		
		int num1 = 37;
		int num2 = 38;
		int denominador = 1;
		float soma = 0; 
		
		for (int i = 1; i <= 37; i++) {
			soma = soma + ((num1 * num2)/denominador);
			num1 = num1 - 1;
			num2 = num2 - 1;
			denominador = denominador + 1;
		} System.out.println("Soma total da série S = (37*38)/1 + (36*37)/2 + (35*36)/3 + ... + (1*2)/37. = " + soma);
		input.close();
	} 

}
