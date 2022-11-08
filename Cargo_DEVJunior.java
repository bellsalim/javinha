package pooAula;

public class Cargo_DEVJunior extends Funcionario {

	public Cargo_DEVJunior(String nome, double salário, String cpf) {
		super(nome, salário, cpf);
	}
	public double bonificacao() {
		return super.getSalario()*0.05;
		
	}
	public double SalBon() {
		super.getSalario();
		return super.getSalario()*1.05;
	}


	@Override
	public String toString() {
		return "Cargo = DEV Junior, Nome " + Nome + ", Salario= " + Salario + ", cpf do funcionario = " + cpf + ", bonificacao= "
				+ bonificacao() + " Salário com a bonificacao= " + SalBon();
	}
	
	
	
	
}
