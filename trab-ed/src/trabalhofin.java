import java.util.Scanner;
import java.util.Random;
import ed.linear.nseq.*;

public class trabalhofin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Fila fila = new Fila();
		int ponto = 0,pontofinal=0;
		int resposta;
		System.out.println("Bem-vindo aos números misteriosos");
		System.out.println("Escolha o total de rodadas que você quer jogar:");
		resposta=sc.nextInt();
		for(int i=1;i<=resposta;i++) {
			System.out.println("Rodada " + i);
			ponto = jogo(i);
			pontofinal+=ponto;
			System.out.println("Pontuacao total da rodada:" + ponto);
			fila.adicionar(ponto);
			System.out.println();
		}
		System.out.println("Sua pontuacao nas rodadas:" + fila.toString());
		System.out.println("Sua pontuacao total foi de:" + pontofinal);
	}

	public static int jogo(int t) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		ListaLigada listatotal = new ListaLigada();
		ListaLigada lista = new ListaLigada();
		Pilha pilhaentrada = new Pilha();
		Fila fila = new Fila();
		Pilha pilha = new Pilha();
		int ponto = 0,entrada, tentativas, acertou,acertoutotal=0, repetido,vari;
		vari=10*t;
		tentativas=3*t;
		for (int i = 0; i < 6*t; i++) {
			lista.adicionar(r.nextInt(vari));
			listatotal.adicionar(lista.elemento(i));
		}
		System.out.println("Adivinhe o numero entre 0 e "+vari+", total de tentativas : "+tentativas); 
		System.out.println("Total de elementos são:"+lista.comprimento());
		do {
			System.out.println("Suas tentativas são de: " + tentativas);
			acertou = 0;
			do {
				repetido = 0;
				System.out.println("Digite o número entre 0 e "+vari+" como sua tentativa:");
				entrada = sc.nextInt();
				if (pilhaentrada.comprimento() > 0) {
					for (int j = pilhaentrada.comprimento() - 1; j >= 0; j--) {
						if (entrada == (int) pilhaentrada.elemento(j)) {
							pilhaentrada.remover();
							repetido++;
							System.out.println("Voce ja tentou o numero: " + entrada + ", tente novamente");
						}
					}
				}
				if (entrada < 0 || entrada > vari) {
					System.out.println("O numero " + entrada + " e invalido, esta alem dos limites");
				}
				pilhaentrada.adicionar(entrada);
			} while (entrada < 0 || entrada > vari || repetido >= 1);
			for (int j = lista.comprimento() - 1; j >= 0; j--) {
				if (entrada == (int) lista.elemento(j)) {
					lista.remover(j);
					ponto += 10;
					acertou++;
				}
			}
			if (acertou > 0) {
				System.out.println("Voce acertou:" + acertou+", suas tentativas nao cairam");
			}
			if (acertou == 0) {
				tentativas--;
				System.out.println("Voce nao acertou nenhuma, suas tentativas cairam");
			}
			acertoutotal+=acertou;
		} while (tentativas != 0 && lista.vazia() == false);
		System.out.println("Você acertou um total de "+acertoutotal+" números de "+lista.comprimento());
		System.out.println("Suas tentativas foram: " + pilhaentrada.toString());
		System.out.println("Os numeros eram: " + listatotal.toString());
		System.out.println("Os numeros que faltavam eram: " + lista.toString());
		System.out.println("Ponto=" + ponto);
		return ponto;
	}
}