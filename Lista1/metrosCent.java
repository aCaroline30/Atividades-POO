package Lista1;
//5. Faça um Programa que converta metros para centímetros.
import java.util.Scanner;

public class metrosCent {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		float num;
		System.out.println("Informe o valor em metros: ");
		num = input.nextFloat();
		System.out.println(num*100 +"cm");
		
		input.close();
	}

}
