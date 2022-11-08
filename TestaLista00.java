import ed.Lista;

public class TestaLista00 {

	public static void main(String[] args) {
		// Cria lista padr�o
		Lista lista = new Lista();
		
		infoLista(lista);
		
		lista.adicionar("Mel");
		lista.adicionar("Giovani");

		infoLista(lista);
		
		for(int i = 0; i < 3; i++) {
			lista.adicionar(i);
		}

		infoLista(lista);
	}

	public static void infoLista(Lista lista) {
		System.out.println("Lista");
		System.out.println("\tCapacidade : " + lista.capacidade());
		System.out.println("\tComprimento: " + lista.comprimento());
		System.out.println("\tConte�do   :\n\t" + lista.toString());
	}

}
