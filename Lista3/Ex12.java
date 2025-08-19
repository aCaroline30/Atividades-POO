package Lista3;

//12. A série de Fibonacci é formada pela seqüência 1,1,2,3,5,8,13,21,34,55,... Faça um
//programa capaz de gerar a série até o n−ésimo termo.

import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe quantos números da sequência serão somados: ");
		int n = input.nextInt();
		
		int soma = 0;
		int primeiro = 1;
		int segundo = 1;
		
		if (n >= 1) {
			System.out.print(primeiro + " ");
		}
		if (n >= 2) {
			System.out.print(segundo + " ");
		}
		
		for (int i = 3; i <= n; i++) {
			
			soma = primeiro + segundo;
			
			primeiro = segundo;
			segundo = soma;
			
			System.out.print(soma + " ");
		}
		input.close();
	}
}
