package pooAula;

public abstract class Funcionario {
	
	protected String Nome;
	protected double Salario;
	protected String cpf;
	
	//Constructor
	public Funcionario(String nome, double salário, String cpf) {
		super();
		Nome = nome;
		Salario = salário;
		this.cpf = cpf;
	}
	
	//Getter and setters
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public double getSalario() {
		return Salario;
	}
	public void setSalario(double salário) {
		Salario = salário;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public abstract double bonificacao();
	
	//ToString
	public String Dados() {
		return "Funcionario [Nome=" + Nome + ", Salário=" + Salario + ", cpf=" + cpf + "]";
	}
}
