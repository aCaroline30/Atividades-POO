package Lista3;

//26. O Sr. Manoel Joaquim acaba de adquirir uma panificadora e pretende implantar a
//metodologia da tabelinha, que já é um sucesso na sua loja de 1,99. Você foi contratado para
//desenvolver o programa que monta a tabela de preços de pães, de 1 até 50 pães, a partir do
//preço do pão informado pelo usuário, conforme o exemplo abaixo:
//• Preço do pão: R$ 0.18.

public class Ex26 {

	public static void main(String[] args) {
		 System.out.println("Panficadora - Tabela de Preços");

	        double precoUnitario = 0.18;

	        for (int i = 1; i <= 50; i++) {
	            double total = i * precoUnitario;
	            System.out.printf("%d - R$ %.2f%n", i, total);
	        }
	}

}
