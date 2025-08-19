package Lista3;

//1. Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor
//seja inválido e continue pedindo até que o usuário informe um valor válido.

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int x;
		
		do {
			
			
			
			System.out.println("Informe um número entre 0 e 10: ");
			x = input.nextInt();
		
		
			if (!(x >= 0 && x <= 10)) {
				System.out.println("Número inválido");
			}
			
			
				} while (!(x >= 0 && x <= 10));
				System.out.println("Ok");
				
		input.close();
	}
}
