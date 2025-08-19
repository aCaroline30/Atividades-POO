package Lista2;
//20. Faça um Programa que peça um número correspondente a um determinado ano e em
//seguida informe se este ano é ou não bissexto.
import java.util.Scanner;

public class anoBissexto2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

        System.out.print("Digite um ano: ");
        int ano = input.nextInt();

        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println(ano + " é um ano bissexto.");
        } else {
            System.out.println(ano + " não é um ano bissexto.");
        }

        input.close();

	}

}
