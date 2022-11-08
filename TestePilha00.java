
public class TestePilha00 {
	public static void main(String[] args) {
		// Array para "simular" uma pilha
		int[] conteudo = new int[4];
		int topo = 0; // representa o índice do topo
		
		System.out.println("Capacidade Pilha: " + conteudo.length + " Tamanho da Pilha: " + topo);
		// Empilhar os valores 5, 73, -8
		System.out.println("Empilhar os valores 5, 73, -8");
		conteudo[topo] = 5;  topo++;
		conteudo[topo] = 73; topo++;
		conteudo[topo] = -8; topo++;
		
		System.out.println("Capacidade Pilha: " + conteudo.length + " Tamanho da Pilha: " + topo);
		// Exibir o conteúdo do array
		System.out.print("[");
		for(int i = 0; i < topo; i++) {
			System.out.print(conteudo[i] + ", ");
		}
		System.out.println("]");
		// Desempilhar os valores
		topo--; System.out.println("Remoção de : " + conteudo[topo]);
		topo--; System.out.println("Remoção de : " + conteudo[topo]);
		topo--; System.out.println("Remoção de : " + conteudo[topo]);

		// Exibir o conteúdo do array
		System.out.print("[");
		for(int i = 0; i < topo; i++) {
			System.out.print(conteudo[i] + ", ");
		}
		System.out.println("]");
		System.out.println("Capacidade Pilha: " + conteudo.length + " Tamanho da Pilha: " + topo);
	}
}
