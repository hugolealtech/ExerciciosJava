package expressoesComparativas;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite valor de n: ");
		int n = sc.nextInt();
		
		
		for (int i = 1 ; i <= n; i++) {
			
			System.out.println("Execução numero "+ i);
			System.out.println("----------------------");
			System.out.println("Digite o valor de n1:");
			double n1 = sc.nextDouble();
			System.out.println("Digite o valor de n2");
			double n2 = sc.nextDouble();
			
			if  (n2 != 0) {
				Double div = n1 / n2;
				System.out.println("O resultado: "+ div);
				System.out.println("----------------------");
				
			}else  {
				System.out.println("Divisão impossível");
				System.out.println("----------------------");
			}
			
				System.out.println("Fim Programa");
				
			}sc.close();
			
		}
	}


