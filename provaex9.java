import java.util.Scanner;

import ed.Fila;

public class provaex9 {

	public static void main(String[] args) {
		final int TAM = 20;
		
        Fila fila = new Fila(TAM);
        Fila RA = new Fila (TAM);
        
        Scanner teclado = new Scanner(System.in);
        
		
		for(int i = 0; i < 13; i++) {
			System.out.print(i+1 + " digito do seu RA: ");
			int ra = teclado.nextInt();
			fila.adicionar(ra);
		}
		
		System.out.println(fila.toString());
		
		while (!fila.vazia()) {
			int ra = (Integer)fila.remover();
			
			if (ra % 2 == 0) { 
				
			} else {
				RA.adicionar(ra);
				
			}
        }
        System.out.println(" numeros pares removidos do RA: ");
        System.out.println(RA.toString());

        }
    }
