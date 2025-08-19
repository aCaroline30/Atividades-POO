package Lista2;

import java.util.Scanner;

public class IdadeTurma {

	public static void main(String[] args) {
		
		 Scanner input = new Scanner(System.in);

	      
	        System.out.println("Digite a idade do primeiro aluno: ");
	        int idade1 = input.nextInt();

	        System.out.println("Digite a idade do segundo aluno: ");
	        int idade2 = input.nextInt();

	        System.out.println("Digite a idade do terceiro aluno: ");
	        int idade3 = input.nextInt();

	        
	        float media = (idade1 + idade2 + idade3) / 3.0f;

	       
	        if (media < 25) {
	            System.out.println("Turma Jovem");
	        } else if (media <= 40) {
	            System.out.println("Turma Adulta");
	        } else {
	            System.out.println("Turma Idosa");
	        }

	        input.close();

	}

}
