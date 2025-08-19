package Lista2;
//4. Faça um Programa que peça para entrar com um ano com 4 dígitos e determine se o mesmo é ou não bissexto.
import java.util.Scanner;

public class anoBissexto {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe um ano (4 dígitos): ");
		int ano = input.nextInt();

			if ((ano % 4 == 0 && ano % 100 != 0 ) || (ano % 400 ==0)) {
				System.out.println(ano + " é um ano bisexto");
			} else {
				System.out.println(ano + " náo é um ano bissexto");
			}
			input.close();
	}

}
