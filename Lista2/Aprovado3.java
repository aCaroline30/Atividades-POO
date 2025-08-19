package Lista2;

import java.util.Scanner;

public class Aprovado3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		float nota1;
		float nota2;
		float media;
		char conceito;
		String situacao;
		
		System.out.println("Informe a primeira nota: ");
		nota1 = input.nextFloat();
		
		System.out.println("Informe a segunda nota: ");
		nota2 = input.nextFloat();
		
		media = (nota1+nota2)/2;
		
		if (media >= 9) {
			conceito = 'A';
			situacao = "Aprovado";
			System.out.println();
		} else if (media>=7.5 || media<9.0){
			conceito = 'B';
			situacao = "Aprovado";
			System.out.println();
		} else if (media >=6 || media < 7.5){
			conceito = 'C';
			situacao = "Aprovado";
			System.out.println();
		} else if (media >=4 || media < 6.0){
			conceito = 'D';
			situacao = "Reprovado";
		} else {
			conceito = 'E';
			situacao = "Reprovado";
			
		}
			System.out.println("Nota 1: " + nota1);
	        System.out.println("Nota 2: " + nota2);
	        System.out.println("Média: " + media);
	        System.out.println("Conceito: " + conceito);
	        System.out.println("Situação: " + situacao);
			
		input.close();
		
	}

}
