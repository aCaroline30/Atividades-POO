package Lista3;

import java.util.Scanner;

public class Ex37 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);

	       
	        String[] gabarito = new String[10];
	        System.out.println(" Cadastro do Gabarito ");
	        for (int i = 0; i < 10; i++) {
	            System.out.print("Questão " + (i + 1) + ": ");
	            gabarito[i] = input.next().toUpperCase();
	        }

	        int maiorNota = -1, menorNota = 11, totalAlunos = 0, somaNotas = 0;
	        boolean continuar = true;

	        while (continuar) {
	            System.out.println("Respostas do Aluno");
	            String[] respostas = new String[10];
	            int acertos = 0;

	            for (int i = 0; i < 10; i++) {
	                System.out.print("Resposta da Questão " + (i + 1) + ": ");
	                respostas[i] = input.next().toUpperCase();
	                if (respostas[i].equals(gabarito[i])) {
	                    acertos++;
	                }
	            }

	            System.out.println("Aluno acertou " + acertos + " de 10 questões.");
	            totalAlunos++;
	            somaNotas += acertos;

	            if (acertos > maiorNota) maiorNota = acertos;
	            if (acertos < menorNota) menorNota = acertos;

	            System.out.print("Outro aluno vai utilizar o sistema? (S/N): ");
	            String resp = input.next().toUpperCase();
	            if (!resp.equals("S")) {
	                continuar = false;
	            }
	        }

	      
	        System.out.println(" Resultados Finais ");
	        System.out.println("Maior acerto: " + maiorNota);
	        System.out.println("Menor acerto: " + menorNota);
	        System.out.println("Total de alunos: " + totalAlunos);
	        double media = (double) somaNotas / totalAlunos;
	        System.out.println("Média da turma: " + media);

	        input.close();

	}

}
