package secao06_Estruturas_Repetitivas;

import java.util.Scanner;

public class senhaBanco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Bem vindo! Digite sua senha:");
		int senha = sc.nextInt();
		int tentativas = 0;

		while (senha != 2002) {
			System.out.println("Senha incorreta!");
			System.out.println("Tente novamente");
			senha = sc.nextInt();
			tentativas++;
			if (tentativas == 2) {
				System.out.println("Senha bloqueada! Procure uma agencia bancaria");
				break;
			}

		}
		if (senha == 2002) {
			System.out.println("Senha Correta!");

		}

		sc.close();
	}

}
