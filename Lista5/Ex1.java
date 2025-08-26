package Lista5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

//1. Faça um programa que peça ao usuário um valor inteiro impar entre 3 e 11 (inclusive 3 e
//11, valide esta entrada), após isto crie uma matriz quadrada (inteiros) do tamanho do número
//informado pelo usuário. Permita que o usuário informe os valores para cada uma das
//posições da matriz. Após isto calcula e mostre as seguintes informações sobre a matriz:
//• Soma dos elementos;
//• Média dos elementos (duas casas decimais);
//• Maior valor;
//• Menor valor;
//• Contador de pares;
//• Contador de ímpares;
//• Soma da diagonal principal;
//• Soma da diagonal secundária;
//• Mostrar a Matriz (formatada);
//Permitir gravar e ler estes dados de um arquivo.

public class Ex1 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
	        int n;

	       
	        do {
	            System.out.print("Informe um número ímpar entre 3 e 11: ");
	            n = input.nextInt();
	            if (n < 3 || n > 11 || n % 2 == 0) {
	                System.out.println("Valor inválido! Digite novamente.");
	            }
	        } while (n < 3 || n > 11 || n % 2 == 0);

	        int[][] matriz = new int[n][n];

	       
	        System.out.println("\nDigite os valores da matriz " + n + "x" + n + ":");
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                System.out.print("M[" + i + "][" + j + "] = ");
	                matriz[i][j] = input.nextInt();
	            }
	        }

	        
	        int soma = 0, maior = matriz[0][0], menor = matriz[0][0];
	        int pares = 0, impares = 0;
	        int somaDiagPrincipal = 0, somaDiagSecundaria = 0;
	        int totalElementos = n * n;

	     
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                int valor = matriz[i][j];
	                soma += valor;

	                if (valor > maior) maior = valor;
	                if (valor < menor) menor = valor;

	                if (valor % 2 == 0) pares++;
	                else impares++;

	                if (i == j) somaDiagPrincipal += valor;
	                if (i + j == n - 1) somaDiagSecundaria += valor;
	            }
	        }

	        double media = (double) soma / totalElementos;

	    
	        System.out.println("\nMatriz:");
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                System.out.printf("%4d", matriz[i][j]);
	            }
	            System.out.println();
	        }

	      
	        System.out.println("\nResultados:");
	        System.out.println("Soma dos elementos: " + soma);
	        System.out.printf("Média dos elementos: %.2f%n", media);
	        System.out.println("Maior valor: " + maior);
	        System.out.println("Menor valor: " + menor);
	        System.out.println("Quantidade de pares: " + pares);
	        System.out.println("Quantidade de ímpares: " + impares);
	        System.out.println("Soma da diagonal principal: " + somaDiagPrincipal);
	        System.out.println("Soma da diagonal secundária: " + somaDiagSecundaria);

	        
	        try (PrintWriter writer = new PrintWriter(new FileWriter("matriz.txt"))) {
	            writer.println("Matriz " + n + "x" + n + ":");
	            for (int i = 0; i < n; i++) {
	                for (int j = 0; j < n; j++) {
	                    writer.printf("%4d", matriz[i][j]);
	                }
	                writer.println();
	            }
	            writer.println("\nResultados:");
	            writer.println("Soma dos elementos: " + soma);
	            writer.printf("Média dos elementos: %.2f%n", media);
	            writer.println("Maior valor: " + maior);
	            writer.println("Menor valor: " + menor);
	            writer.println("Quantidade de pares: " + pares);
	            writer.println("Quantidade de ímpares: " + impares);
	            writer.println("Soma da diagonal principal: " + somaDiagPrincipal);
	            writer.println("Soma da diagonal secundária: " + somaDiagSecundaria);
	        } catch (IOException e) {
	            System.out.println("Erro ao gravar o arquivo: " + e.getMessage());
	        }

	      
	        System.out.println("\nConteúdo do arquivo 'matriz.txt':");
	        try (BufferedReader reader = new BufferedReader(new FileReader("matriz.txt"))) {
	            String linha;
	            while ((linha = reader.readLine()) != null) {
	                System.out.println(linha);
	            }
	        } catch (IOException e) {
	            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
	        }
	        input.close();
	}

}
