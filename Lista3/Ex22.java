package Lista3;

//22. Numa eleição existem três candidatos. Faça um programa que peça o número total de
//votantes. Peça para cada votante votar e ao final mostrar o número de votos de cada
//candidato.

import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);

	        int totalVotantes;
	        int Candidato1 = 0;
	        int Candidato2 = 0;
	        int Candidato3 = 0;

	        System.out.print("Digite o número total de votantes: ");
	        totalVotantes = input.nextInt();

	        for (int i = 1; i <= totalVotantes; i++) {
	            int voto;
	            do {
	                System.out.println("Votante " + i + ", digite o número do candidato (1, 2 ou 3): ");
	                voto = input.nextInt();

	                if (voto == 1) {
	                    Candidato1++;
	                } else if (voto == 2) {
	                    Candidato2++;
	                } else if (voto == 3) {
	                    Candidato3++;
	                } else {
	                    System.out.println("Voto inválido! Tente novamente.");
	                }

	            } while (voto < 1 || voto > 3); 
	        }

	        System.out.println("Resultado da eleição:");
	        System.out.println("Candidato 1: " + Candidato1 + " votos");
	        System.out.println("Candidato 2: " + Candidato2 + " votos");
	        System.out.println("Candidato 3: " + Candidato3 + " votos");

	        input.close();

	}

}
