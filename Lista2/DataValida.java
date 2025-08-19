package Lista2;
//21. Faça um Programa que peça uma data no formato dd/mm/aaaa e determine se a mesma
//é uma data válida.
import java.util.Scanner;

public class DataValida {

	public static void main(String[] args) {
		
		 Scanner input = new Scanner(System.in);

	        System.out.println("Digite uma data no formato dd/mm/aaaa: ");
	        String data = input.nextLine();

	        
	        // para quebrar a string em partes
	        String[] partes = data.split("/");

	        // Verifica se possui 3 partes (dia, mês, ano)
	        if (partes.length != 3) {
	            System.out.println("Data inválida, formato incorreto.");
	            return;
	        }

	        try {
	            int dia = Integer.parseInt(partes[0]);
	            int mes = Integer.parseInt(partes[1]);
	            int ano = Integer.parseInt(partes[2]);

	           
	            if (mes < 1 || mes > 12) {
	                System.out.println("Data inválida, mês incorreto.");
	                return;
	            }

	         
	            int[] diasMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	           
	            if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
	                diasMes[1] = 29;
	            }

	   
	            if (dia < 1 || dia > diasMes[mes - 1]) {
	                System.out.println("Data inválida, dia incorreto.");
	                return;
	            }

	            System.out.println("Data válida: " + data);

	        } catch (NumberFormatException e) {
	            System.out.println("Data inválida, valores não numéricos");
	        }

	        input.close();

	}

}
