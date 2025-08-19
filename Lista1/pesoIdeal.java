package Lista1;

import java.util.Scanner;

//11.Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura) – 58.
public class pesoIdeal {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		float altura;
		
		System.out.println("Informe sua altura em metros (Ex: 1,60): ");
		altura = input.nextFloat();
		
		System.out.println("Seu peso ideal é: " + ((altura*72.7)-58));
		input.close();
	}

}
