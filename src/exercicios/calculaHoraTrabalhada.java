package exercicios;
import java.util.Scanner;
public class calculaHoraTrabalhada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite matricula do funcionario: ");
		int matricula = sc.nextInt();
		
		System.out.print("Digite Horas trabalhadas: ");
		double horaTrabalhada = sc.nextInt();
		
		System.out.print("Digite o valor/hora: ");
		double valorHora = sc.nextDouble();
		
		double salario = horaTrabalhada * valorHora;
		
		if (salario < 1320) {
			System.out.println("Matricula do func." + matricula);
			System.out.println("hora Trabalhada: "+ horaTrabalhada + " " + "--> valorHora: " + valorHora);
			System.out.println("Salario " + salario);
			System.out.println("Obs: salario abaixo do Sal. minimo");
		}else {
		
			System.out.println("Matricula do func." + matricula);
			System.out.println("hora Trabalhada: "+ horaTrabalhada + " " + "--> valorHora: " + valorHora);
			System.out.println("Salario " + salario);
		
	
		
		sc.close();
	}

	}
}