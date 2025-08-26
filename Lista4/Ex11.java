package Lista4;

//11. Faça um programa que tenha como entrada várias palavras separadas por ;
//(rodrigo;curvello;antonio;....) separe as palavras e coloque cada uma em uma posição do
//vetor

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite as palavras separadas por ';' (ex: rodrigo;curvello;antonio): ");
        String entrada = input.nextLine();

       
        String[] palavras = entrada.split(";");

        
        System.out.println("Palavras no vetor:");
        for (int i = 0; i < palavras.length; i++) {
            System.out.println("Posição " + i + ": " + palavras[i]);
        }
        input.close();
	}

}
