package Lista5;

import java.util.Scanner;

//4. Nas Olimpíadas do IFC estão ocorrendo várias competições, entre elas salto em
//distância, nesta competição cada atleta tem direito a cinco saltos, para valorizar o atleta
//mais constante é feita a média dos saltos, desprezando o pior salto. Você foi contratado para
//implementar um sistema que fará o controle desta competição, utilizando o recurso de Matriz,
//resolva os itens abaixo:
//
//• Solicitar os cinco saltos de cada atleta;
//• Após o atleta saltar mostrar a média;
//• Permitir a utilização do sistema por N atletas (informado no inicio da aplicação);
//• Ao final, ou seja, após os N atletas digitarem os saltos o programa deve mostrar:
//• Saltos de cada atleta, seguidos de sua média;
//• A média dos saltos do campeão e do último lugar;

public class Ex4 {

	public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);

       
        System.out.print("Informe o número de atletas: ");
        int N = input.nextInt();

        double[][] saltos = new double[N][5];
        double[] medias = new double[N];

        
        for (int i = 0; i < N; i++) {
            System.out.println("\nAtleta " + (i + 1));
            double soma = 0;
            double menor = Double.MAX_VALUE;

            for (int j = 0; j < 5; j++) {
                System.out.print("Digite o salto " + (j + 1) + ": ");
                saltos[i][j] = input.nextDouble();

                soma += saltos[i][j];
                if (saltos[i][j] < menor) {
                    menor = saltos[i][j];
                }
            }

          
            medias[i] = (soma - menor) / 4.0;
            System.out.printf("Média do atleta %d: %.2f%n", (i + 1), medias[i]);
        }

       
        System.out.println("\n--- Resultados finais ---");
        for (int i = 0; i < N; i++) {
            System.out.print("Atleta " + (i + 1) + " - Saltos: ");
            for (int j = 0; j < 5; j++) {
                System.out.printf("%.2f ", saltos[i][j]);
            }
            System.out.printf("| Média: %.2f%n", medias[i]);
        }

       
        double maiorMedia = medias[0], menorMedia = medias[0];
        int campeao = 0, ultimo = 0;

        for (int i = 1; i < N; i++) {
            if (medias[i] > maiorMedia) {
                maiorMedia = medias[i];
                campeao = i;
            }
            if (medias[i] < menorMedia) {
                menorMedia = medias[i];
                ultimo = i;
            }
        }

        System.out.printf("%nCampeão: Atleta %d com média %.2f%n", (campeao + 1), maiorMedia);
        System.out.printf("Último lugar: Atleta %d com média %.2f%n", (ultimo + 1), menorMedia);

        input.close();
	}

}
