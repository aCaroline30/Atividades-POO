package Lista1;
//8. Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.
import java.util.Scanner;

public class salarioMes {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		float valor;
		int horas;
		
		System.out.println("Informe qual o valor que recebe por hora: ");
		valor = input.nextFloat();
		System.out.println("Informe quantas horas trabalha por mês: ");
		horas = input.nextInt();
		
		System.out.println("Você recebe " + (valor*horas) + "R$ por mês");
		
		input.close();

	}

}
