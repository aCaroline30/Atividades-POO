package Lista3;

import java.util.Scanner;

public class Ex36 {

	public static void main(String[] args) {
		  Scanner input = new Scanner(System.in);

	        int voto;
	        int candidato1 = 0, candidato2 = 0, candidato3 = 0, candidato4 = 0;
	        int nulos = 0, brancos = 0, total = 0;

	        System.out.println(" Eleição Presidencial ");
	        System.out.println("1 - José");
	        System.out.println("2 - João");
	        System.out.println("3 - Maria");
	        System.out.println("4 - Ana");
	        System.out.println("5 - Voto Nulo");
	        System.out.println("6 - Voto em Branco");
	        System.out.println("Digite 0 para encerrar.");

	        while (true) {
	            System.out.println("Digite seu voto: ");
	            voto = input.nextInt();

	            if (voto == 0) {
	                break;
	            }

	            switch (voto) {
	                case 1:
	                    candidato1++;
	                    break;
	                case 2:
	                    candidato2++;
	                    break;
	                case 3:
	                    candidato3++;
	                    break;
	                case 4:
	                    candidato4++;
	                    break;
	                case 5:
	                    nulos++;
	                    break;
	                case 6:
	                    brancos++;
	                    break;
	                default:
	                    System.out.println("Código inválido! Tente novamente.");
	                    continue; 
	            }

	            total++; 
	        }

	        System.out.println(" Resultado da Eleição ");
	        System.out.println("José: " + candidato1 + " votos");
	        System.out.println("João: " + candidato2 + " votos");
	        System.out.println("Maria: " + candidato3 + " votos");
	        System.out.println("Ana: " + candidato4 + " votos");
	        System.out.println("Nulos: " + nulos + " votos");
	        System.out.println("Brancos: " + brancos + " votos");

	        if (total > 0) {
	            double percNulos = (nulos * 100.0) / total;
	            double percBrancos = (brancos * 100.0) / total;

	            System.out.println("Percentual de votos Nulos: " + percNulos + "%");
	            System.out.println("Percentual de votos em Branco: " + percBrancos + "%");
	        } else {
	            System.out.println("Nenhum voto registrado.");
	        }

	        input.close();

	}

}
