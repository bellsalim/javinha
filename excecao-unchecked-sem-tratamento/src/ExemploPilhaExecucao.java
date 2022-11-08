//exemplo com lançamento de exceção unchecked sem tratamento
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
		System.out.println("Início do método 2");
		metodo3();
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
			//lançamento da exceção
			throw new ExcecaoNaoMonitorada();
			}
		System.out.println("Fim do método 4");
	}
//após executar a aplicação notem que ela foi terminada inesperadamente
//não executando as instruções de fim dos métodos.
}
