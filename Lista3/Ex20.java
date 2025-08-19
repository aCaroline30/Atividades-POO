package Lista3;

//20. Faça um programa que calcule e mostre a média aritmética de N notas.

import java.util.Scanner;

public class Ex20 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe um número de notas a ser inserido: ");
		int notas = input.nextInt();
		float soma = 0;
		
		for (int i = 1; i <= notas; i++) {
			System.out.println("Insira a " + i + "° nota: ");
			float nota = input.nextFloat();
			soma = soma + nota;
			
		} float media = soma/notas;
		System.out.println("Média final das " + notas + " notas inseridas: " + media);
		input.close();
	}	
}
