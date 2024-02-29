package exercicios;
import java.util.Scanner;
public class IdentificaNumerosMultiplos {
	
	public static void main (String []args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("--------------------------");
		System.out.println("Bem vindo ao progra que encontra se dois numeros são multiplos entre si!!!");
		
		System.out.println("Digite quantas vezes quer rodar o programa: ");
		int qvezes = sc.nextInt();
		
		
		
		for (int i = 0; i <= qvezes; i++ ) {
			
			System.out.println("---------------- Iniciando programa ---------------");
		
			System.out.println("Digite um Numero: ");
			double num1 = sc.nextInt();
		
			System.out.println("Digite outro Numero: ");
			double num2 = sc.nextInt();
		
				
			if (num1 % num2 == 0 || num2 % num1 == 0) {
					System.out.println("Numeros multiplos entre si");
				}else
					System.out.println("Numeros não multiplos entre si");
				
		}
		System.out.println("fim do programa!");
		sc.close();
	}

}
