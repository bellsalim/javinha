//exemplo de lan�amento de exce��o unchecked com tratamento
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
		//tratamento
		System.out.println("In�cio do m�todo 2");
		try {
			metodo3();
			} catch (ExcecaoNaoMonitorada e) {
				
			}
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
			//lan�ando a exce��o
			throw new ExcecaoNaoMonitorada();
			}
		System.out.println("Fim do m�todo 4");
	}
	//ap�s executar a aplica��o notem que apesar da exce��o, como houve o tratamento no m�todo 2 a aplica��o
	//continuou a execu��o, deixando de executar as instru��es antes do tratamento, como fim dos m�todos 4 e 3.
}
