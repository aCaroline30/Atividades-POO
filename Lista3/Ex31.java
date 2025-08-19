package Lista3;

import java.util.Scanner;

//31. Faça um programa que leia dez conjuntos de dois valores, o primeiro representando o
//número do aluno e o segundo representando a sua altura em centímetros. Encontre o aluno
//mais alto e o mais baixo. Mostre o número do aluno mais alto e o número do aluno mais
//baixo, junto com suas alturas.

public class Ex31 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);

	        int numeroAluno, alunoMaisAlto = 0, alunoMaisBaixo = 0;
	        int altura, maiorAltura = Integer.MIN_VALUE, menorAltura = Integer.MAX_VALUE;

	        System.out.println("Cadastro de Alunos");

	        for (int i = 1; i <= 10; i++) {
	            System.out.println("Digite o número do aluno: " + i);
	            numeroAluno = input.nextInt();

	            System.out.println("Digite a altura (em cm): ");
	            altura = input.nextInt();

	            if (altura > maiorAltura) {
	                maiorAltura = altura;
	                alunoMaisAlto = numeroAluno;
	            }

	            if (altura < menorAltura) {
	                menorAltura = altura;
	                alunoMaisBaixo = numeroAluno;
	            }
	        }

	        System.out.println("Resultado");
	        System.out.printf("Aluno mais alto: Nº %d - Altura: %d cm\n", alunoMaisAlto, maiorAltura);
	        System.out.printf("Aluno mais baixo: Nº %d - Altura: %d cm\n", alunoMaisBaixo, menorAltura);

	        input.close();

	}

}
