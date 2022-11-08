package pooAula;

public class Cargo_DEVSenior extends Funcionario {

	public Cargo_DEVSenior(String nome, double salário, String cpf) {
		super(nome, salário, cpf);
	}
	
	public double bonificacao() {
		return super.getSalario()*0.30;
		
	}
	public double SalBon() {
		super.getSalario();
		return super.getSalario()*1.30;
	}


	@Override
	public String toString() {
		return "Cargo = DEV Senior, Nome " + Nome + ", Salario= " + Salario + ", cpf do funcionario = " + cpf + ", bonificacao= "
				+ bonificacao() + " Salário com a bonificacao= " + SalBon();
}
}