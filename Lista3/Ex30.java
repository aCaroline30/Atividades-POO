package Lista3;

import java.util.Scanner;

//30. Uma academia deseja fazer um senso entre seus clientes para descobrir o mais alto, o
//mais baixo, a mais gordo e o mais magro, para isto você deve fazer um programa que
//pergunte a cada um dos clientes da academia seu código, sua altura e seu peso. O final da
//digitação de dados deve ser dada quando o usuário digitar 0 (zero) no campo código. Ao
//encerrar o programa também deve ser informados os códigos e valores do clente mais alto,
//do mais baixo, do mais gordo e do mais magro, além da média das alturas e dos pesos dos
//clientes.

public class Ex30 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);

	        int codigo;
	        double altura, peso;

	      
	        int codMaisAlto = 0, codMaisBaixo = 0, codMaisGordo = 0, codMaisMagro = 0;
	        double maiorAltura = Double.MIN_VALUE, menorAltura = Double.MAX_VALUE;
	        double maiorPeso = Double.MIN_VALUE, menorPeso = Double.MAX_VALUE;

	       
	        double somaAlturas = 0, somaPesos = 0;
	        int totalClientes = 0;

	        System.out.println("Senso da Academia");

	        while (true) {
	            System.out.println("Digite o código do cliente (0 para encerrar): ");
	            codigo = input.nextInt();

	            if (codigo == 0) {
	                break;
	            }

	            System.out.println("Digite a altura (em metros): ");
	            altura = input.nextDouble();

	            System.out.println("Digite o peso (em kg): ");
	            peso = input.nextDouble();

	           
	            if (altura > maiorAltura) {
	                maiorAltura = altura;
	                codMaisAlto = codigo;
	            }
	            if (altura < menorAltura) {
	                menorAltura = altura;
	                codMaisBaixo = codigo;
	            }
	            if (peso > maiorPeso) {
	                maiorPeso = peso;
	                codMaisGordo = codigo;
	            }
	            if (peso < menorPeso) {
	                menorPeso = peso;
	                codMaisMagro = codigo;
	            }

	            somaAlturas += altura;
	            somaPesos += peso;
	            totalClientes++;
	        }

	      
	        if (totalClientes > 0) {
	            System.out.println("\n=== Resultado do Senso ===");
	            System.out.printf("Cliente mais alto: Código %d - Altura: %.2f m\n", codMaisAlto, maiorAltura);
	            System.out.printf("Cliente mais baixo: Código %d - Altura: %.2f m\n", codMaisBaixo, menorAltura);
	            System.out.printf("Cliente mais gordo: Código %d - Peso: %.2f kg\n", codMaisGordo, maiorPeso);
	            System.out.printf("Cliente mais magro: Código %d - Peso: %.2f kg\n", codMaisMagro, menorPeso);

	            System.out.printf("Média das alturas: %.2f m\n", (somaAlturas / totalClientes));
	            System.out.printf("Média dos pesos: %.2f kg\n", (somaPesos / totalClientes));
	        } else {
	            System.out.println("Nenhum cliente foi registrado.");
	        }

	        input.close();

	}

}
