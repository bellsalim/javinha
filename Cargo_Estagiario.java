package pooAula;

public class Cargo_Estagiario extends Funcionario {

	public Cargo_Estagiario(String nome, double salário, String cpf) {
		super(nome, salário, cpf);
		
	}
	public double bonificacao() {
		return super.getSalario()*0;
		
	}
	public double SalBon() {
		super.getSalario();
		return super.getSalario()*1;
	}


	@Override
	public String toString() {
		return "Cargo = Estágiário, Nome " + Nome + ", Salario= " + Salario + ", cpf do funcionario = " + cpf + ", bonificacao= "
				+ bonificacao() + " Salário com a bonificacao= " + SalBon();
	}
}