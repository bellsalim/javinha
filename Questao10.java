import java.util.Scanner;

import ed.Lista;

public class Questao10 {

	public static void main(String[] args) {
		final int MAX = 20;
		// Lista para MAX n�meros
		Lista lista = new Lista(MAX);
		// Scanner
		Scanner teclado = new Scanner(System.in);
		// La�o para leitura de MAX n�meros
		for(int i = 0; i < MAX; i++) {
			System.out.print("Digite um inteiro positivo [>0]: ");
			int aux = teclado.nextInt();
			if (aux > 0) {
				// J� existe o n�mero aux na lista?
				int contador = 0;
				int posicao = -1;
				for (int j = 0; j < lista.comprimento(); j++) {
					if (aux == (int)lista.elemento(j)) {
						contador++;
						posicao = j;
					}
				}
				// contador possui o n�mero de repeti��es do valor aux
				if (contador == 0) {
					// aux n�o est� lista, adi��o simples
					lista.adicionar(aux);
				} else if (contador == 1) {
					if (posicao-1 >= 0 && 0 > (int)lista.elemento(posicao-1)) {
						contador = (int)lista.remover(posicao-1);
						contador = - contador;
						lista.inserir(posicao-1, -(contador+1));
					} else {
						lista.inserir(posicao, -(contador+1));
					}
				}
				// exibe lista a cada entrada
				System.out.println(lista);
			} else {
				// zero ou negativo para a entrada
				break;
			}
		}
		// exibir a lista
		for (int i = 0; i < lista.comprimento(); i++) {
			int aux = (int)lista.elemento(i);
			if (aux > 0) {
				System.out.println("1 n�mero " + aux);
			} else {
				System.out.println((-aux) + " n�meros " + lista.elemento(i+1));
				i++;
			}
		}
	}

}
