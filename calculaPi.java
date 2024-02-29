package cursoJava;

import java.util.Scanner;

public class calculaPi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		double pi = 3.14159;
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("digite valor de area");
		double A = entrada.nextDouble();
		
		//System.out.println ("digite o segundo numero");
		//double B = entrada.nextDouble();
		
		double area  = pi*(A*A);
		
		System.out.println("O valor da area eh " + area);
		
		entrada.close();
		

	}

}
