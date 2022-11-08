import java.util.Scanner;
import ed.Pilha;

public class exercicio3 {

    public static void main(String[] args) {
		Scanner tecl = new Scanner(System.in);
		Pilha pilha = new Pilha(10);
		
		for (int i = 0; i < pilha.capacidade(); i++) {
			System.out.print((i + 1) + ". Digite um inteiro: ");
			int valor = tecl.nextInt();
			pilha.adicionar(valor);
		}
		
		System.out.println("Pilha: " + pilha); 
		}

	}



