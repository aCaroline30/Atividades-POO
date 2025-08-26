package Lista5;

import java.util.Scanner;

//3. Utilizando a estrutura de matriz, faça um programa que para um colégio que tem N (deve
//ser informado no início do programa) alunos e estes são avaliados em duas provas. O
//programa deve permitir digitação do nome do aluno e das duas notas e após isto mostrar as
//seguintes informações:
//• Nome e as duas Notas de cada aluno;
//• A média de cada aluno;
//• A maior e menor nota (nome do aluno junto);
//• A maior e menor média (nome do aluno junto);
//• A média geral da turma;
//• O nome dos alunos acima e abaixo da Media Geral da Turma;

public class Ex3 {

	public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);

      
        System.out.print("Informe o número de alunos: ");
        int N = input.nextInt();
        input.nextLine();

        String[] nomes = new String[N];
        double[][] notas = new double[N][2];
        double[] medias = new double[N];

     
        for (int i = 0; i < N; i++) {
            System.out.println("\nAluno " + (i + 1));
            System.out.print("Nome: ");
            nomes[i] = input.nextLine();
            System.out.print("Nota 1: ");
            notas[i][0] = input.nextDouble();
            System.out.print("Nota 2: ");
            notas[i][1] = input.nextDouble();
            input.nextLine();

            medias[i] = (notas[i][0] + notas[i][1]) / 2.0;
        }

       
        System.out.println("\n--- Dados dos alunos ---");
        for (int i = 0; i < N; i++) {
            System.out.printf("%s - Nota1: %.2f | Nota2: %.2f | Média: %.2f%n",
                    nomes[i], notas[i][0], notas[i][1], medias[i]);
        }

        
        double maiorNota = notas[0][0], menorNota = notas[0][0];
        String alunoMaiorNota = nomes[0], alunoMenorNota = nomes[0];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 2; j++) {
                if (notas[i][j] > maiorNota) {
                    maiorNota = notas[i][j];
                    alunoMaiorNota = nomes[i];
                }
                if (notas[i][j] < menorNota) {
                    menorNota = notas[i][j];
                    alunoMenorNota = nomes[i];
                }
            }
        }

        System.out.printf("%nMaior nota: %.2f (Aluno: %s)%n", maiorNota, alunoMaiorNota);
        System.out.printf("Menor nota: %.2f (Aluno: %s)%n", menorNota, alunoMenorNota);

       
        double maiorMedia = medias[0], menorMedia = medias[0];
        String alunoMaiorMedia = nomes[0], alunoMenorMedia = nomes[0];
        for (int i = 1; i < N; i++) {
            if (medias[i] > maiorMedia) {
                maiorMedia = medias[i];
                alunoMaiorMedia = nomes[i];
            }
            if (medias[i] < menorMedia) {
                menorMedia = medias[i];
                alunoMenorMedia = nomes[i];
            }
        }

        System.out.printf("%nMaior média: %.2f (Aluno: %s)%n", maiorMedia, alunoMaiorMedia);
        System.out.printf("Menor média: %.2f (Aluno: %s)%n", menorMedia, alunoMenorMedia);

        
        double soma = 0;
        for (double m : medias) soma += m;
        double mediaGeral = soma / N;
        System.out.printf("%nMédia geral da turma: %.2f%n", mediaGeral);

   
        System.out.println("\nAlunos acima da média geral:");
        for (int i = 0; i < N; i++) {
            if (medias[i] >= mediaGeral) {
                System.out.printf("%s (Média: %.2f)%n", nomes[i], medias[i]);
            }
        }

        System.out.println("\nAlunos abaixo da média geral:");
        for (int i = 0; i < N; i++) {
            if (medias[i] < mediaGeral) {
                System.out.printf("%s (Média: %.2f)%n", nomes[i], medias[i]);
	            }
	        }
        input.close();
	}

}
