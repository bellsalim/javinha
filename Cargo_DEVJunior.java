package pooAula;

public class Cargo_DEVJunior extends Funcionario {

	public Cargo_DEVJunior(String nome, double sal�rio, String cpf) {
		super(nome, sal�rio, cpf);
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
				+ bonificacao() + " Sal�rio com a bonificacao= " + SalBon();
	}
	
	
	
	
}
