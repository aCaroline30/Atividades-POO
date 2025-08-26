package Lista4;

import java.util.Scanner;

//15. Faça um programa que use um vetor de tamanho N (constante), peça ao usuário para
//informar os valores que devem ser validados, somente devem ser aceitos valores entre 0 e 20
//(inclusive 0 e 20). Após isto deve ser gerado um gráfico com cada um dos valores conforme
//o exemplo abaixo (levando em consideração que os valores informados no vetor foram 4, 2
//e 1)
//4: ####
//2:##
//1:#

public class Ex15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        final int N = 10; 
        int[] valores = new int[N];

   
        for (int i = 0; i < N; i++) {
            int num;
            do {
                System.out.print("Informe o valor " + (i + 1) + " (entre 0 e 20): ");
                num = input.nextInt();
                if (num < 0 || num > 20) {
                    System.out.println("Valor inválido! Digite novamente.");
                }
            } while (num < 0 || num > 20);
            valores[i] = num;
        }

      
        System.out.println("Gráfico:");
        for (int i = 0; i < N; i++) {
            System.out.print(valores[i] + ": ");
            for (int j = 0; j < valores[i]; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
        input.close();
	}

}
