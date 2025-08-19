package Lista1;

import java.util.Scanner;

public class duasOpcoesLata {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		final float preço_lataa = 80.0f;
		final float litros_lataa = 18.0f;
		final float litros_latab = 3.6f;
		final float preço_latab = 25.0f;
		final float area_litro = 6.0f;
		
			System.out.println("Informe a área a ser pintada (m²): ");
			float área = input.nextFloat();
			 
			float litros_nec = área/area_litro;
			

			
			int latasa = (int) Math.ceil(litros_nec / litros_lataa);
			int latasb = (int) Math.ceil(litros_nec / litros_latab);
			

			
			float custoa = preço_lataa * latasa;
			float custob = preço_latab * latasb;
			System.out.println("Quantidade de latas de 18l a serem compradas: " + latasa);
			System.out.println("Preço a ser pago: " + custoa + "R$");
			System.out.println("Quantidade de latas de 3.6l a serem compradas: " + latasb);
			System.out.println("Preço a ser pago: " + custob + "R$");
			
			
			input.close();

	}

}
