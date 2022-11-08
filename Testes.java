package pooAula;

public class Testes {

	public static void main(String[] args) {
		
		int SalA=1000;
		int SalB=1500;
		int SalC=2000;
		int SalD=3000;
		
				
		Cargo_Estagiario A = new Cargo_Estagiario ("Isabel", SalA, "51951803850");
		System.out.println(A.toString());
		
		Cargo_DEVJunior B = new Cargo_DEVJunior ("Harry", SalB, "51951803850");
		System.out.println(B.toString());
		
		Cargo_DEVPleno C = new Cargo_DEVPleno ("bell", SalC, "51951803850");
		System.out.println(C.toString());
		
		Cargo_DEVSenior D = new Cargo_DEVSenior ("Larry", SalD, "51951803850");
		System.out.println(D.toString());
		
		FolhaDePagamento F = new FolhaDePagamento() ;
		F.somaBonificacao(A);
		F.somaBonificacao(B);
		F.somaBonificacao(C);
		F.somaBonificacao(D);
		
		F.somaSalario(A);
		F.somaSalario(B);
		F.somaSalario(C);
		F.somaSalario(D);
		System.out.println(F.toString() + ", total gasto = " + F.totalFolhaDePgto());
	}
 
}
