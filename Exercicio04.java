import java.util.Scanner;

import ed.Pilha;

/* Exercicio 4
 * Escreva um programa que armazene at� 15 inteiros dados pelo usu�rio. 
 * Ap�s a entrada, separe os m�ltiplos de 3 em uma pilha extra; 
 * remova os m�ltiplos de 2. Os demais elementos devem mantidos.
 */
public class Exercicio04 {

	public static void main(String[] args) {
		// Scanner 
		Scanner tecl = new Scanner(System.in);
		final int TAM = 15; // constante
		// Pilha para TAM valores
		Pilha pilha = new Pilha(TAM);
		Pilha pilhaMult3 = new Pilha(TAM);
		Pilha auxiliar = new Pilha(TAM);
		
		// la�o para leitura dos TAM valores da pilha
		for (int i = 0; i < pilha.capacidade(); i++) {
			System.out.print((i + 1) + ".Digite um inteiro: ");
			int valor = tecl.nextInt();
			pilha.adicionar(valor);
		}
		System.out.println("-------------");
		// esvaziar a pilha totalmente
		while (!pilha.vazia()) {
			int valor = pilha.remover();
			// testar valor removido
			if (valor % 3 == 0) { // m�ltiplo de tr�s
				pilhaMult3.adicionar(valor);
				System.out.println(valor + " --> Mult3" + pilhaMult3);
			} else if (valor % 2 == 0) { // m�ltiplo de dois
				System.out.println(valor + " --> m�ltiplo de 2 descartado");
			} else {
				auxiliar.adicionar(valor);
				System.out.println(valor + " --> AUX" + auxiliar);
			}
		}
		System.out.println("Pilha   :" + pilha);
		System.out.println("Mult3   :" + pilhaMult3);
		System.out.println("Auxiliar:" + auxiliar);
		System.out.println("-------------");
		// devolver os elementos da auxiliar para pilha inicial
		while (!auxiliar.vazia()) {
			pilha.adicionar(auxiliar.remover());
		}
		System.out.println("Pilha   :" + pilha);
		System.out.println("Mult3   :" + pilhaMult3);
		System.out.println("Auxiliar:" + auxiliar);
	}

}
