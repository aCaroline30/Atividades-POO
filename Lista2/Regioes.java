package Lista2;

import java.util.Scanner;

//15. Faça um Programa que tendo como dados de entrada o preço de custo de um produto e
//um código de origem, emita o preço junto de sua procedência. Caso o código não seja
//nenhum dos especificados, o produto deve ser classificado como importado. Código de
//origem: 1 - Sul, 2 - Norte 3 - Leste, 4 - Oeste, 5 ou 6 - nordeste 7 ou 8 Centro-oeste.
public class Regioes {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float preço;
		int codigo;
		
		System.out.println("Informe o preço do produto: ");
		preço = input.nextFloat();
		System.out.println("Informe o código contido: ");
		codigo = input.nextInt();
		
		switch (codigo) {
			
		case 1:
			System.out.println(preço + "R$");
			System.out.println("Sul");
			break;
		case 2:
			System.out.println(preço + "R$");
			System.out.println("Norte");
			break;
		case 3:
			System.out.println(preço + "R$");
			System.out.println("Leste");
			break;
		case 4:
			System.out.println(preço + "R$");
			System.out.println("Oeste");
			break;
		case 5:
			System.out.println(preço + "R$");
			System.out.println("Nordeste");
			break;
		case 6:
			System.out.println(preço + "R$");
			System.out.println("Nordeste");
			break;
		case 7:
			System.out.println(preço + "R$");
			System.out.println("Centro-Oeste");
			break;
		case 8:
			System.out.println(preço + "R$");
			System.out.println("Centro-Oeste");
			break;
		default:
			System.out.println(preço + "R$");
			System.out.println("Importado");
		}
		input.close();
	}

}
