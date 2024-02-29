package exercicios;
import java.util.Scanner;

public class EncontraNumerosPositivosENegativos {
	
	public static void main (String []args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite um numero: ");
		double numero = sc.nextDouble();
		
		if (numero < 0) {
			System.out.println("numero negativo!");
			
		}else {
			System.out.println("numero positivo");
		}
		
		sc.close();
		
	}

}
