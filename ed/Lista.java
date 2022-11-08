package ed;
/**
 * Representa��o de uma lista (estrutura linear) capaz que armazenar 
 * uma quantidade limitada de elementos de qualquer tipo.
 * 
 * @author pjandl
 *
 */
public class Lista {
	// array interno para armazenar os elementos contidos na lista
	private Object[] conteudo;
	// controle interno de armazenamento da lista
	private int fim; 
	
	/**
	 * Cria uma lista com tamanho padr�o 10 elementos.
	 */
	public Lista() {
		fim = 0;
		conteudo = new Object[10];
	}

	/**
	 * Cria uma fila com tamanho padr�o definido pelo usu�rio elementos.
	 * 
	 * @param tamanho n�mero m�ximo de elementos da lista.
	 */
	public Lista(int tamanho) {
		fim = 0;
		conteudo = new Object[tamanho];
	}
	
	/**
	 * Retorna a quantidade m�xima de elementos que cabem na lista.
	 * 
	 * @return inteiro com a capacidade m�xima da lista.
	 */
	public int capacidade() {
		return conteudo.length;
	}
	
	/**
	 * Retorna o n�mero de elementos presentes na lista.
	 * 
	 * @return inteiro com n�mero de elementos da lista.
	 */	
	public int comprimento() {
		return fim;
	}

	/**
	 * Verifica se lista est� cheia.
	 * 
	 * @return true se fila est� cheia, false caso contr�rio. 
	 */
	public boolean cheia() {
		return fim == conteudo.length;
	}

	/**
	 * Adiciona um elemento no topo da lista.
	 * 
	 * @param valor elemento a ser adicionado na lista.
	 */
	public void adicionar(Object valor) {
		// verificar se lista est� cheia
		if (cheia()) {
			throw new RuntimeException("lista cheia");
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
		validarPosicao(posicao);
		return conteudo[posicao];
	}
	
	/**
	 * Insere o elemento na posi��o indicada da lista.
	 * 
	 * @param posicao posi��o do elemento desejado.
	 * @return valor elemento a ser inserido.
	 */
	public void inserir(int posicao, Object valor) {
		// verificar se lista est� cheia
		if (cheia()) {
			throw new RuntimeException("lista cheia");
		}
		validarPosicao(posicao);
		// os elementos tem que ser movimentados uma posi��o para tr�s
		for(int i = fim - 1; i >= posicao; i--) {
			conteudo[i + 1] = conteudo[i]; // "um passinho pr� tr�s" 
		}
		conteudo[posicao] = valor; // insere elemento na lista
		fim++; 
	}
	
	/**
	 * Retira o elemento da posi��o indicada da lista.
	 * 
	 * @param posicao posi��o do elemento desejado.
	 * @return valor elemento presente na posi��o indicada.
	 */
	public Object remover(int posicao) {
		// verificar se lista est� vazia
		if (vazia()) {
			throw new RuntimeException("lista vazia");
		}
		validarPosicao(posicao);
		Object aux = conteudo[posicao]; // copia elemento que ser� removido
		// os elementos tem que ser movimentados uma posi��o para frente
		for(int i = posicao + 1; i < fim; i++) {
			conteudo[i - 1] = conteudo[i]; // "um passinho pr� frente" 
		}
		fim--; 
		return aux; // retorna o elemento removido
	}

	// testar se posi��o � inv�lida
	private void validarPosicao(int posicao) {
		if (posicao < 0 || posicao >= fim) {
			throw new RuntimeException("posi��o inv�lida: " + posicao);
		}
	}
	
	/**
	 * Representa��o de texto do objeto: uma listagem dos elementos contidos
	 * na lista.
	 * 
	 *  return String com representa��o textual da lista.
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
	 * Verifica se lista est� vazia.
	 * 
	 * @return true se lista n�o cont�m elementos, false caso contr�rio. 
	 */
	public boolean vazia() {
		return fim == 0;
	}

}
