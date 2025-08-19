package Lista3;

import java.util.Scanner;

//21. Faça um programa que peça para n pessoas a sua idade, ao final o programa devera
//verificar se a média de idade da turma varia entre 0 e 25,26 e 60 e maior que 60; e então,
//dizer se a turma é jovem, adulta ou idosa, conforme a média calculada.

public class Ex21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        int n;
        int somaIdades = 0;

        System.out.print("Digite o número de pessoas da turma: ");
        n = input.nextInt();

        
        for (int i = 1; i <= n; i++) {
            System.out.println("Digite a idade da pessoa " + i + ": ");
            int idade = input.nextInt();
            somaIdades = somaIdades + idade;
        }
        float media = (float) somaIdades / n;

        System.out.println("Média de idades : " + media);

        if (media >= 0 && media <= 25) {
            System.out.println("Turma Jovem");
        } else if (media <= 60) {
            System.out.println("Turma Adulta");
        } else {
            System.out.println("Turma Idosa");
        }

        input.close();

	}

}
