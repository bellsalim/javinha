import java.util.Scanner;

import ed.Fila;

/* Escreva um programa que utilize uma fila para armazenar 10 nomes 
 * dados pelo usu�rio, apresentando-os ap�s sua entrada.
 */

public class ExercicioFila01 {

	public static void main(String[] args) {
		final int TAM = 10;
		// Fila
		Fila fila = new Fila(TAM);
		// Scanner
		Scanner teclado = new Scanner(System.in);
		
		// Leitura dos nomes
		for(int i = 0; i < TAM; i++) {
			System.out.print(i + " Nome? ");
			String nome = teclado.nextLine();
			fila.adicionar(nome);
		}
		
		// Exibir nomes ap�s entrada
		System.out.println(fila);
		for(int i = 0; i < TAM; i++) {
			System.out.println(i + ". " + fila.elemento(i));
		}
		
		// Esvaziar a fila
		while (!fila.vazia()) {
			Object o = fila.remover();
			System.out.println(fila + " --> " + o);
		}
	}

}
