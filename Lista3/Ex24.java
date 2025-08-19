package Lista3;

import java.util.Scanner;

//24. Faça um programa que calcule o valor total investido por um colecionador em sua
//coleção de CDs e o valor médio gasto em cada um deles. O usuário deverá informar a
//quantidade de CDs e o valor para em cada um.

public class Ex24 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);

	        System.out.println("Digite a quantidade de CDs da coleção: ");
	        int qtdCDs = input.nextInt();

	        float total = 0;

	        for (int i = 1; i <= qtdCDs; i++) {
	            System.out.print("Digite o valor do CD " + i + ": R$ ");
	            float valor = input.nextFloat();
	            total = total + valor;
	        }

	        float media = total / qtdCDs;

	        System.out.println("Valor total investido: " + total + "R$");
	        System.out.println("Valor médio por CD: " + media + "R$");

	        input.close();

	}

}
