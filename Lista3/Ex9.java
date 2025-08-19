package Lista3;

//9. Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro
//entre 1 a 10. O usuário deve informar de qual numero ele deseja ver a tabuada.

import java.util.Scanner;

public class Ex9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Gerador de tabuada, escolha um número entre 1 e 10: ");
		int num = input.nextInt();
		
		int i;
		
		if (num <=0 || num > 10) {
			System.out.println("Número inválido");
		} else {
			for (i = 1; i <= 10; i++) {
				System.out.println(num + " x " + i + " = " + (num * i));
				
			}
		}
		
		input.close();
	}
}
