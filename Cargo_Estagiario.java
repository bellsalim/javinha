package pooAula;

public class Cargo_Estagiario extends Funcionario {

	public Cargo_Estagiario(String nome, double sal�rio, String cpf) {
		super(nome, sal�rio, cpf);
		
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
		return "Cargo = Est�gi�rio, Nome " + Nome + ", Salario= " + Salario + ", cpf do funcionario = " + cpf + ", bonificacao= "
				+ bonificacao() + " Sal�rio com a bonificacao= " + SalBon();
	}
}