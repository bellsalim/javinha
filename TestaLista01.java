import ed.Lista;

public class TestaLista01 {

	public static void main(String[] args) {
		// Cria lista padr�o
		Lista lista = new Lista(12);
		
		TestaLista00.infoLista(lista);
		while(!lista.cheia()) {
			double valor = Math.rint(10*Math.random());
			lista.adicionar(valor); // implicitamente double --> Double (classe wrapper)
			System.out.println(valor + " --> " + lista);
		}
		
		TestaLista00.infoLista(lista);
		
		double soma = 0;
		for (int i = 0; i < lista.comprimento(); i++) {
			soma += (Double)lista.elemento(i);
			// soma += (double)lista.elemento(i);
		}
		System.out.println("Soma : " + soma);
		System.out.println("M�dia: " + (soma/lista.comprimento()));
	}

}
