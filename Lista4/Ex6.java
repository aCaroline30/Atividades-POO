package Lista4;

//6. Faça um Programa que peça as quatro notas de 10 alunos, calcule e armazene num vetor a
//média de cada aluno, imprima o número de alunos com média maior ou igual a 7.0.

import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		final int alunos = 10;
		final int notas = 4;
		float media [] = new float [10];
		int aprovados = 0;
		
		for (int i = 0; i < alunos; i++) {
			float soma = 0;
			
			System.out.println((i + 1) + "° aluno");
			for (int j = 0; j < notas; j++) {
				System.out.println("Informe a " + (j+1) + "ª nota: ");
				float nota = input.nextFloat();
				soma += nota;
			}
		media[i] =	soma/notas;
		if (media[i] >= 7) {
			aprovados++;
		}
			
		}
		System.out.println("Média dos alunos: ");
		for (int i = 0; i < alunos; i++) {
			 System.out.printf("Aluno" + (i+1) + ": " + media[i]);
		}
		System.out.println("Total de alunos aprovados: " + aprovados);
		input.close();
	}
	
}
