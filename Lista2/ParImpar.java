package Lista2;
//6. Faça um Programa que peça um número inteiro e se este número for par, transforme-o
//em impar e vice-versa.

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int num;
		
		System.out.println("Insira um número: ");
		num = input.nextInt();
		
		
			System.out.println(++num);
			
		input.close();
			
		}

	}


