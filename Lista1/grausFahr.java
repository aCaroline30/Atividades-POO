package Lista1;
//9. Faça um Programa que peça a temperatura em graus Farenheit, transforme e mostre a temperatura em graus Celsius.
//C = (5 * (F-32) / 9) / C = (F – 32) / 1,8
import java.util.Scanner;

public class grausFahr {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		float graus;
		
		System.out.println("Informe a temperatura em Fahrenheit: ");
		graus = input.nextFloat();
		System.out.println("O valor em graus Celsius equivale a: " + ((graus-32)/1.8));
		
		input.close();
	}

}
