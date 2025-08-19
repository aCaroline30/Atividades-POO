package Lista3;

//18. Altere o programa de cálculo dos números primos, informando, caso o número não seja
//primo, por quais número ele é divisível.

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe um número: ");
		int num = input.nextInt();
		if (num % 2 != 0 && num % 3 != 0 && num % 5 != 0) {
			
			System.out.println(num + " é um número primo");
			
		} else if (num % 2 == 0) { 
			System.out.println(num + " é divisível por 2");
		} else {
			System.out.println(num + " é divisível por 3");
		}input.close();

	}

}
