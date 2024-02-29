package expressoesComparativas;

import java.util.Locale;
import java.util.Scanner;

public class Tabuada {
	
	public static void main(String[]args) {
		
		Locale.setDefault(Locale.ENGLISH);
		Scanner sc = new Scanner(System.in);
		
		
		//Digite um numero n para que a partir dele seja formada a tabuada daquele numero de 1 à 10
		
		
		int n = sc.nextInt();
		int controle = 10;
		
		
		for (int i = 0; i < controle; i++) {
			
			if (i >= 0 && i <= controle ) {
				System.out.println( i + "  X  " + n + " = " + (i * n));
				
			}
		}
			
			
			
		
		
		
	}

}
