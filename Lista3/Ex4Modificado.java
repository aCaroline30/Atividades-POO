package Lista3;

//Altere o programa anterior permitindo ao usuário informar as
//populações e as taxas de crescimento iniciais. Valide a entrada e permita repetir a
//operação.

import java.util.Scanner;

public class Ex4Modificado {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		float populacaoA;
		float populacaoB;
		
		float taxaDeCrescimentoA;
		float taxaDeCrescimentoB;
		int anos = 0;
		
		int finalA;
		int finalB; 
		
		System.out.println("Informe a população 'A': ");
		populacaoA = input.nextFloat();
		System.out.println("Informe sua taxa de crescimento: ");
		taxaDeCrescimentoA = input.nextFloat();
		System.out.println("Informe a população 'B': ");
		populacaoB = input.nextFloat();
		System.out.println("Informe sua taxa de crescimento: ");
		taxaDeCrescimentoB = input.nextFloat();
		
		if (taxaDeCrescimentoA >= 1){
			
			taxaDeCrescimentoA = taxaDeCrescimentoA / 100;
		}
	
		if (taxaDeCrescimentoB >= 1){
			taxaDeCrescimentoB = taxaDeCrescimentoB / 100;
		}
		
		do {	
			
			populacaoA = populacaoA + ( populacaoA * taxaDeCrescimentoA);
			populacaoB = populacaoB + ( populacaoB * taxaDeCrescimentoB);
			anos = anos + 1;
							
				if (populacaoB >= populacaoA) {
					
					finalA = (int) Math.ceil(populacaoA);
					finalB = (int) Math.ceil(populacaoB);
					
					System.out.println("A populção B alcançará a A em: "  + anos + " anos.");
					System.out.println("População A: " + finalA);
					System.out.println("População B: " + finalB);
						
					}
			
			} while (populacaoB < populacaoA);
	
		input.close();
	}
}