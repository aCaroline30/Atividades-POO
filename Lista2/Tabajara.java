package Lista2;

import java.util.Scanner;

public class Tabajara {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

        
        System.out.println("=== Promoção Hipermercado Tabajara ===");
        System.out.println("Tipos de carne:");
        System.out.println("1 - Filé Duplo");
        System.out.println("2 - Alcatra");
        System.out.println("3 - Picanha");

        
        System.out.println("Digite o número correspondente ao tipo de carne: ");
        int tipoCarne = input.nextInt();

        String nomeCarne;
        float precoKg;

        
        System.out.println("Digite a quantidade (Kg): ");
        float quantidade = input.nextFloat();

      
        switch (tipoCarne) {
            case 1:
                nomeCarne = "Filé Duplo";
                precoKg = (quantidade <= 5) ? 4.90f : 5.80f;
                break;
            case 2:
                nomeCarne = "Alcatra";
                precoKg = (quantidade <= 5) ? 5.90f : 6.80f;
                break;
            case 3:
                nomeCarne = "Picanha";
                precoKg = (quantidade <= 5) ? 6.90f : 7.80f;
                break;
            default:
                System.out.println("Opção inválida!");
                input.close();
                return;
        }

        
        float valorTotal = quantidade * precoKg;

        
        System.out.print("Pagamento com cartão Tabajara? (s/n): ");
        String cartao = input.next().trim().toLowerCase();

        float desconto = 0;
        if (cartao.equals("s") || cartao.equals("sim")) {
            desconto = valorTotal * 0.05f;
        }

        float valorFinal = valorTotal - desconto;

        
        System.out.println("\n===== CUPOM FISCAL =====");
        System.out.printf("Tipo de carne: " + nomeCarne);
        System.out.printf("Quantidade: " + quantidade);
        System.out.printf("Preço por Kg: " + precoKg + "Kg");
        System.out.printf("Preço total: " + valorTotal + "R$");
        System.out.printf("Tipo de pagamento: %s\n", 
                          (desconto > 0) ? "Cartão Tabajara" : "Outro");
        System.out.printf("Desconto: " + desconto + "R$");
        System.out.printf("Valor a pagar: " + valorFinal + "R$");

        input.close();

	}

}
