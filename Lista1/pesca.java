package Lista1;

//13.João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o
//rendimento diário de seu trabalho. Toda vez que ele traz um peso de peixes maior que o
//estabelecido pelo regulamento de pesca do estado de São Paulo (50 quilos) deve pagar
//uma multa de R$ 4,00 por quilo excedente. João precisa que você faça um programa
//que leia a variável peso (peso de peixes) e verifique se há excesso. Se houver, gravar na
//variável excesso e na variável multa o valor da multa que João deverá pagar. Caso
//contrário mostrar tais variáveis com o conteúdo ZERO OU NEGATIVO.

import java.util.Scanner;

public class pesca {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		final float limite = 50.0f;
		final float valor_multa_kg = 4.0f;
		
// final = o valor da variável após a inicialização não pode ser alterado;
		System.out.println("Informe o peso do peixe (kg): ");
		float peso = input.nextFloat();
		
		float excesso = peso - limite;
		float multa = 0.0f;
		
		if (excesso > 0) {
			multa = excesso * valor_multa_kg;
		} else {
			excesso = 0.0f;
			multa = 0.0f;
//decimais precisam do f no final para identificar que são float;			
		}
		
		System.out.println("Excesso: " + excesso + "kg");
		System.out.println("Multa: " + multa + "R$");
		
		input.close();
	}

}
