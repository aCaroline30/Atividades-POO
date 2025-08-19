package Lista2;

import java.util.Scanner;

public class InteiroDecimal {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

       
        System.out.print("Digite um número: ");
        double numero = input.nextDouble();

        // Verifica se é inteiro ou decimal usando arredondamento
        if (numero == Math.floor(numero)) {
            System.out.println("O número " + numero + " é inteiro");
        } else {
            System.out.println("O número " + numero + " é decimal");
        }

        input.close();

	}

}
