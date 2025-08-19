package Lista2;

import java.util.Scanner;

public class Fruta {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        
        System.out.print("Digite a quantidade de morangos (Kg): ");
        float kgMorango = input.nextFloat();

        System.out.print("Digite a quantidade de maçãs (Kg): ");
        float kgMaca = input.nextFloat();

        
        float precoMorango;
        float precoMaca;

        if (kgMorango <= 5) {
            precoMorango = 2.50f;
        } else {
            precoMorango = 2.20f;
        }

        if (kgMaca <= 5) {
            precoMaca = 1.80f;
        } else {
            precoMaca = 1.50f;
        }

        
        float valorMorango = kgMorango * precoMorango;
        float valorMaca = kgMaca * precoMaca;
        float totalKg = kgMorango + kgMaca;
        float valorTotal = valorMorango + valorMaca;

       
        if (totalKg > 8 || valorTotal > 25.0) {
            valorTotal *= 0.90;
        }

     
        System.out.println("Valor a pagar: " + valorTotal + "R%");

        input.close();

	}

}
