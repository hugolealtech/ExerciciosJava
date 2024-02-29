package expressoesComparativas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite Valor N:");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			
			System.out.println("Informe valor de teste 1");
			double teste1 = sc.nextDouble();
			System.out.println("Informe valor de teste 2");
			double teste2 = sc.nextDouble();
			System.out.println("Informe valor de teste 3");
			double teste3 = sc.nextDouble();

			double mediaPonderada = (teste1 * 2.0 + teste2 * 3.0 + teste3 * 5.0) / (2.0 + 3.0 + 5.0);
			System.out.printf("Valor de Média ponderada:  %.1f%n", mediaPonderada);

		}sc.close(); 
		 
	}

}/*Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
peso 5.*/


