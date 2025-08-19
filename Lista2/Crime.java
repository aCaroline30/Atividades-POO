package Lista2;

import java.util.Scanner;

public class Crime {

	public static void main(String[] args) {
		
		 Scanner input = new Scanner(System.in);

	        String[] perguntas = {
	            "Telefonou para a vítima? (s/n): ",
	            "Esteve no local do crime? (s/n): ",
	            "Mora perto da vítima? (s/n): ",
	            "Devia para a vítima? (s/n): ",
	            "Já trabalhou com a vítima? (s/n): "
	        };

	        int respostasPositivas = 0;

	      
	        for (String pergunta : perguntas) {
	            System.out.print(pergunta);
	            String resposta = input.next().trim().toLowerCase();

	            if (resposta.equals("s") || resposta.equals("sim")) {
	                respostasPositivas++;
	            }
	        }

	       
	        System.out.print("Classificação: ");
	        if (respostasPositivas == 2) {
	            System.out.println("Suspeita");
	        } else if (respostasPositivas >= 3 && respostasPositivas <= 4) {
	            System.out.println("Cúmplice");
	        } else if (respostasPositivas == 5) {
	            System.out.println("Assassino");
	        } else {
	            System.out.println("Inocente");
	        }

	        input.close();

	}

}
