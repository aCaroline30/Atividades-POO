package Lista3;

import java.util.Scanner;

//35. O cardápio de uma lanchonete é o seguinte:
//• Especificação Código Preço
//Cachorro Quente 100 R$ 1,20
//Bauru Simples 101 R$ 1,30
//Bauru com ovo 102 R$ 1,50
//Hambúrguer 103 R$ 1,20
//Cheeseburguer 104 R$ 1,30
//Refrigerante 105 R$ 1,00
//
//Faça um programa que leia o código dos itens pedidos e as quantidades desejadas. Calcule e
//mostre o valor a ser pago por item (preço * quantidade) e o total geral do pedido. Considere
//que o cliente deve informar quando o pedido deve ser encerrado.

public class Ex35 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);

	        int codigo, quantidade;
	        double totalGeral = 0;

	        System.out.println(" Cardápio ");
	        System.out.println("100 - Cachorro Quente   R$ 1,20");
	        System.out.println("101 - Bauru Simples     R$ 1,30");
	        System.out.println("102 - Bauru com ovo     R$ 1,50");
	        System.out.println("103 - Hambúrguer        R$ 1,20");
	        System.out.println("104 - Cheeseburguer     R$ 1,30");
	        System.out.println("105 - Refrigerante      R$ 1,00");
	        System.out.println("Digite 0 no código para encerrar o pedido.");

	        while (true) {
	            System.out.print("Digite o código do item: ");
	            codigo = input.nextInt();

	            if (codigo == 0) {
	                break;
	            }

	            System.out.print("Digite a quantidade: ");
	            quantidade = input.nextInt();

	            double preco = 0;
	            String item = "";

	            switch (codigo) {
	                case 100:
	                    preco = 1.20;
	                    item = "Cachorro Quente";
	                    break;
	                case 101:
	                    preco = 1.30;
	                    item = "Bauru Simples";
	                    break;
	                case 102:
	                    preco = 1.50;
	                    item = "Bauru com ovo";
	                    break;
	                case 103:
	                    preco = 1.20;
	                    item = "Hambúrguer";
	                    break;
	                case 104:
	                    preco = 1.30;
	                    item = "Cheeseburguer";
	                    break;
	                case 105:
	                    preco = 1.00;
	                    item = "Refrigerante";
	                    break;
	                default:
	                    System.out.println("Código inválido!");
	                    continue; 
	            }

	            double valorItem = preco * quantidade;
	            totalGeral += valorItem;

	            System.out.printf("%s x%d -> R$ %.2f\n", item, quantidade, valorItem);
	        }

	        System.out.printf("Total do pedido: R$" + totalGeral);

	        input.close();

	}

}
