package expressoesComparativas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// Ler N int e pos. Mostrar N linhas e cada linha i*i e i*i*i
		
			Locale.setDefault(Locale.ENGLISH);
			Scanner sc = new Scanner(System.in);
			
			
			System.out.println("Digite valor de n: ");
			int n = sc.nextInt();
			
			for(int i = 1; i <= n; i++) {
				
				System.out.println(i + " " + i*i + " " + i*i*i);
					
			}
	
		sc.close();
	}
}
/*
import java.util.Scanner;

public class uri1143 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            int primeiro = i;
            int segundo = i * i;
            int terceiro = i * i * i;
            System.out.printf("%d %d %d%n", primeiro, segundo, terceiro);
        }

        sc.close();
    }
}

*/