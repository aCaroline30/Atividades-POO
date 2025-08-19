package Lista3;

//19. Faça um programa que mostre todos os primos entre 1 e N sendo N um número inteiro
//fornecido pelo usuário. O programa deverá mostrar também o número de divisões que ele
//executou para encontrar os números primos.

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		int divisoes = 0;
		
		System.out.println("Informe um número: ");
		int num = input.nextInt();
		
		System.out.println("Números primos entre 1 e " + num + ": ");
		
		for (int i = 2; i <= num; i++) {
			int ContDiv = 0;
			for (int j = 2; j < i; j++) {
				divisoes++;
				if (i % j == 0) {
					ContDiv++;
					break;
				}
			}
			
			if (ContDiv == 0) {
				System.out.print(i + " ");
				
			}
		} System.out.println("Número total de divisões executadas: " + divisoes);
		
		input.close();

	}

}
