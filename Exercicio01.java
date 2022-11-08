import java.util.Scanner;
import ed.Pilha;

/* Exerc�cio 1
* Escreva um programa que utilize uma pilha para armazenar 10 valores inteiros dados pelo usu�rio, 
* apresentando-os ap�s sua entrada. 
*/
public class Exercicio01 {

	public static void main(String[] args) {
		// Scanner 
		Scanner tecl = new Scanner(System.in);
		// Pilha para 10 valores
		Pilha pilha = new Pilha(10);
		
		// la�o para n repeti��es, n � capacidade da pilha
		for (int i = 0; i < pilha.capacidade(); i++) {
			System.out.print((i + 1) + ".Digite um inteiro: ");
			int valor = tecl.nextInt();
			pilha.adicionar(valor);
		}
		
		System.out.println("Pilha: " + pilha); // o mesmo que pilha.toString()
		
		for (int i = 0; i < pilha.comprimento(); i++) {
			System.out.println((i + 1) + ": " + pilha.elemento(i));
		}

	}

}
