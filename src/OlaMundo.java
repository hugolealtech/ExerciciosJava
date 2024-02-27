import java.util.Scanner;

public class OlaMundo {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double primNumero = entrada.nextDouble();

        System.out.println("Digite o segundo número: ");
        double segNumero = entrada.nextDouble();

        // Calcula a média de maneira mais precisa usando tipos de dados double
        double calculaMedia = (primNumero + segNumero) / 2;

        System.out.println("A média entre os dois números é: " + calculaMedia);

        // Fechando o Scanner para evitar vazamento de recursos
        entrada.close();
    }
}
