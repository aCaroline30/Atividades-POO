package Lista2;
//8. Faça um programa para a leitura de duas notas parciais de um aluno. O programa deve
//calcular a média alcançada pelo aluno e apresentar:
//o A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
//o A mensagem "Reprovado", se a média for menor do que sete;

import java.util.Scanner;

public class AprovReprov {

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
		} else {
			System.out.println("Reprovado, média: " + media);
			
		input.close();
		}
	}

}
