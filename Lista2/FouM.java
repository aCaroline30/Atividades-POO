package Lista2;
//Faça um Programa que verifique se uma letra digitada é "F" ou "M". Conforme a letra escrever: F - Feminino, M - Masculino.

import java.util.Scanner;

public class FouM {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String letra;
		
		System.out.println("Informe seu gênero ('M' ou 'F'): ");
		letra = input.next();
		
		
		if (letra.equals("M")) {
			System.out.println("Masculino");
		} else if (letra.equals("F")) {
			System.out.println("Feminino");
		} else {
			System.out.println("Opção não encontrada");
		}
		
		input.close();

	}

}
