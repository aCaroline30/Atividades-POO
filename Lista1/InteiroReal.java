package Lista1;

import java.util.Scanner;

public class InteiroReal {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

        int num1, num2;
        float num3;

        System.out.print("Digite o primeiro número inteiro: ");
        num1 = input.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        num2 = input.nextInt();

        System.out.print("Digite um número real: ");
        num3 = input.nextFloat();

     
        float resultadoA = (2 * num1) * (num2 / 2.0f);

       
        float resultadoB = (3 * num1) + num3;

        
        float resultadoC = (float) Math.pow(num3, 3);

        System.out.println("a) Produto do dobro do primeiro com metade do segundo: " + resultadoA);
        System.out.println("b) Soma do triplo do primeiro com o terceiro: " + resultadoB);
        System.out.println("c) Terceiro elevado ao cubo: " + resultadoC);

        input.close();

	}

}
