package Lista2;

import java.util.Scanner;

//5. Faça um Programa que verifique se uma letra digitada é vogal.

public class Vogal {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String letra;
		
		System.out.println("Informe uma letra: ");
		letra = input.next().toUpperCase();
//deixa a letra maiuscula;		
		
		if ((letra.equals("A"))||(letra.equals("E"))||(letra.equals("I"))||(letra.equals("O"))||(letra.equals("U"))) {
			System.out.println("É uma vogal");
		} else {
			System.out.println("Não é uma vogal");
		}
		input.close();
	}

}
