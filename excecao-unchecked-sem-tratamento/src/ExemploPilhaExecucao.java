//exemplo com lan�amento de exce��o unchecked sem tratamento
public class ExemploPilhaExecucao {
	public static boolean sucesso=true;
	public static void main(String[] args) {
		System.out.println("In�cio do Main");
		metodo1(); 
		System.out.println("Fim do Main");
	}
	public static void metodo1() {
		System.out.println("In�cio do m�todo 1");
		metodo2();
		System.out.println("Fim do m�todo 1");
		}
	public static void metodo2() {
		System.out.println("In�cio do m�todo 2");
		metodo3();
		System.out.println("Fim do m�todo 2");
		}
	public static void metodo3() {
		System.out.println("In�cio do m�todo 3");
		metodo4();
		System.out.println("Fim do m�todo 3");
		}
	public static void metodo4() {
		System.out.println("In�cio do m�todo 4");
		if(sucesso) {
			//lan�amento da exce��o
			throw new ExcecaoNaoMonitorada();
			}
		System.out.println("Fim do m�todo 4");
	}
//ap�s executar a aplica��o notem que ela foi terminada inesperadamente
//n�o executando as instru��es de fim dos m�todos.
}
