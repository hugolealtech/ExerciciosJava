package cursoJava;

public class Funcionario {
	
	
	int matricula = 0;
	double horasTrabalhadas = 0;
	double valorHora = 0;
	
	public  Funcionario (int matricula, int horasTrabalhadas, int valorHora) {
		
		this.matricula = matricula;
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorHora = valorHora;
	}
	
	public int calculaSalario () {
	
		return (int) (horasTrabalhadas * valorHora);
		
		
	}
	
	public void exibirInformacoes () {
		
		System.out.println("Matrticula: " + matricula);
		System.out.println("Horas trabalhadas: " + horasTrabalhadas );
		System.out.println("salario: " + calculaSalario());
	}

}
