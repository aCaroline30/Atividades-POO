package Lista1;
//6. Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
import java.util.Scanner;

public class raioCirc {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		float raio;
		
		System.out.println("Informe o raio da circunferência: ");
		raio = input.nextFloat();
		
		System.out.println("A área equivale a: " + (Math.PI*Math.pow(raio, 2)));
		
		input.close();

	}

}
