import java.util.Scanner;

import ed.Fila;
import ed.Lista;
import ed.Pilha;

/* Escreva um programa que armazene at� 10 valores reais dados pelo usu�rio, 
 * positivos e negativos, em listas separadas. 
 * Um valor 0 (zero) finaliza a sequ�ncia. Exiba os valores ap�s sua entrada.
 */

public class ExercicioListaFilaPilha02 {

	public static void main(String[] args) {
		final int TAM = 10;
		// Listas, Filas e Pilhas
		Lista listaPos = new Lista(TAM);
		Fila  filaPos  = new Fila(TAM);
		Pilha pilhaPos = new Pilha(TAM);
		Lista listaNeg = new Lista(TAM);
		Fila  filaNeg  = new Fila(TAM);
		Pilha pilhaNeg = new Pilha(TAM);
		// Scanner
		Scanner teclado = new Scanner(System.in);
		
		// Entrada de dados
		for(int i = 0; i < TAM; i++) {
			System.out.print("Digite um valor real, zero para sair: ");
			double valor = teclado.nextDouble();
			if (valor > 0) {
				listaPos.adicionar(valor);
				filaPos.adicionar(valor);
				pilhaPos.adicionar(valor);
			} else if (valor < 0) {
				listaNeg.adicionar(valor);
				filaNeg.adicionar(valor);
				pilhaNeg.adicionar(valor);
			} else {
				break;
			}
			System.out.println("Lista Pos:" + listaPos);
			System.out.println("      Neg:" + listaNeg);
			System.out.println("Fila  Pos:" + filaPos);
			System.out.println("      Neg:" + filaNeg);
			System.out.println("Pilha Pos:" + pilhaPos);
			System.out.println("      Neg:" + pilhaNeg);
		}

	}

}
