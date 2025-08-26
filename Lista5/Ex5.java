package Lista5;

import java.util.*;


//5. Criar uma loteria com 6 números de 1 a 60. Solicitar ao usuário quantas cartelas deseja
//preencher criar uma matriz deste tamanho para armazenar os valores que serão criados
//aleatoriamente. No final analisar cada uma das cartelas e mostrar ao lado do números (ordenados
//em ordem crescente e não repetidos dentro da mesma cartela) o total de acertos.

public class Ex5 {

	public static void main(String[] args) {
		 
        Scanner input = new Scanner(System.in);
        Random random = new Random();

      
        int[] sorteio = gerarNumeros(random);
        System.out.println("Números sorteados: " + Arrays.toString(sorteio));

  
        System.out.print("Quantas cartelas deseja preencher? ");
        int n = input.nextInt();

       
        int[][] cartelas = new int[n][6];

        for (int i = 0; i < n; i++) {
            cartelas[i] = gerarNumeros(random); 
        }

    
        System.out.println("\n--- Resultados das Cartelas ---");
        for (int i = 0; i < n; i++) {
            int acertos = contarAcertos(cartelas[i], sorteio);
            System.out.println("Cartela " + (i + 1) + ": " 
                               + Arrays.toString(cartelas[i]) 
                               + " | Acertos: " + acertos);
        }

        input.close();
    }

    
    public static int[] gerarNumeros(Random random) {
        Set<Integer> numeros = new HashSet<>();
        while (numeros.size() < 6) {
            numeros.add(random.nextInt(60) + 1); // 1 a 60
        }
        int[] resultado = numeros.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(resultado);
        return resultado;
    }

    public static int contarAcertos(int[] cartela, int[] sorteio) {
        int acertos = 0;
        for (int num : cartela) {
            for (int s : sorteio) {
                if (num == s) {
                    acertos++;
                }
            }
        }
        return acertos;

	}

}
