package Lista1;

import java.util.Scanner;

public class pesoIdealHeM {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		float altura;
		
		System.out.println("Informe sua altura em metros (Ex: 1,60): ");
		altura = input.nextFloat();
		
		System.out.println("Para um homem o peso ideal é: " + ((altura*72.7)-58) + "Kg");
		System.out.println("Para uma mulher o peso ideal é: " + ((62.1*altura)-44.7) + "Kg");
		input.close();

	}

}
