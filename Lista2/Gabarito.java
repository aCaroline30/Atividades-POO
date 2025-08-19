package Lista2;

import java.util.Scanner;

public class Gabarito {

	public static void main(String[] args) {
		
		 Scanner input = new Scanner(System.in);

	       
	        char[] gabarito = {'a', 'a', 'b', 'b', 'c', 'c', 'd', 'd', 'e', 'e'};
	        char[] respostas = new char[10];
	        int pontuacao = 0;

	        System.out.println("=== Prova com 10 questões ===");

	       
	        for (int i = 0; i < 10; i++) {
	            System.out.printf("Digite a resposta da questão: ", i + 1);
	            respostas[i] = input.next().toLowerCase().charAt(0);
	        }

	        System.out.println("=== Resultado ===");

	        
	        for (int i = 0; i < 10; i++) {
	            if (respostas[i] == gabarito[i]) {
	                System.out.printf("Q%d: %c : Correto\n", i + 1, respostas[i]);
	                pontuacao++;
	            } else {
	                System.out.printf("Q%d: %c : Errada, resposta correta (%c)\n", 
	                                  i + 1, respostas[i], gabarito[i]);
	            }
	        }

	       
	        System.out.println("Pontuação Final: " + pontuacao);

	        input.close();
	}

}
