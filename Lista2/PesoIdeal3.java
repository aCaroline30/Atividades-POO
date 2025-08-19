package Lista2;
//9. Tendo como dado de entrada a altura, peso e sexo, construa um algoritmo que calcule
//o peso ideal, utilizando as seguintes fórmulas:
//Para homens: (72.7*h) - 58
//Para mulheres: (62.1*h) - 44.7
//(h = altura)
//Ao final o algoritmo deve mostrar:
//- Altura, peso e sexo;
//- Peso Ideal;
//- Mensagem se está acima, abaixo ou no peso ideal;

import java.util.Scanner;

public class PesoIdeal3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		float altura;
		float peso, pesoIdeal = 0;
		String sexo;
		
		System.out.println("Informe sua altura (em metros): ");
		altura = input.nextFloat();
		System.out.println("Informe seu peso (kg): ");
		peso = input.nextFloat();
		System.out.println("Informe seu sexo ('M' ou 'F'): ");
		sexo = input.next().toUpperCase();
		
		  if (sexo.equals("M")) {
	            pesoIdeal = (72.7f * altura) - 58;
	        } else if (sexo.equals("F")) {
	            pesoIdeal = (62.1f * altura) - 44.7f;
	        } else {
	            System.out.println("Sexo inválido!");
	            System.exit(0);
	           
	            
	        }
		  System.out.println("Altura: " + altura + " m");
	      System.out.println("Peso: " + peso + " kg");
	      System.out.println("Sexo: " + (sexo.equals("M") ? "Masculino" : "Feminino"));
	      System.out.println("Peso Ideal: " + pesoIdeal + "Kg");
	     
	      if (peso > pesoIdeal) {
	            System.out.println("Você está acima do peso ideal");
	        } else if (peso < pesoIdeal) {
	            System.out.println("Você está abaixo do peso ideal");
	        } else {
	            System.out.println("Você está no peso ideal");
	        }
	      input.close();
	}

}
