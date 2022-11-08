package pooAula;

public class FolhaDePagamento {
	private double somaSalario;
	private double somaBonificacao;
	
	public void somaSalario(Funcionario f) {
		this.somaSalario += f.getSalario();
	}
	
	public FolhaDePagamento(double somaSalario, double somaBonificacao) {
		super();
		this.somaSalario = somaSalario;
		this.somaBonificacao = somaBonificacao;
	}

	public FolhaDePagamento() {
		
	}

	public void somaBonificacao(Funcionario f) {
		this.somaBonificacao += f.bonificacao();
	}
	
	public double getSomaSalario() {
		return somaSalario;
	}
	public double getSomaBonificacao() {
		return somaBonificacao;
	}
	
	public double totalFolhaDePgto() {
		return this.somaSalario + this.somaBonificacao;
	}

	
	public String toString() {
		return "FolhaDePagamento= soma de Salario= " + somaSalario + ", soma da Bonificacao= " + somaBonificacao ;
	}
	
	
}