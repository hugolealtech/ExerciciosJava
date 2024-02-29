package exercicios;

import java.util.Scanner;


/*
 Uma operadora de telefonia cobra R$ 50.00 por um plano básico que
dá direito a 100 minutos de telefone. Cada minuto que exceder a
franquia de 100 minutos custa R$ 2.00. Fazer um programa para ler a
quantidade de minutos que uma pessoa consumiu, daí mostrar o valor
a ser pago.
 */

public class calculaValorTelefone {

	public static void main(String[] args) {	
	
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de minutos consumida: ");
		
		int minutos = entrada.nextInt();
		double excedente = 0;
		double conta = 50.00;
		if (minutos > 100) {
			//conta = conta + (minutos - 100) * 2.0;
			excedente =+ (minutos -100) * 2;
		}
		
		System.out.printf("O valor da Excedente = R$ %.2f%n", excedente);
		System.out.println("Valor total: " + (conta + excedente));
			
	}

}
