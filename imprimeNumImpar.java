package expressoesComparativas;
import java.util.Scanner;


public class imprimeNumImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite valor de X");
		
		int X = sc.nextInt();
		
		
		for (int i =0; i<= X; i++ ) {
			if (i%2 != 0) {
				System.out.println(i);
			}
		}
		
		sc.close();
	}

}
