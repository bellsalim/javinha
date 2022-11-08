import java.util.Scanner;

import ed.Pilha;

/* Escreva um programa que utilize uma pilha para armazenar 10 nomes 
 * dados pelo usu�rio, apresentando-os ap�s sua entrada.
 */

public class ExercicioPilha01 {

	public static void main(String[] args) {
		final int TAM = 5;
		// Pilha
		Pilha pilha = new Pilha(TAM);
		// Scanner
		Scanner teclado = new Scanner(System.in);
		
		// Leitura dos nomes
		for(int i = 0; i < TAM; i++) {
			System.out.print(i + " Nome? ");
			String nome = teclado.nextLine();
			pilha.adicionar(nome);
		}
		
		// Exibir nomes ap�s entrada
		System.out.println(pilha);
		for(int i = 0; i < TAM; i++) {
			System.out.println(i + ". " + pilha.elemento(i));
		}
		
		// Esvaziar a pilha
		while (!pilha.vazia()) {
			Object o = pilha.remover();
			System.out.println(pilha + " --> " + o);
		}

	}

}
