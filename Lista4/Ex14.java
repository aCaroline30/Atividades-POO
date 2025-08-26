package Lista4;

import java.util.Scanner;

//14. Foram anotadas as idades e alturas de 30 alunos. Faça um Programa que determine quantos
//alunos com mais de 13 anos possuem altura inferior à média de altura desses alunos.

public class Ex14 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);

        final int TAM = 30;
        int[] idades = new int[TAM];
        double[] alturas = new double[TAM];

       
        for (int i = 0; i < TAM; i++) {
            System.out.print("Informe a idade do aluno " + (i + 1) + ": ");
            idades[i] = input.nextInt();
            System.out.print("Informe a altura do aluno " + (i + 1) + " (em metros): ");
            alturas[i] = input.nextDouble();
        }

      
        float somaAlturas = 0;
        for (int i = 0; i < TAM; i++) {
            somaAlturas += alturas[i];
        }
        float mediaAltura = somaAlturas / TAM;

        
        int contador = 0;
        for (int i = 0; i < TAM; i++) {
            if (idades[i] > 13 && alturas[i] < mediaAltura) {
                contador++;
            }
        }

      
        System.out.println("Média das alturas: " + mediaAltura);
        System.out.println("Quantidade de alunos com mais de 13 anos e altura abaixo da média: " + contador);
        input.close();
	}

}
