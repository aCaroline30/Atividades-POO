package Lista4;

//2. Faça um Programa que leia um vetor de 10 números reais e mostre-os na ordem inversa a
//ordem lida.

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num[] = new int[10];
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Informe o " + (i+1) + "° número: ");
			num[i] = input.nextInt();
		}
		System.out.println("Números em ordem contrária: ");
		for  (int i = 9; i >= 0; i--) {
			System.out.print(num[i] + " ");
		}
		
		input.close();
		
	}

}
