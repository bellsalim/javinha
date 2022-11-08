import java.util.Scanner;
import java.lang.Math;

public class exercicio1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double comprimento, area, volume, raio;

        System.out.println("Digite o valor do raio: ");
        Scanner scan = new Scanner(System.in);
        raio = scan.nextFloat();

        comprimento = 2 * Math.PI * raio;
        area = Math.PI * Math.pow(raio, 2.0);
        volume = 0.75 * Math.PI * Math.pow(raio, 3.0);

            System.out.println("a médida do comprimento é " + comprimento);
            System.out.println("a medida da área é  " + area);
            System.out.println("a medida do volume é  " + volume);
    }


    
}