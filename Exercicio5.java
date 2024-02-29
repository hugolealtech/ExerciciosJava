package expressoesComparativas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.ENGLISH);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe valor de N: ");
        int n = sc.nextInt();

        long fatorial = 1;  // Inicializa o acumulador para o fatorial

        for (int i = 1; i <= n; i++) {
            fatorial *= i;  // Multiplica o acumulador pelo próximo número
        }

        System.out.println("O fatorial de " + n + " é: " + fatorial);
        System.out.println("---------Fim programa-----------");

        sc.close();
    }
}

