package Lista4;

//3. Faça um Programa que leia 4 notas, mostre as notas e a média na tela.

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		float notas[] = new float[4];
		float soma = 0;
		float media;
		
		for (int i = 0; i < 4; i++) {
			System.out.println("Informe a " + (i+1) + "ª nota: ");
			notas[i] = input.nextFloat();
			soma += notas[i];
		}
		
		media = soma/4;
		
		System.out.println("Notas:");
		for (int i = 0; i < 4; i++) {
			System.out.print(notas[i] + " ");
		}
		
		System.out.print("Média: " + media);
		input.close();
	}
}
