package Lista3;

//4. Supondo que a população de um país A seja da ordem de 80000 habitantes com uma taxa
//anual de crescimento de 3% e que a população de B seja 200000 habitantes com uma taxa de
//crescimento de 1.5%. Faça um programa que calcule e escreva o número de anos necessários
//para que a população do país A ultrapasse ou iguale a população do país B, mantidas as
//taxas de crescimento.

public class Ex4 {
	public static void main(String[] args) {
	
		float populacaoA = 80000;
		float populacaoB = 20000;
		int anos = 0;
		
		int finalA;
		int finalB; 
		
		do {
			
			populacaoA = populacaoA + ( populacaoA* 0.015f);
			populacaoB = populacaoB + ( populacaoB* 0.030f);
			anos = anos + 1;
			
			if (populacaoB >= populacaoA) {
				finalA = (int) Math.ceil(populacaoA);
				finalB = (int) Math.ceil(populacaoB);
				System.out.println("Condição atingida!");
				System.out.println("A populção B alcançará a A em: "  + anos + " anos.");
				System.out.println("População A: " + finalA);
				System.out.println("População B: " + finalB);
				
			}
			
		} while (populacaoB < populacaoA);
			
	}
}
