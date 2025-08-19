package Lista2;

import java.util.Scanner;

public class MediaAluno {
	
	public static void main(String[] args) {
		
		 Scanner input = new Scanner(System.in);

	        
	        System.out.println("Digite a primeira nota: ");
	        float nota1 = input.nextFloat();

	        System.out.print("Digite a segunda nota: ");
	        float nota2 = input.nextFloat();

	        System.out.print("Digite a terceira nota: ");
	        float nota3 = input.nextFloat();

	       
	        float media = (nota1 + nota2 + nota3) / 3;

	        
	        if (media == 10) {
	            System.out.println("Aprovado com Distinção! Média: " + media);
	        } else if (media >= 7) {
	            System.out.println("Aprovado! Média: " + media);
	        } else {
	            System.out.println("Reprovado! Média: " + media);
	        }

	        input.close();
	
	}

}
