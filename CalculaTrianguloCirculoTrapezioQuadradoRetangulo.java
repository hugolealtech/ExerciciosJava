package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class CalculaTrianguloCirculoTrapezioQuadradoRetangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("digite valor de A: ");
		double A = sc.nextDouble();
		
		System.out.println("digite valor de B: ");
		double B = sc.nextDouble();
		
		System.out.println("digite valor de C: ");
		double C = sc.nextDouble();
		
		double pi = 3.14159;
		
		
		double areaTriangulo =  (A * C) / 2;
		double areaCirculo = pi*(C*C);	
		double areaTrapezio =   ((A + B)* C)/2;
		double areaQuadrado =   B * B;
		double areaRetangulo = A * B; 


		
		System.out.printf("TRIANGULO: %.3f%n", areaTriangulo);
		System.out.printf("CIRCULO: %.3f%n", areaCirculo);
		System.out.printf("TRAPEZIO: %.3f%n", areaTrapezio);
		System.out.printf("QUADRADO: %.3f%n", areaQuadrado);
		System.out.printf("RETANGULO: %.3f%n", areaRetangulo);
			sc.close();
		}
	}
