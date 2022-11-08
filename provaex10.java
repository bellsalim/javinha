import java.util.Scanner;

import ed.Lista;

public class provaex10 {

    public static void main(String[] args) {
		final int TAM = 20;
		
		Lista listaPos = new Lista(TAM);
		
		
		Scanner teclado = new Scanner(System.in);
		
	
		for(int i = 0; i < TAM; i++) {
			System.out.print("Digite um valor inteiro, zero ou negativo para sair: ");
			int valor = teclado.nextInt();
			if (valor > 0) {
				listaPos.adicionar(valor);

		    }else {
				break;
			}
			System.out.println("Lista " + listaPos);
	
			
		}
	}
}

    
    