package Lista4;

//10. Faça um programa que peça uma data no padrão dd/mm/aaaa, valide esta data e coloque
//cada item em uma posição de um vetor de inteiros de tamanho 3.

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int data[] = new int[3];
		
		 System.out.print("Digite a data no formato dd/mm/aaaa: ");
	        String entrada = input.nextLine();

	        // Quebra a string pelo separador "/"
	        String[] partes = entrada.split("/");

	        if (partes.length != 3) {
	            System.out.println("Formato inválido! Use dd/mm/aaaa.");
	            return;
	        }
	        //converter string para inteiro
	        try {
	            data[0] = Integer.parseInt(partes[0]);
	            data[1] = Integer.parseInt(partes[1]);
	            data[2] = Integer.parseInt(partes[2]);
	        } catch (NumberFormatException e) {
	            System.out.println("Data inválida! Use apenas números.");
	            return;
	        }

	        // Validação da data
	        if (validaData(data[0], data[1], data[2])) {
	            System.out.println("Data válida!");
	            System.out.println("Dia: " + data[0]);
	            System.out.println("Mês: " + data[1]);
	            System.out.println("Ano: " + data[2]);
	        } else {
	            System.out.println("Data inválida!");
	        }
	    }

	    public static boolean validaData(int dia, int mes, int ano) {
	        
	        if (mes < 1 || mes > 12) return false;

	      
	        int[] diasNoMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	      
	        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
	            diasNoMes[1] = 29;
	        }

	      
	        if (dia < 1 || dia > diasNoMes[mes - 1]) return false;

	        return true;
	       
	}

}
