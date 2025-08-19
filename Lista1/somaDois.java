package Lista1;
//3. Faça um Programa que peça dois números e imprima a soma.
import java.util.Scanner;

public class somaDois {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		float num1;
		float num2;
		
		System.out.println("Informe o primeiro número");
		num1 = input.nextFloat();
		System.out.println("Informe o segundo número");
		num2 = input.nextFloat();
		
		System.out.println("A soma é igual a: " + (num1 + num2));
		
		input.close();

	}

}
