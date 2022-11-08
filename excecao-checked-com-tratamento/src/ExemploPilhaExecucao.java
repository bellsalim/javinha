//exemplo de lan�amento de exce��o checked com tratamento
public class ExemploPilhaExecucao {
	public static boolean sucesso=true;
	
	//observe a cl�usula throws na assinatura de cada m�todo pass�vel de lan�ar a exce��o
	public static void main(String[] args) throws ExcecaoMonitorada {
		System.out.println("In�cio do Main");
		metodo1(); 
		System.out.println("Fim do Main");
	}
	public static void metodo1() throws ExcecaoMonitorada{
		System.out.println("In�cio do m�todo 1");
		metodo2();
		System.out.println("Fim do m�todo 1");
		}
	public static void metodo2() throws ExcecaoMonitorada{
		System.out.println("In�cio do m�todo 2");
		//tratamento
		try {
			metodo3();
			} catch (ExcecaoMonitorada e) {
				
			}
			System.out.println("Fim do m�todo 2");
			}
	public static void metodo3() throws ExcecaoMonitorada{
		System.out.println("In�cio do m�todo 3");
		metodo4();
		System.out.println("Fim do m�todo 3");
		}
	public static void metodo4() throws ExcecaoMonitorada{
		System.out.println("In�cio do m�todo 4");
		if(sucesso) {
			//lan�ando a exce��o
			throw new ExcecaoMonitorada();
			}
		System.out.println("Fim do m�todo 4");
	}
	//removam a a instru��o throws ExcecaoMonitorada de um dos m�todos e avalie o que acontece
	
}