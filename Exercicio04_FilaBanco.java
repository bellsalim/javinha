import java.awt.Toolkit;
import java.util.Scanner;

import ed.Fila;

/* Exerc�cio 04, Filas
 * Escreva um programa que simule o atendimento prestado por caixas de um banco, 
 * consumindo as senhas de uma fila normal e outra preferencial. 
 * Um menu deve prover as opera��es de emiss�o de senhas (normal e preferencial), 
 * al�m da chamada para atendimento.
 */
public class Exercicio04_FilaBanco {
	private static int contador = 0;
	private static Fila filaNormal = new Fila(100);
	private static Fila filaPreferencial = new Fila(100);
	public static Scanner teclado = new Scanner(System.in);
	public static Toolkit toolkit = Toolkit.getDefaultToolkit();

	
	// gera senhas sequenciais
	public static int geraSenha() {
		contador++;
		return contador;
	}
	
	// solicita atendimento normal
	public static void solicitaAtendimentoNormal() {
		int senha = geraSenha();
		System.out.printf("Atendimento Normal Senha: N%03d\n", senha);
		filaNormal.adicionar(senha);
	}
	
	// solicita atendimento preferencial
	public static void solicitaAtendimentoPreferencial() {
		int senha = geraSenha();
		System.out.printf("Atendimento Preferencial Senha: P%03d\n", senha);
		filaPreferencial.adicionar(senha);
	}
	
	// chamada para atendimento normal
	public static void chamadaAtendimentoNormal() {
		if (!filaNormal.vazia()) {
			int senha = (Integer)filaNormal.remover();
			System.out.printf("Chamada para Atendimento Normal Senha: N%03d\n", senha);
			toolkit.beep();
		}
	}
	
	// chamada para atendimento preferencial
	public static void chamadaAtendimentoPreferencial() {
		if (!filaPreferencial.vazia()) {
			int senha = (Integer)filaPreferencial.remover();
			System.out.printf("Chamada para Atendimento Preferencial Senha: P%03d\n", senha);
			toolkit.beep();
		}
	}
	
	public static void main(String[] args) {
		int opcao;
		do {
			opcao = menu();
			
			switch(opcao) {
			case 1: // Senha para Atendimento Normal
				solicitaAtendimentoNormal();
				break;
			case 2: // Senha para Atendimento Preferencial
				solicitaAtendimentoPreferencial();
				break;
			case 7: // Chamada para Atendimento Normal
				chamadaAtendimentoNormal();
				break;
			case 8: // Chamada para Atendimento Preferencial
				chamadaAtendimentoPreferencial();
				break;
			}
			System.out.println("Fila Normal      :" + filaNormal);
			System.out.println("Fila Preferencial:" + filaPreferencial);
		} while (opcao != 9);

	}

	private static int menu() {
		int opcao;
		System.out.println("=======================================================");
		System.out.println("CLIENTES");
		System.out.println("\t1 - Senha para Atendimento Normal");
		System.out.println("\t2 - Senha para Atendimento Preferencial");
		System.out.println("=======================================================");
		System.out.println("CAIXAS");
		System.out.println("\t7 - Chamar para Atendimento Normal");
		System.out.println("\t8 - Chamar para Atendimento Preferencial");
		System.out.println("=======================================================");
		System.out.println("9 - Sair");
		System.out.println("=======================================================");
		System.out.print("Op��o? ");
		opcao = teclado.nextInt();
		return opcao;
	}

}
