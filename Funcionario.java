package funcionario;

public class Funcionario {
	private String nome;
	private double salario;
	
	//construtor
	public Funcionario() {
		this.nome = "";
		this.salario= 0.0;
	}
	
	public Funcionario(String nome) {
		this(nome, 0.0);
	}
	
	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}
	
	//métodos de acesso
	public String getNome() {
		return this.nome;
	}
	
	public double getSalario() {
		return this.salario;
	}
	
	//métodos modificadores
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	public void aumentaSalario(double percentual) {
		double aumento = this.salario * percentual / 100.0;
		this.salario += aumento;
	}
}