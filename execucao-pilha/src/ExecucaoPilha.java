
//exemplo sem lan�amento de exce��o
public class ExecucaoPilha {

	public static void main(String[] args) {
		System.out.println("In�cio do Main");
		//m�todo main chama o m�todo 1
		metodo1(); {
		System.out.println("Fim do Main");
		}
	}
	public static void metodo1() {
		System.out.println("In�cio do m�todo 1");
		//m�todo1 chama o m�todo 2
		metodo2();
		System.out.println("Fim do m�todo 1");
	}

	public static void metodo2() {
		System.out.println("In�cio do m�todo 2");
		//m�todo2 chama o m�todo 3
		metodo3();
		System.out.println("Fim do m�todo 2");
		}
	public static void metodo3() {
		System.out.println("In�cio do m�todo 3");
		//m�todo3 chama o m�todo 4
		metodo4();
		System.out.println("Fim do m�todo 3");
		}
	public static void metodo4() {
		System.out.println("In�cio do m�todo 4");
		System.out.println("Fim do m�todo 4");
	}
}
