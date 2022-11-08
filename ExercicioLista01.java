import java.util.Scanner;

import ed.Lista;

/* Escreva um programa que utilize uma lista para armazenar 10 nomes 
 * dados pelo usu�rio, apresentando-os ap�s sua entrada.
 */

public class ExercicioLista01 {

	public static void main(String[] args) {
		final int TAM = 5;
		// Lista
		Lista lista = new Lista(TAM);
		// Scanner
		Scanner teclado = new Scanner(System.in);
		
		// Leitura dos nomes
		for(int i = 0; i < TAM; i++) {
			System.out.print(i + " Nome? ");
			String nome = teclado.nextLine();
			lista.adicionar(nome);
		}
		
		// Exibir nomes ap�s entrada
		System.out.println(lista);
		for(int i = 0; i < TAM; i++) {
			System.out.println(i + ". " + lista.elemento(i));
		}
		
		// Esvaziar a lista
		while (!lista.vazia()) {
			int posicao = (int)(lista.comprimento()*Math.random());
			Object o = lista.remover(posicao);
			System.out.println(lista + " --> " + o);
		}
	}

}
