package exercicios;


import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o numero  da tabuada que deseja:");
		
		int n = sc.nextInt();
		int controle = 10;
		
		System.out.println("------------Tabuada de " + n + " -------------");
		
		for (int i = 0; i <= controle; i++) {
			
			System.out.println(n + "  X  " + i + "  = " + (i * n));
		}
		System.out.println("--------------------------");
		System.out.println ("Fim do Programa!");
		
		sc.close();
	}

}
