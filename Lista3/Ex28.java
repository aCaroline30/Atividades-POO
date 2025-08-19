package Lista3;

import java.util.Scanner;

//28. O Departamento Estadual de Meteorologia lhe contratou para desenvolver um programa
//que leia as um conjunto indeterminado de temperaturas, e informe ao final a menor e a
//maior temperaturas informadas, bem como a média das temperaturas.

public class Ex28 {
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);

	        double temp, soma = 0;
	        double menor = Double.MAX_VALUE;
	        double maior = Double.MIN_VALUE; 
	        int contador = 0;

	        System.out.println("Digite as temperaturas (digite 999 para encerrar):");

	        while (true) {
	            temp = input.nextDouble();

	            if (temp == 999) { 
	                break;
	            }
	            if (temp < menor) {
	                menor = temp;
	            }
	            if (temp > maior) {
	                maior = temp;
	            }

	            soma += temp;
	            contador++;
	        }

	        if (contador > 0) {
	            double media = soma / contador;
	            System.out.println("Menor temperatura: " + menor);
	            System.out.println("Maior temperatura: " + maior);
	            System.out.println("Média das temperaturas: " + media);
	        } else {
	            System.out.println("Nenhuma temperatura foi informada.");
	        }

	        input.close();

	}

}
