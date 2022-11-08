import java.util.Scanner;
import ed.Pilha;

public class exercicio2 {
    public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Pilha pilha = new Pilha(10)  ;
		Pilha pilhaPosi = new Pilha(10)  ;
		Pilha pilhaNega = new Pilha(10)  ;
	
		for (int i = 0; i < pilha.capacidade(); i++) {	
		System.out.print("Digite um inteiro: ");
			int valor = teclado.nextInt();
		
		if (valor > 0){
			pilhaPosi.adicionar(valor);
			}
		else if ( valor < 0){
			pilhaNega.adicionar(valor);
		}
		else{
			break;
		}
	}
		System.out.println("Pilha positiva: " + pilhaPosi); 
		System.out.println("Pilha negativa: " + pilhaNega); 

	}

}


