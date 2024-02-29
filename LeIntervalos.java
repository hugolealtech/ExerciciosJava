package exercicios;
import java.util.Scanner;


public class LeIntervalos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um valor: ");
		
		double valor = sc.nextDouble();
		
		
		if(valor >=0 && valor <= 25) {
			System.out.println("O numero esta entre 0 e 25");
		}else if (valor > 25 && valor <= 50) {
			System.out.println("intervalo 25,50");
		}else if (valor > 50 && valor <= 75) {
			System.out.println("intervalo 50,75 ");
		}else if (valor > 75 && valor <= 100) {
			System.out.println("intervalo 75,100");
		}else {
			System.out.println("Numero fora do intervalo");
		}	
		
		sc.close();
	}
	

}
