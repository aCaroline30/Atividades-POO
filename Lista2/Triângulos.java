package Lista2;

import java.util.Scanner;

public class Triângulos {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o primeiro lado: ");
        float lado1 = input.nextFloat();

        System.out.print("Digite o segundo lado: ");
        float lado2 = input.nextFloat();

        System.out.print("Digite o terceiro lado: ");
        float lado3 = input.nextFloat();

  
        if ((lado1 + lado2 > lado3) && 
            (lado1 + lado3 > lado2) && 
            (lado2 + lado3 > lado1)) {

            System.out.println("Os valores formam um triângulo");

           
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Tipo: Equilátero (3 lados iguais).");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Tipo: Isósceles (2 lados iguais).");
            } else {
                System.out.println("Tipo: Escaleno (3 lados diferentes).");
            }

        } else {
            System.out.println("Os valores não formam um triângulo.");
        }

        input.close();
    

	}

}
