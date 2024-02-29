package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class CalculaImpostoRenda {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe sua renda: ");
        double renda = sc.nextDouble();
        double imposto = 0;

        if (renda <= 2000) {
            imposto = 0.0;
        } else if (renda <= 3000) {
            imposto = (renda - 2000) * 0.08;
        } else if (renda <= 4500) {
            imposto = (renda - 3000) * 0.18;
        } else {
            imposto = (renda - 4500) * 0.28 + (1500 * 0.18) + (1000 * 0.08);
        }

        System.out.println("Sua renda declarada: " + renda);
        System.out.println("Valor devido de imposto a recolher: " + imposto);

        sc.close();
    }
}
