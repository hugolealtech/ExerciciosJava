package exercicios;

import java.util.Scanner;

public class estruturaDoWhileTabuada {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char resposta;

        do {
            System.out.print("Digite 's' para começar/continuar e 'n' para parar: ");
            resposta = sc.next().charAt(0);

            if (resposta == 's' || resposta == 'S') {
                System.out.print("Digite o número da tabuada que deseja: ");
                int numero = sc.nextInt();
                int limite = 10;

                System.out.println("------------Tabuada de " + numero + " -------------");

                for (int i = 1; i <= limite; i++) {
                    System.out.println(numero + "  X  " + i + "  = " + (i * numero));
                }

                System.out.println("--------------------------");
            } else if (resposta == 'n' || resposta == 'N') {
                System.out.println("Fim do Programa!");
            } else {
                System.out.println("Opção inválida. Digite 's' para continuar ou 'n' para parar.");
            }

        } while (resposta != 'n' && resposta != 'N');

        sc.close();
    }
}
