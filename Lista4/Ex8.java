package Lista4;

//8. Dado um vetor contendo todas as letras do nosso alfabeto (minúsculas) gere uma senha para
//o usuário. Para isto o usuário deve informar o tamanho da senha que deseja, este tamanho
//deve ser menor que a quantidade de letras no vetor. A senha gerada deve seguir o padrão
//consoante+vogal para tamanhos pares e consoante+vogal e terminada em consoante para
//tamanhos ímpares.
import java.util.Random;
import java.util.Scanner;

public class Ex8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		
		char letras[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n',
				'o','p','q','r','s','t','u','v','w','x','y','z'
		};
		
		System.out.println("Informe o tamanho da senha: ");
		int tamanho = input.nextInt();
		
		if (tamanho < 2 || tamanho > 26) {
			System.out.println("O tamanho deve ser entre 2 e 26");
			return;
		}
	
		String senha = "";
		
			//verifica se é vogal
		   java.util.function.Predicate<Character> ehVogal = c ->
           c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
		 
           for (int i = 0; i < tamanho / 2; i++) {
               // pega uma consoante 
               char c;
               do {
                   c = letras[random.nextInt(letras.length)];
               } while (ehVogal.test(c));
               
               
           
               // pega uma vogal 
               char v;
               do {
            	   v = letras[random.nextInt(letras.length)];
            	   
               } while (!ehVogal.test(v));

               senha += "" + c + v;
           }

     
           if (tamanho % 2 != 0) {
        	   char c;
        	   
        	   do {
        		   c = letras[random.nextInt(letras.length)];
        		   
        	   } while (ehVogal.test(c));
        	   
        	   senha += c;
           }

           System.out.println("Senha gerada: " + senha);
           
           input.close();
	}
}
