package Lista4;

//4. Faça um Programa que leia um vetor de 10 caracteres, e diga quantas consoantes foram
//lidas. Imprima as consoantes.

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		final int TAM = 10;
		char letra[] = new char[TAM];
		char consoante[] = new char[TAM];
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Informe a " + (i+1) + "ª letra: ");
			letra[i] = input.next().charAt(0);
			
			if ((letra[i] != 'a') && (letra[i] != 'e') && (letra[i] != 'i') && (letra[i] != 'o') && (letra[i] != 'u') 
				&& (letra[i] != 'A') && (letra[i] != 'E') && (letra[i] != 'I') && (letra[i] != 'O') && (letra[i] != 'U') ) {
				consoante[i] = letra[i];
			}
		}	
		System.out.println("Consoantes:");
		for (int i = 0; i < 10; i++) {
			System.out.print(consoante[i] + " ");	
			}
		
		input.close();
		
	}
}
