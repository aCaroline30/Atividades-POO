package Lista2;

import java.util.Scanner;

public class Operacoes {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);

	    
	        System.out.print("Digite o primeiro número: ");
	        float num1 = input.nextFloat();

	        System.out.print("Digite o segundo número: ");
	        float num2 = input.nextFloat();

	        
	        System.out.println("Escolha a operação:");
	        System.out.println("1 - Soma");
	        System.out.println("2 - Subtração");
	        System.out.println("3 - Multiplicação");
	        System.out.println("4 - Divisão");
	        System.out.println("Opção: ");
	        int opcao = input.nextInt();

	        float resultado = 0;
	        boolean operacaoValida = true;

	        switch (opcao) {
	            case 1:
	                resultado = num1 + num2;
	                break;
	            case 2:
	                resultado = num1 - num2;
	                break;
	            case 3:
	                resultado = num1 * num2;
	                break;
	            case 4:
	                if (num2 != 0) {
	                    resultado = num1 / num2;
	                } else {
	                    System.out.println("Erro: divisão por zero não é permitida!");
	                    operacaoValida = false;
	                }
	                break;
	            default:
	                System.out.println("Opção inválida!");
	                operacaoValida = false;
	        }

	       
	        if (operacaoValida) {
	            System.out.println("Resultado da operação: " + resultado);

	          
	            if (resultado > 0) {
	                System.out.println("O número é positivo");
	            } else if (resultado < 0) {
	                System.out.println("O número é negativo");
	            } else {
	                System.out.println("O número é zero");
	            }

	            
	            if (resultado == Math.floor(resultado)) {
	                System.out.println("O número é inteiro");
	            } else {
	                System.out.println("O número é decimal");
	            }

	           
	            if (resultado == Math.floor(resultado)) {
	                if (((long) resultado) % 2 == 0) {
	                    System.out.println("O número é par");
	                } else {
	                    System.out.println("O número é ímpar");
	                }
	            } else {
	                System.out.println("Não é possível verificar par/ímpar para números decimais");
	            }
	        }

	        input.close();

	}

}
