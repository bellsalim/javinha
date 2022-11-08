package ed;
/**
 * Representa��o de uma pilha (estrutura linear) capaz que armazenar 
 * uma quantidade limitada de elementos de qualquer tipo.
 * 
 * @author pjandl
 *
 */
public class Pilha {
	// array interno para armazenar os elementos contidos na pilha
	private Object[] conteudo;
	// controle interno de armazenamento da pilha
	private int topo; 
	
	/**
	 * Cria uma pilha com tamanho padr�o 4 elementos.
	 */
	public Pilha() {
		topo = 0;
		conteudo = new Object[4];
	}

	/**
	 * Cria uma pilha com tamanho padr�o definido pelo usu�rio elementos.
	 * 
	 * @param tamanho n�mero m�ximo de elementos da pilha.
	 */
	public Pilha(int tamanho) {
		topo = 0;
		conteudo = new Object[tamanho];
	}
	
	/**
	 * Retorna a quantidade m�xima de elementos que cabem na pilha.
	 * 
	 * @return inteiro com a capacidade m�xima da pilha.
	 */
	public int capacidade() {
		return conteudo.length;
	}
	
	/**
	 * Retorna o n�mero de elementos presentes na pilha.
	 * 
	 * @return inteiro com n�mero de elementos da pilha.
	 */	
	public int comprimento() {
		return topo;
	}

	/**
	 * Verifica se pilha est� cheia.
	 * 
	 * @return true se pilha est� cheia, false caso contr�rio. 
	 */
	public boolean cheia() {
		return topo == conteudo.length;
	}

	/**
	 * Adiciona um elemento no topo da pilha.
	 * 
	 * @param valor elemento a ser adicionado na pilha.
	 */
	public void adicionar(Object valor) {
		// verificar se pilha est� cheia
		if (topo == conteudo.length) {
			throw new RuntimeException("pilha cheia");
		}
		conteudo[topo] = valor;
		topo++;
	}
	
	/**
	 * Consulta o elemento existente na posi��o indicada pelo usu�rio.
	 * 
	 * @param posicao posi��o do elemento desejado.
	 * 
	 * @return elemento existente na posi��o indicada.
	 */
	public Object elemento(int posicao) {
		// testar se posi��o � inv�lida
		if (posicao < 0 || posicao >= topo) {
			throw new RuntimeException("posi��o inv�lida: " + posicao);
		}
		return conteudo[posicao];
	}
	
	/**
	 * Retira o elemento presente no topo da pilha.
	 * 
	 * @return valor elemento presente no topo da pilha.
	 */
	public Object remover() {
		// verificar se pilha est� vazia
		if (topo == 0) {
			throw new RuntimeException("pilha vazia");
		}
		topo--; 
		return conteudo[topo];
	}
	
	/**
	 * Representa��o de texto do objeto: uma listagem dos elementos contidos
	 * na pilha.
	 * 
	 *  return String com representa��o textual da pilha.
	 */
	public String toString() {
		StringBuilder sb  = new StringBuilder("[");
		for(int i = 0; i < topo - 1; i++) {
			sb.append(conteudo[i]); 
			sb.append(","); 
		}
		if (topo > 0) {
			sb.append(conteudo[topo-1]);
		}
		sb.append("]");
		return sb.toString();
	}
	
	/**
	 * Verifica se pilha est� vazia.
	 * 
	 * @return true se pilha n�o cont�m elementos, false caso contr�rio. 
	 */
	public boolean vazia() {
		return topo == 0;
	}

}
