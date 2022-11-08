import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {

	public static int quociente(int dividendo, int divisor) throws ArithmeticException {
		return dividendo/divisor;
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int divisor, dividendo;
		boolean sucesso = true;
		
		do {
		try {
		System.out.println("Digite o dividendo:");
		dividendo=sc.nextInt();
		System.out.println("Digite o divisor:");
		divisor=sc.nextInt();
		System.out.println("Quociente= "+quociente(dividendo,divisor));
		sucesso=false;
		}
		catch(ArithmeticException | InputMismatchException e) {
			System.out.println("Argumento inválido"+e);
			sc.nextLine();
			System.out.println(" tente novamente ");
			System.out.println();
			}
		}while(sucesso);
		
	}
	
}
