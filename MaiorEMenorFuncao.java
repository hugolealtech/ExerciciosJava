package funcoesProcedural;

import java.util.Scanner;

public class MaiorEMenorFuncao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter three Numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		
		int maior = max(a,b,c);
		
		ExibirResultado (maior);
		
		sc.close();		
	}
	
	public static int max(int a, int b, int c) {
		int variavelAuxiliar;
		
		if( a > b && a > c) {
			variavelAuxiliar = a;
		}else if  (b > c ){
			variavelAuxiliar = b;
		}else {
			variavelAuxiliar = c;
		}
		return variavelAuxiliar;
		
	}
	public static void ExibirResultado(int value) {
		System.out.println("Maior Numero: " + value);
	}

}
