package pooAula;

public class Cargo_DEVPleno extends Funcionario {

	public Cargo_DEVPleno(String nome, double salario, String cpf) {
		super(nome, salario, cpf);
	}

	public double bonificacao() {
		return super.getSalario()*0.15;
		
	}
	public double SalBon() {
		super.getSalario();
		return super.getSalario()*1.15;
	}


	@Override
	public String toString() {
		return "Cargo = DEVPleno, Nome " + Nome + ", Salario= " + Salario + ", cpf do funcionario = " + cpf + ", bonificacao= "
				+ bonificacao() + " Salário com a bonificacao= " + SalBon();
	}
	
	
	
}
