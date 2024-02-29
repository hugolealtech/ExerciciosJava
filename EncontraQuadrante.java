package exercicios;
import java.util.Scanner;

public class EncontraQuadrante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// se X positivo e Y positivo = Q1
		// se x negativo e Y positivo = Q2
		// se x negativo e Y negativo = Q3
		// se x positivo e Y negativo = Q4
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite valor de X");
		double x = sc.nextDouble();
		
		System.out.println("Digite valor de Y");
		double y = sc.nextDouble();
		
		
		if (x > 0 && y > 0) {
			System.out.println("Quadrante 01");
		}else if (x < 0 && y > 0) {
			System.out.println("Quadrante 02");
		}else if (x < 0 && y < 0) {
			System.out.println("Quadrante 03");
		}else if(x > 0 && y < 0 ) {
			System.out.println("Quadrante 04");
		}else {
			System.out.println("Origem");
		}
		
		
		sc.close();
	}
	
	
	
	

}
