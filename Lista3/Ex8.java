package Lista3;

//8. Altere o programa anterior para mostrar no final a soma dos números.

import java.util.Scanner;

public class Ex8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe um número inicial: ");
		int a = input.nextInt();
		System.out.println("Informe um número final: ");
		int b = input.nextInt();
		
		int menor = Math.min(a, b);
		int maior = Math.max(a, b);
		int i ;
		int soma = 0;
		
		for (i = menor; i <= maior; i++) {
			soma = soma + i;
			
		}
			
		
		System.out.println("A soma é do intervalo é igual a: " + soma);
		
		input.close();
	}
}
