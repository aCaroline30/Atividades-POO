package Lista3;

//3. Faça um programa que leia e valide as seguintes informações:
//a. Nome: maior que 3 caracteres;
//b. Idade: entre 0 e 150;
//c. Salário: maior que zero;
//d. Sexo: 'f' ou 'm';
//e. Estado Civil: 's', 'c', 'v', 'd';

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
			
		String nome;
		int idade;
		float salario;
		String sexo, estado;
		
		
		do {
			System.out.println("Digite seu nome: ");
			nome = input.nextLine();
			System.out.println("Informe sua idade: ");
			idade = input.nextInt();
			System.out.println("Insira o valor do seu salário: ");
			salario = input.nextFloat();
			System.out.println("Informe seu sexo ('M' ou 'F'): ");
			sexo = input.next().toUpperCase();
			System.out.println("Informe seu estado civil (S - Solteiro; C - Casado; V - Viúvo; D - Divorciado): ");
			estado = input.next().toUpperCase();
			
			if (!((nome.length() >= 3 )
			&& (idade >= 0 && idade <= 150) 
			&& (salario > 0) 
			&& ((sexo.equals("M")) || (sexo.equals("F"))) 
			&& ((estado.equals("S")) || (sexo.equals("C")) || (sexo.equals("V")) || (sexo.equals("D"))))) {
				System.out.println("Inválido, tente novamente.");
				
				input.nextLine();
				
			}
				} while (!((nome.length() >= 3 )
						&& (idade >= 0 && idade <= 150) 
						&& (salario > 0) 
						&& ((sexo.equals("M")) || (sexo.equals("F"))) 
						&& ((estado.equals("S")) || (sexo.equals("C")) || (sexo.equals("V")) || (sexo.equals("D")))));
		
		System.out.println("OK");
		
		input.close();
	}
}
