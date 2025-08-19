package Lista3;

//25. O Sr. Manoel Joaquim possui uma grande loja de artigos de R$ 1,99, com cerca de 10
//caixas. Para agilizar o cálculo de quanto cada cliente deve pagar ele desenvolveu um tabela
//que contém o número de itens que o cliente comprou e ao lado o valor da conta. Desta forma
//a atendente do caixa precisa apenas contar quantos itens o cliente está levando e olhar na
//tabela de preços. Você foi contratado para desenvolver o programa que monta esta tabela de
//preços, que conterá os preços de 1 até 50 produtos.

public class Ex25 {

	public static void main(String[] args) {
		
		 System.out.println("Lojas Quase Dois - Tabela de Preços");

	        double precoUnitario = 1.99;

	        for (int i = 1; i <= 50; i++) {
	            double total = i * precoUnitario;
	            System.out.printf("%d - R$ %.2f%n", i, total);
	        }
	}

}
