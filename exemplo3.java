import java.util.Scanner;
import java.lang.Math;

public class exemplo3 {

    public static void main(String[] args) {
        int peso;
        double altura, imc; 
        Scanner entrada = new Scanner(System.in);

        System.out.print("\tCÁLCULO DE IMC\n\n");

        System.out.println("Entre com seu peso: ");
        peso = entrada.nextInt();
        System.out.println("Entre com sua altura: ");
        altura = entrada.nextDouble();

        imc = peso / Math.pow(altura, 2.0);

        System.out.println("Seu IMC foi de "+ imc + " !");

        
    }
    
}