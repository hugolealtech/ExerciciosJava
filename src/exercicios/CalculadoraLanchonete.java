package exercicios;
import java.util.Scanner;

public class CalculadoraLanchonete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escolha dentre as opções: ");
		System.out.println("----------------------------");
		System.out.println("                            ");
		System.out.println("codigo 1 --> Cachorro Quente R$ 4.00");
		System.out.println("codigo 2 --> X-Salada  		 R$ 4.50");
		System.out.println("codigo 3 --> X-Bacon		 R$ 5.00 ");
		System.out.println("codigo 4 --> Torrada Simples R$ 2.00 ");
		System.out.println("codigo 5 --> Refrigerante	 R$ 4.00 ");
		
		double valorCac   = 4.00;
		double valXsal 	  = 4.50;
		double valXBac 	  = 5.00;
		double valTorrSim = 2.00;
		double valRefri   = 4.00;
		
		
		System.out.println("                                     ");
		System.out.println("                                     ");
		System.out.println("                                     ");
		
		
		System.out.print("Digite o codigo do produto que deseja: ");
		int codigo = sc.nextInt();
		
		System.out.print("Digite a quantidade do item que deseja: ");
		int quantidade = sc.nextInt();
		
			if(codigo == 0 || codigo > 5) {
				System.out.println("Item não encontrado");
				System.out.println ("Por favor Digite um item entre 1 e 5 !");
				
			}else if (codigo == 1) {
				System.out.println("Você escolheu Cachorro Quente! " );
				System.out.println("Como selecionou " + quantidade + " itens, entao o valor da sua compra é:");
				System.out.print(valorCac * quantidade);
				
			}else if (codigo == 2) {
				System.out.println("Você escolheu X-Salada!" );
				System.out.println("Como selecionou " + quantidade + "itens, entao o valor da sua compra é:");
				System.out.print(valXsal * quantidade);
				
			}else if (codigo == 3) {
				System.out.println("Você escolheu X-Bacon! " );
				System.out.println("Como selecionou " + quantidade + "itens, entao o valor da sua compra é:");
				System.out.print(valXBac * quantidade);
				
			}else if (codigo == 4) {
					System.out.println("Você escolheu Torrada Simples! " );
					System.out.println("Como selecionou " + quantidade + "itens, entao o valor da sua compra é:");
					System.out.print(valTorrSim * quantidade);
					
			}else if (codigo == 5) {
				System.out.println("Você escolheu Refrigerante! " );
				System.out.println("Como selecionou " + quantidade + "itens, entao o valor da sua compra é:");
				System.out.print("R$:" + valRefri * quantidade);
			
		
		
		sc.close();
		}
	
	
	}
}
