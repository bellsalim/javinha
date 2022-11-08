package ed;
/**
 * Representa��o de uma fila (estrutura linear) capaz que armazenar 
 * uma quantidade limitada de elementos de qualquer tipo.
 * 
 * @author pjandl
 *
 */
public class Fila {
	// array interno para armazenar os elementos contidos na fila
	private Object[] conteudo;
	// controle interno de armazenamento da fila
	private int fim; 
	
	/**
	 * Cria uma fila com tamanho padr�o 4 elementos.
	 */
	public Fila() {
		fim = 0;
		conteudo = new Object[4];
	}

	/**
	 * Cria uma fila com tamanho padr�o definido pelo usu�rio elementos.
	 * 
	 * @param tamanho n�mero m�ximo de elementos da fila.
	 */
	public Fila(int tamanho) {
		fim = 0;
		conteudo = new Object[tamanho];
	}
	
	/**
	 * Retorna a quantidade m�xima de elementos que cabem na fila.
	 * 
	 * @return inteiro com a capacidade m�xima da fila.
	 */
	public int capacidade() {
		return conteudo.length;
	}
	
	/**
	 * Retorna o n�mero de elementos presentes na fila.
	 * 
	 * @return inteiro com n�mero de elementos da fila.
	 */	
	public int comprimento() {
		return fim;
	}

	/**
	 * Verifica se fila est� cheia.
	 * 
	 * @return true se fila est� cheia, false caso contr�rio. 
	 */
	public boolean cheia() {
		return fim == conteudo.length;
	}

	/**
	 * Adiciona um elemento no topo da fila.
	 * 
	 * @param valor elemento a ser adicionado na fila.
	 */
	public void adicionar(Object valor) {
		// verificar se fila est� cheia
		if (cheia()) {
			throw new RuntimeException("fila cheia");
		}
		conteudo[fim] = valor;
		fim++;
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
		if (posicao < 0 || posicao >= fim) {
			throw new RuntimeException("posi��o inv�lida: " + posicao);
		}
		return conteudo[posicao];
	}
	
	/**
	 * Retira o elemento presente no in�cio da fila.
	 * 
	 * @return valor elemento presente no in�cio da fila.
	 */
	public Object remover() {
		// verificar se fila est� vazia
		if (vazia()) {
			throw new RuntimeException("fila vazia");
		}
		Object aux = conteudo[0]; // primeiro elemento, que ser� removido
		// os elementos tem que ser movimentados uma posi��o para frente
		for(int i = 1; i < fim; i++) {
			conteudo[i - 1] = conteudo[i]; // "um passinho pr� frente" 
		}
		fim--; 
		return aux; // retorna o primeiro elemento
	}
	
	/**
	 * Representa��o de texto do objeto: uma listagem dos elementos contidos
	 * na fila.
	 * 
	 *  return String com representa��o textual da fila.
	 */
	public String toString() {
		StringBuilder sb  = new StringBuilder("[");
		for(int i = 0; i < fim - 1; i++) {
			sb.append(conteudo[i]); 
			sb.append(","); 
		}
		if (fim > 0) {
			sb.append(conteudo[fim-1]);
		}
		sb.append("]");
		return sb.toString();
	}
	
	/**
	 * Verifica se fila est� vazia.
	 * 
	 * @return true se fila n�o cont�m elementos, false caso contr�rio. 
	 */
	public boolean vazia() {
		return fim == 0;
	}

}
