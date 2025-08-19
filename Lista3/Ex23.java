package Lista3;

import java.util.Scanner;

//23. Faça um programa que calcule o número médio de alunos por turma. Para isto, peça a
//quantidade de turmas e a quantidade de alunos para cada turma. As turmas não podem ter
//mais de 40 alunos.

public class Ex23 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);

	        int qtdTurmas;
	        int totalAlunos = 0;

	        System.out.println("Digite a quantidade de turmas: ");
	        qtdTurmas = input.nextInt();

	        for (int i = 1; i <= qtdTurmas; i++) {
	            int alunos;
	            do {
	                System.out.print("Digite a quantidade de alunos da turma " + i + " (máx. 40): ");
	                alunos = input.nextInt();
	                if (alunos > 40) {
	                    System.out.println("Erro: uma turma não pode ter mais de 40 alunos.");
	                }
	            } while (alunos > 40);

	            totalAlunos += alunos;
	        }

	        float media = (float) totalAlunos / qtdTurmas;

	        System.out.println("A média de alunos por turma é: " + media);

	        input.close();

	}

}
