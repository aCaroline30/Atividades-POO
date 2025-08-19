package Lista3;

//2. Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao
//nome do usuário, mostrando uma mensagem de erro e voltando a pedir as informações.

import java.util.Scanner;

public class Ex2 {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			
			String nome, senha;
			
			
			
			do {
				
				System.out.println("Crie um nome de usuário: ");
				nome = input.nextLine();
				System.out.println("Crie uma senha: ");
				senha = input.next();
				
				if (nome.equals(senha)) {
					System.out.println("O nome de usuário e senha não podem ser iguais. Tente novamente");
				}
			
					} while (nome.equals(senha));
					System.out.println("OK");
			
		input.close();
	}
}
