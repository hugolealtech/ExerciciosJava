package exercicios;

public class escopoEInicializacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double price = 400.00;
		double discount = 0;
		
		
		if(price < 200) {
			discount = price * 0.1;
		}else {
			discount = 0;
		}
		System.out.println("Disconto " + discount);
	}

}
