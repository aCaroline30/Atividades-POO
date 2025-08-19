package Lista3;

import java.util.Scanner;

//29. Desenvolva um programa que faça a tabuada de um número qualquer inteiro que será
//digitado pelo usuário, mas a tabuada não deve necessariamente iniciar em 1 e terminar em
//10, o valor inicial e final devem ser informados também pelo usuário, conforme exemplo
//abaixo:
//• Montar a tabuada de: 5
//Começar por: 4
//Terminar em: 7

public class Ex29 {

	public static void main(String[] args) {
		   Scanner input = new Scanner(System.in);

	        System.out.println("Montar a tabuada de: ");
	        int numero = input.nextInt();

	        System.out.println("Começar por: ");
	        int inicio = input.nextInt();

	        System.out.println("Terminar em: ");
	        int fim = input.nextInt();
	        
	        if (fim < inicio) {
	            System.out.println("O valor final não pode ser menor que o inicial.");
	        } else {
	            System.out.println("Tabuada do " + numero + " de " + inicio + " até " + fim + ":");

	            for (int i = inicio; i <= fim; i++) {
	                System.out.println(numero + " x " + i + " = " + (numero * i));
	            }
	        }

	        input.close();

	}

}
