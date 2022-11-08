//exemplo de lançamento de exceção checked com tratamento
public class ExemploPilhaExecucao {
	public static boolean sucesso=true;
	
	//observe a cláusula throws na assinatura de cada método passível de lançar a exceção
	public static void main(String[] args) throws ExcecaoMonitorada {
		System.out.println("Início do Main");
		metodo1(); 
		System.out.println("Fim do Main");
	}
	public static void metodo1() throws ExcecaoMonitorada{
		System.out.println("Início do método 1");
		metodo2();
		System.out.println("Fim do método 1");
		}
	public static void metodo2() throws ExcecaoMonitorada{
		System.out.println("Início do método 2");
		//tratamento
		try {
			metodo3();
			} catch (ExcecaoMonitorada e) {
				
			}
			System.out.println("Fim do método 2");
			}
	public static void metodo3() throws ExcecaoMonitorada{
		System.out.println("Início do método 3");
		metodo4();
		System.out.println("Fim do método 3");
		}
	public static void metodo4() throws ExcecaoMonitorada{
		System.out.println("Início do método 4");
		if(sucesso) {
			//lançando a exceção
			throw new ExcecaoMonitorada();
			}
		System.out.println("Fim do método 4");
	}
	//removam a a instrução throws ExcecaoMonitorada de um dos métodos e avalie o que acontece
	
}