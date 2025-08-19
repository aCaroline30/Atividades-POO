package Lista2;

import java.util.Scanner;

public class Posto {

	public static void main(String[] args) {
		  Scanner input = new Scanner(System.in);

	       
	        final float preco_alcool = 1.90f;
	        final float preco_gasolina = 2.50f;

	     
	        System.out.println("Digite o tipo de combustível (A - Álcool / G - Gasolina): ");
	        String tipo = input.next().trim().toUpperCase();

	       
	        System.out.println("Digite a quantidade de litros: ");
	        float litros = input.nextFloat();

	        float precoFinal = 0;
	        float descontoPorLitro = 0;

	        if (tipo.equals("A")) {
	            if (litros <= 20) {
	                descontoPorLitro = 0.03f;
	            } else {
	                descontoPorLitro = 0.05f;
	            }
	            precoFinal = litros * preco_alcool * (1 - descontoPorLitro);

	        } else if (tipo.equals("G")) { 
	            if (litros <= 20) {
	                descontoPorLitro = 0.04f;
	            } else {
	                descontoPorLitro = 0.06f;
	            }
	            precoFinal = litros * preco_gasolina * (1 - descontoPorLitro);

	        } else {
	            System.out.println("Tipo de combustível inválido!");
	            input.close();
	            return;
	        }

	        
	        System.out.println("Valor a pagar: " + precoFinal + "R$");

	        input.close();

	}

}
