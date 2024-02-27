package exercicios;

import java.util.Scanner;

public class switchCase {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String dia = "";
		
		System.out.println("Digite quantas vezes ter tentar");
		int tentativa = entrada.nextInt();
	
		for (int i = 0; i < tentativa; i++){

		System.out.println  ("Digite um numero entre 1 a 7 para dia da semana: ");
		int x =  entrada.nextInt();
		
		
		switch (x) {
		case 1:
			dia = "Domingo";
			break;
		case 2:
			dia = "Segunda-Feira";
			break;
		case 3:
			dia = "Terca-Feira";
			break;
		case 4:
			dia = "Quarta-feira";
			break;
		case 5:
			dia = "Quinta-Feira";
			break;
		case 6:
			dia = "Sexta-Feira";
			break;
		case 7:
			dia = "Sabado";
			break;
		default:
			dia = "Valor invalido";
			break;
		}
		
		System.out.println ("O dia e:  " + dia);
		
		
		}	System.out.println("Fim do programa!");
			entrada.close();
	}
}	
	
	
	
	/*public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	
	String dia = "";

	System.out.println  ("Digite um numero entre 1 a 7 para dia da semana: ");
	int x =  entrada.nextInt();

	if (x == 1) {
		dia = "Domingo";
		} else if (x == 2) {
			dia = "Segunda";
		} else if (x == 3) {
			dia = "Terca";
		} else if (x == 4) {
			dia = "Quarta";
		} else if (x == 5) {
			dia = "Quinta";
		} else if (x == 6) {
			dia = "Sexta";
		} else if (x == 7) {
			dia = "Sabado";
		} else {
			System.out.println("Data invalida");

		}
		System.out.println("O dia eh "+  dia);
	
	}*/
	
	
	
