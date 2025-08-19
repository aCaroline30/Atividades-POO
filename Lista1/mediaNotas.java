package Lista1;
//4. Faça um Programa que peça as 4 notas bimestrais e mostre a média.
import java.util.Scanner;

public class mediaNotas {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		float num1;
		float num2;
		float num3;
		float num4;
		
		System.out.println("Insira a primeira nota: ");
		num1 = input.nextFloat();
		System.out.println("Insira a segunda nota: ");
		num2 = input.nextFloat();
		System.out.println("Insira a terceira nota: ");
		num3 = input.nextFloat();
		System.out.println("Insira a quarta nota: ");
		num4 = input.nextFloat();
		
		System.out.println("Sua média é: " + ((num1 + num2 + num3 + num4)/4));
		
		input.close();
	}

}
