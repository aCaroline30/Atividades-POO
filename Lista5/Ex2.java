package Lista5;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//2. Crie um programa que solicite o preço de cinco produtos em cinco supermercados
//diferentes, ao final o programa deve mostrar:
//• Os preços em cada um dos supermercados;
//• A média de preço por produto;
//• A soma de preços por supermercado;
//• O valor total no supermercado mais barato e no mais caro;
//Permitir gravar e ler estes dados de um arquivo.

public class Ex2 {

	 public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        final int PRODUTOS = 5;
        final int SUPERMERCADOS = 5;

        double[][] precos = new double[PRODUTOS][SUPERMERCADOS];

   
        for (int i = 0; i < PRODUTOS; i++) {
            System.out.println("Produto " + (i + 1) + ":");
            for (int j = 0; j < SUPERMERCADOS; j++) {
                System.out.print("  Preço no supermercado " + (j + 1) + ": ");
                precos[i][j] = input.nextDouble();
            }
        }

     
        System.out.println("\n Preços informados ");
        for (int i = 0; i < PRODUTOS; i++) {
            System.out.print("Produto " + (i + 1) + ": ");
            for (int j = 0; j < SUPERMERCADOS; j++) {
                System.out.printf("R$ %.2f ", precos[i][j]);
            }
            System.out.println();
        }

     
        System.out.println("\n--- Média por produto ---");
        for (int i = 0; i < PRODUTOS; i++) {
            double soma = 0;
            for (int j = 0; j < SUPERMERCADOS; j++) {
                soma += precos[i][j];
            }
            double media = soma / SUPERMERCADOS;
            System.out.printf("Produto %d -> Média: R$ %.2f%n", (i + 1), media);
        }

        
        System.out.println("\n--- Soma por supermercado ---");
        double[] somaSuper = new double[SUPERMERCADOS];
        for (int j = 0; j < SUPERMERCADOS; j++) {
            for (int i = 0; i < PRODUTOS; i++) {
                somaSuper[j] += precos[i][j];
            }
            System.out.printf("Supermercado %d -> Total: R$ %.2f%n", (j + 1), somaSuper[j]);
        }

    
        double min = somaSuper[0], max = somaSuper[0];
        int idxMin = 0, idxMax = 0;
        for (int j = 1; j < SUPERMERCADOS; j++) {
            if (somaSuper[j] < min) {
                min = somaSuper[j];
                idxMin = j;
            }
            if (somaSuper[j] > max) {
                max = somaSuper[j];
                idxMax = j;
            }
        }

        System.out.printf("%nSupermercado mais barato: %d -> R$ %.2f%n", (idxMin + 1), min);
        System.out.printf("Supermercado mais caro: %d -> R$ %.2f%n", (idxMax + 1), max);

      
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("supermercados.txt"))) {
            writer.write("--- Preços informados ---\n");
            for (int i = 0; i < PRODUTOS; i++) {
                writer.write("Produto " + (i + 1) + ": ");
                for (int j = 0; j < SUPERMERCADOS; j++) {
                    writer.write(String.format("R$ %.2f ", precos[i][j]));
                }
                writer.write("\n");
            }

            writer.write("\n--- Média por produto ---\n");
            for (int i = 0; i < PRODUTOS; i++) {
                double soma = 0;
                for (int j = 0; j < SUPERMERCADOS; j++) {
                    soma += precos[i][j];
                }
                double media = soma / SUPERMERCADOS;
                writer.write(String.format("Produto %d -> Média: R$ %.2f%n", (i + 1), media));
            }

            writer.write("\n--- Soma por supermercado ---\n");
            for (int j = 0; j < SUPERMERCADOS; j++) {
                writer.write(String.format("Supermercado %d -> Total: R$ %.2f%n", (j + 1), somaSuper[j]));
            }

            writer.write(String.format("%nSupermercado mais barato: %d -> R$ %.2f%n", (idxMin + 1), min));
            writer.write(String.format("Supermercado mais caro: %d -> R$ %.2f%n", (idxMax + 1), max));
        }

        System.out.println("Dados gravados no arquivo supermercados.txt");
		input.close();

	}

}
