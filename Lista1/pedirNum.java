package Lista1;

import java.util.Scanner;

//2. Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].
public class pedirNum {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double num;
		System.out.println("Insira um número ");
		num = input.nextDouble();
		System.out.println("O número informado foi: " + num);
		
		input.close();
	}

}