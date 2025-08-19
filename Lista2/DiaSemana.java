package Lista2;

import java.util.Scanner;

//14. Faça um Programa que leia um número e exiba o dia correspondente da semana. (1-
//Domingo, 2- Segunda, etc.), se digitar outro valor deve aparecer valor inválido.


public class DiaSemana {

	public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	int num;
	
	System.out.println("Insira um número de 1 a 7: ");
	num = input.nextInt();
	
	switch (num) {
		case 1:
			System.out.println("É domingo");
			break;
		case 2:
			System.out.println("É segunda");
			break;
		case 3:
			System.out.println("É terça");
			break;
		case 4:
			System.out.println("É quarta");
			break;
		case 5:
			System.out.println("É quinta");
			break;
		case 6:
			System.out.println("É sexta");
			break;
		case 7:
			System.out.println("É sábado");
			break;
		default:
			System.out.println("Valor inválido");
	}
		input.close();
	}

}
