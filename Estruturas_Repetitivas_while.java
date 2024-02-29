package secao06_Estruturas_Repetitivas;
import java.util.Scanner;

public class Estruturas_Repetitivas_while {
	
	public static void main(String []args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Adivinhe o numero que estou pensando: ");
		int numPensado = sc.nextInt();
		
		while (numPensado != 11 && numPensado < 30) {
			System.out.println("Errou!");
			System.out.println("Tenta de novo");
			numPensado = sc.nextInt();
		}
		System.out.println("Acertou!!!");
		
		
		sc.close();
	}

}
