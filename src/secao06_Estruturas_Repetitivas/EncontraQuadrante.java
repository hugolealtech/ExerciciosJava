package secao06_Estruturas_Repetitivas;

import java.util.Scanner;

public class EncontraQuadrante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite Valore de X");

		int x = sc.nextInt();

		System.out.println("Digite Valor de Y");
		int y = sc.nextInt();

		while (x != 0 && y != 0) {

			

			if (x > 0 && y > 0) {
				System.out.println("Quadrante 01");
				System.out.println("Digite novamente: ");
				
			} else if (x < 0 && y > 0) {
				System.out.println("Quadrante 02");
				System.out.println("Digite novamente: ");
				
			} else if (x < 0 && y < 0) {
				System.out.println("Quadrante 03");
				System.out.println("Digite novamente: ");
				
			} else if (x > 0 && y < 0) {
				System.out.println("Quadrante 04");
				System.out.println("Digite novamente: ");
				
			} else {
				System.out.println("Origem");
			}
			x = sc.nextInt();
			y = sc.nextInt();

			System.out.println("Fim do programa!");

			sc.close();

		}
	}
}
