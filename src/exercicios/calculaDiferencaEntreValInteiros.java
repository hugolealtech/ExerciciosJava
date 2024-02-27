package exercicios;

import java.util.Scanner;

public class calculaDiferencaEntreValInteiros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite valor de A:");
		double A =sc.nextDouble();
		System.out.print("Digite valor de B:");
		double B = sc.nextDouble();
		System.out.print("Digite valor de C:");
		double C = sc.nextDouble();
		System.out.print("Digite valor de D:");
		double D = sc.nextDouble();
		
		sc.close();
		double DIFERENCA = (A*B - C*D);
		
		System.out.print("o valor da diferença: " + DIFERENCA);
	}

}
