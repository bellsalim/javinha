import ed.Pilha;

public class TestePilha02 {
		
	public static void main(String[] args) {
		// Criar uma pilha
		Pilha pilha = new Pilha(100);
		System.out.println(pilha.toString());
		
		System.out.println("Capacidade: " +  pilha.capacidade() + " Tamanho: " + pilha.comprimento());
		// Empilhar valores 
		for (int i = 0; i < pilha.capacidade(); i++) {
			int aleatorio = (int)(Math.random()*20);
			pilha.adicionar(aleatorio);
			System.out.println(pilha.toString());
		}
		System.out.println("Posi��o 3: " + pilha.elemento(3));

		// Desempilhar os valores
		while (!pilha.vazia()) {
			pilha.remover();
			System.out.println(pilha.toString());
		}
	}
}

