package expressoesComparativas;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// Ler um numero inteiro N e calcular todos os seus divisores

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite valor de n: ");
		int n = sc.nextInt();
	
		
		for (int i = 1; i < n; i++) {
			
			
			if (n % i == 0) {
				int divisao = n/i;
				
				System.out.println(divisao);
			}
						
		}sc.close();
		
		
		
	}

}
