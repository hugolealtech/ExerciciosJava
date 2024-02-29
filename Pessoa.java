package expressoesComparativas;

public class Pessoa {
	
	int 	matricula;
	String 	nome;
	int 	nota1;
	int 	nota2;
	
	
	public Pessoa (int matricula, String nome, int nota1, int nota2) {
		
		this.matricula = matricula;
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
		
		}
		
		public int getMatricula() {
			return matricula;
		}
		public void setMatricula(int matricula) {
			this.matricula = matricula;
		}
		
		
		
		public String getNome() {
			return nome;
		}
		public void String (String nome) {
			this.nome = nome;
		}
		
		
		
		public int getNota1() {
			return nota1;
		}
		public void setNota1(int nota1) {
			this.nota1 = nota1;
		}
		
	
		
		public int getNota2() {
			return nota2;
		}
		public void setNota2 (int nota2) {
			this.nota2 = nota2;
		}
		
		public void imprimeValor() {
			System.out.println("Matricula" + matricula);
			System.out.println("Nome do Aluno: " + nome);
			System.out.println("Nota primeiro Bimestre: " + nota1);
			System.out.println("Nota segundo Bimeest");
		}
		
}