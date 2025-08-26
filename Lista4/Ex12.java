package Lista4;

import java.util.Scanner;

//12. Faça um Programa que peça a idade e a altura de 5 pessoas, armazene cada informação no
//seu respectivo vetor. Imprima a idade e a altura na ordem inversa a ordem lida. Mostrar
//também idade e altura do mais velho, mais novo, mais baixo e mais alto. Mostrar idade e
//altura de quem está abaixo e acima da média de idade e altura;

public class Ex12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        final int TAM = 5;
        int[] idades = new int[TAM];
        float[] alturas = new float[TAM];

       
        for (int i = 0; i < TAM; i++) {
            System.out.print("Informe a idade da pessoa " + (i+1) + ": ");
            idades[i] = input.nextInt();
            System.out.print("Informe a altura da pessoa " + (i+1) + ": ");
            alturas[i] = input.nextFloat();
        }

        System.out.println("Idades e alturas em ordem inversa:");
        for (int i = 4; i >= 0; i--) {
            System.out.println("Pessoa " + (i+1) + " - Idade: " + idades[i] + ", Altura: " + alturas[i]);
        }

       
        int maisVelho = idades[0];
        int maisNovo = idades[0];
        float maisAlto = alturas[0];
        float maisBaixo = alturas[0];
        int posVelho = 0, posNovo = 0, posAlto = 0, posBaixo = 0;

        for (int i = 1; i < TAM; i++) {
            if (idades[i] > maisVelho) { maisVelho = idades[i]; posVelho = i; }
            if (idades[i] < maisNovo) { maisNovo = idades[i]; posNovo = i; }
            if (alturas[i] > maisAlto) { maisAlto = alturas[i]; posAlto = i; }
            if (alturas[i] < maisBaixo) { maisBaixo = alturas[i]; posBaixo = i; }
        }

        System.out.println("Mais velho: " + maisVelho + " anos, altura: " + alturas[posVelho]);
        System.out.println("Mais novo: " + maisNovo + " anos, altura: " + alturas[posNovo]);
        System.out.println("Mais alto: " + maisAlto + " m, idade: " + idades[posAlto]);
        System.out.println("Mais baixo: " + maisBaixo + " m, idade: " + idades[posBaixo]);

      
        float somaIdade = 0, somaAltura = 0;
        for (int i = 0; i < TAM; i++) {
            somaIdade += idades[i];
            somaAltura += alturas[i];
        }
        float mediaIdade = somaIdade / TAM;
        float mediaAltura = somaAltura / TAM;

        System.out.println("Média de idade: " + mediaIdade);
        System.out.println("Média de altura: " + mediaAltura);

    
        System.out.println("Abaixo da média de idade:");
        for (int i = 0; i < TAM; i++) {
            if (idades[i] < mediaIdade) {
                System.out.println("Pessoa " + (i+1) + " - Idade: " + idades[i] + ", Altura: " + alturas[i]);
            }
        }

        System.out.println("Acima da média de idade:");
        for (int i = 0; i < TAM; i++) {
            if (idades[i] > mediaIdade) {
                System.out.println("Pessoa " + (i+1) + " - Idade: " + idades[i] + ", Altura: " + alturas[i]);
            }
        }

        System.out.println("Abaixo da média de altura:");
        for (int i = 0; i < TAM; i++) {
            if (alturas[i] < mediaAltura) {
                System.out.println("Pessoa " + (i+1) + " - Idade: " + idades[i] + ", Altura: " + alturas[i]);
            }
        }

        System.out.println("Acima da média de altura:");
        for (int i = 0; i < TAM; i++) {
            if (alturas[i] > mediaAltura) {
                System.out.println("Pessoa " + (i+1) + " - Idade: " + idades[i] + ", Altura: " + alturas[i]);
            }
            input.close();
        }

	}

}
