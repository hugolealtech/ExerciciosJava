package exercicios;

import java.util.Scanner;

/*
 Estrutura opcional ao if-else quando se deseja decidir um VALOR com base em uma
condição.
Sintaxe:
( condição ) ? valor_se_verdadeiro : valor_se_falso
( 2 > 4 ) ? 50 : 80
Exemplos:
80
( 10 != 3 ) ? "Maria" : "Alex" "Maria"
 */

public class expressaoCondicionalTernaria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite quantidade de alunos");
		int alunos = sc.nextInt();

		
		for (int i = 0; i < alunos; i++ ) {
		
			System.out.println("Digite uma nota: ");
	
			int nota = sc.nextInt();
	
			String situacao = (nota <= 50) ? "reprovado" : "aprovado";
	
			System.out.println("O aluno esta " + situacao);
			
		}	
			System.out.println("Fim do programa!");
			sc.close();
	}
	
	
}
