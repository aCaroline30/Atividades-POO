package Lista1;
//15.Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em
//metros quadrados da área a ser pintada. Considere que a cobertura da tinta é de 1 litro
//para cada 3 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam
//R$ 80,00. Informe ao usuário a quantidades de latas de tinta a serem compradas e o
//preço total.
import java.util.Scanner;

public class lojaDeTinta {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		final float preço_lata = 80.0f;
		final float litros_lata = 18.0f;
		final float area_litro = 3.0f;
		
			System.out.println("Informe a área a ser pintada (m²): ");
			float área = input.nextFloat();
			 
			float litros_nec = área/area_litro;
			
//calculou litros necessários
			
			int latas = (int) Math.ceil(litros_nec / litros_lata);
			
//Math.ceil retorna o número inteiro arredondando para cima
			
			float custo = preço_lata * latas;
			System.out.println("Quantidade de latas a serem compradas: " + latas);
			System.out.println("Preço a ser pago: " + custo + "R$");
			
			input.close();
	}

}
