package Lista3;

import java.util.Scanner;

//32. Foi feita uma estatística em cinco cidades brasileiras para coletar dados sobre acidentes
//de trânsito. Foram obtidos os seguintes dados:
//a. Código da cidade;
//b. Número de veículos de passeio (em 1999);
//c. Número de acidentes de trânsito com vítimas (em 1999). Deseja-se saber:
//d. Qual o maior e menor índice de acidentes de transito e a que cidade pertence;
//e. Qual a média de veículos nas cinco cidades juntas;
//f. Qual a média de acidentes de trânsito nas cidades com menos de 2.000 veículos de passeio.

public class Ex32 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);

	        int codigoCidade, veiculos, acidentes;
	        int codMaiorAcidente = 0, codMenorAcidente = 0;
	        int maiorAcidente = Integer.MIN_VALUE, menorAcidente = Integer.MAX_VALUE;

	        int somaVeiculos = 0;
	        int somaAcidentesMenos2000 = 0;
	        int contCidadesMenos2000 = 0;

	        for (int i = 1; i <= 5; i++) {
	            System.out.println("Cidade " + i + ":");

	            System.out.println("Digite o código da cidade: ");
	            codigoCidade = input.nextInt();

	            System.out.println("Digite o número de veículos de passeio (1999): ");
	            veiculos = input.nextInt();

	            System.out.println("Digite o número de acidentes com vítimas (1999): ");
	            acidentes = input.nextInt();

	            if (acidentes > maiorAcidente) {
	                maiorAcidente = acidentes;
	                codMaiorAcidente = codigoCidade;
	            }

	            if (acidentes < menorAcidente) {
	                menorAcidente = acidentes;
	                codMenorAcidente = codigoCidade;
	            }

	            somaVeiculos += veiculos;

	          
	            if (veiculos < 2000) {
	                somaAcidentesMenos2000 += acidentes;
	                contCidadesMenos2000++;
	            }
	        }

	    
	        System.out.println("Estatística de Trânsito");
	        System.out.printf("Maior número de acidentes: %d (Cidade %d)\n", maiorAcidente, codMaiorAcidente);
	        System.out.printf("Menor número de acidentes: %d (Cidade %d)\n", menorAcidente, codMenorAcidente);

	        System.out.println("Média de veículos nas 5 cidades: " + (somaVeiculos / 5.0));

	        if (contCidadesMenos2000 > 0) {
	            System.out.println("Média de acidentes em cidades com menos de 2000 veículos: " +
	                    (somaAcidentesMenos2000 / (double) contCidadesMenos2000));
	        } else {
	            System.out.println("Nenhuma cidade com menos de 2000 veículos registrada.");
	        }

	        input.close();

	}

}
