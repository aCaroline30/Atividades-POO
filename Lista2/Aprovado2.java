package Lista2;

import java.util.Scanner;

public class Aprovado2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		float nota1;
		float nota2;
		float media;
		
		System.out.println("Informe a primeira nota: ");
		nota1 = input.nextFloat();
		
		System.out.println("Informe a segunda nota: ");
		nota2 = input.nextFloat();
		
		media = (nota1+nota2)/2;
		
		if (media >= 7) {
			System.out.println("Aprovado, média: " + media);
		} else if (media>3 || media<=6.9){
			System.out.println("Em exame, média: " + media);
		} else {
			System.out.println("Reprovado, média: " + media);
			
		input.close();
		}
	}

}
