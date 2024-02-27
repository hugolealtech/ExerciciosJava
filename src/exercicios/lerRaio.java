package exercicios;

import java.util.Scanner;

public class lerRaio {
	
	public static void main (String []arg) {

	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("digite valor de raio para achar area");
	
	double raio = sc.nextDouble();
	
	double pi = 3.14159;
	
	double area = pi*(raio*raio);
	
	System.out.println("O valor da area e de " + area);
	
	
	sc.close();
	
	}
}
