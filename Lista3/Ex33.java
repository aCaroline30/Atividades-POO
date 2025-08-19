package Lista3;

import java.util.Scanner;

//34. Faça um programa que leia uma quantidade indeterminada de números positivos e conte
//quantos deles estão nos seguintes intervalos: [0-25], [26-50], [51-75] e [76-100]. A entrada
//de dados deverá terminar quando for lido um número negativo.

public class Ex33 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        int num;
        int cont0_25 = 0, cont26_50 = 0, cont51_75 = 0, cont76_100 = 0;

        System.out.println("Digite números positivos (um negativo para encerrar):");

        while (true) {
            num = input.nextInt();

            if (num < 0) {
                break;
            }

            if (num >= 0 && num <= 25) {
                cont0_25++;
            } else if (num >= 26 && num <= 50) {
                cont26_50++;
            } else if (num >= 51 && num <= 75) {
                cont51_75++;
            } else if (num >= 76 && num <= 100) {
                cont76_100++;
            } 
           
        }

        System.out.println(" Resultado ");
        System.out.println("[0-25]: " + cont0_25);
        System.out.println("[26-50]: " + cont26_50);
        System.out.println("[51-75]: " + cont51_75);
        System.out.println("[76-100]: " + cont76_100);

        input.close();

	}

}
