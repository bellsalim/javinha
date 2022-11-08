
public class TestePilha01 {
	public static void main(String[] args) {
		// Criar uma pilha
		Pilha pilha = new Pilha();
		
		System.out.println("Capacidade Pilha: " +  pilha.capacidade()
			+ " Tamanho da Pilha: " + pilha.comprimento());
		// Empilhar os valores 5, 73, -8
		System.out.println("Empilhar os valores 5, 73, -8");
		pilha.adicionar(5);
		pilha.adicionar(73);
		pilha.adicionar(-8);
		System.out.println("Capacidade Pilha: " +  pilha.capacidade()
		+ " Tamanho da Pilha: " + pilha.comprimento());
		// Exibir o conte�do do pilha
		System.out.println(pilha.toString());
		// Desempilhar os valores
		int x = pilha.remover();
		System.out.println("Remo��o de : " + x);
		System.out.println("Remo��o de : " + pilha.remover());
		System.out.println("Remo��o de : " + pilha.remover());

		// Exibir o conte�do do array
		System.out.println(pilha.toString());
		System.out.println("Capacidade Pilha: " +  pilha.capacidade()
		+ " Tamanho da Pilha: " + pilha.comprimento());
	}
}
