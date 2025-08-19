package Lista2;

import java.util.Scanner;

//11.Faça um Programa que pergunte em que turno você estuda. Peça para digitar M-
//Matutino ou V-Vespertino ou N- Noturno. Imprima a mensagem "Bom Dia!", "Boa
//Tarde!" ou "Boa Noite!" , conforme o caso.

public class Turno {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		String turno;
		
		System.out.println("Em qual turno você estuda? (M - matutino, V - vespertino, N - noturno): ");
		turno = input.next().toUpperCase();
		
		  if (turno.equals("M")) {
	            System.out.println("Bom Dia!");
	        } else if (turno.equals("V")) {
	            System.out.println("Boa Tarde!");
	        } else if (turno.equals("N")) {
	            System.out.println("Boa Noite!");
	        } else {
	            System.out.println("Valor inválido!");
	        }
		  input.close();
	}

}
