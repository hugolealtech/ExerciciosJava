package expressoesComparativas;
import java.util.Scanner;

public class VerificarIntervalo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor de N:");
        int n = sc.nextInt();

        int in = 0;
        int out = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Informe o valor de X:");
            int x = sc.nextInt();

            if (x >= 10 && x <= 20) {
                in++;
            } else {
                out++;
            }
        }

        System.out.println("Valores dentro do intervalo: " + in);
        System.out.println("Valores fora do intervalo: " + out);

        sc.close();
    }
}
