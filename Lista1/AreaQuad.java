package Lista1;
//7. Faça um Programa que calcule e mostre a área de um quadrado.
import java.util.Scanner;

public class AreaQuad {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		float ladoa;
		float ladob;
		
		System.out.println("Informe o valor da base do quadrado: ");
		ladoa = input.nextFloat();
		System.out.println("Informe o valor da altura do quadrado: ");
		ladob = input.nextFloat();
		
		System.out.println("A área do quadrado é igual a: " + (ladoa * ladob));
		
		input.close();

	}

}
