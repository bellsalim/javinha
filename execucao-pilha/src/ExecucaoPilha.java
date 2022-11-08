
//exemplo sem lançamento de exceção
public class ExecucaoPilha {

	public static void main(String[] args) {
		System.out.println("Início do Main");
		//método main chama o método 1
		metodo1(); {
		System.out.println("Fim do Main");
		}
	}
	public static void metodo1() {
		System.out.println("Início do método 1");
		//método1 chama o método 2
		metodo2();
		System.out.println("Fim do método 1");
	}

	public static void metodo2() {
		System.out.println("Início do método 2");
		//método2 chama o método 3
		metodo3();
		System.out.println("Fim do método 2");
		}
	public static void metodo3() {
		System.out.println("Início do método 3");
		//método3 chama o método 4
		metodo4();
		System.out.println("Fim do método 3");
		}
	public static void metodo4() {
		System.out.println("Início do método 4");
		System.out.println("Fim do método 4");
	}
}
