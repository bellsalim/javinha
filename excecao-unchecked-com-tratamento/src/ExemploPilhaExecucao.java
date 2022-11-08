//exemplo de lançamento de exceção unchecked com tratamento
public class ExemploPilhaExecucao {
	public static boolean sucesso=true;
	public static void main(String[] args) {
		System.out.println("Início do Main");
		metodo1(); 
		System.out.println("Fim do Main");
	}
	public static void metodo1() {
		System.out.println("Início do método 1");
		metodo2();
		System.out.println("Fim do método 1");
		}
	public static void metodo2() {
		//tratamento
		System.out.println("Início do método 2");
		try {
			metodo3();
			} catch (ExcecaoNaoMonitorada e) {
				
			}
			System.out.println("Fim do método 2");
			}
	public static void metodo3() {
		System.out.println("Início do método 3");
		metodo4();
		System.out.println("Fim do método 3");
		}
	public static void metodo4() {
		System.out.println("Início do método 4");
		if(sucesso) {
			//lançando a exceção
			throw new ExcecaoNaoMonitorada();
			}
		System.out.println("Fim do método 4");
	}
	//após executar a aplicação notem que apesar da exceção, como houve o tratamento no método 2 a aplicação
	//continuou a execução, deixando de executar as instruções antes do tratamento, como fim dos métodos 4 e 3.
}
