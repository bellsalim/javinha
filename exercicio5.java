import java.util.Scanner;
public class exercicio5 {

    public static void main(String[] args) {
        double altura, peso;
        int genero;
        Scanner entrada = new Scanner(System.in);
    
        
        System.out.println("para mulher digite 1 e para homem digite 2  ");
        Scanner scan = new Scanner(System.in);
        genero= entrada.nextInt();


        if (genero == 1) {
            System.out.println("qual sua altura? ");
        altura = entrada.nextDouble();
            peso = (int) ((62.1 * altura) - 44.7);
            System.out.println("o peso ideal feminino é   " + peso);

        }else if (genero == 2) { 
            System.out.println("qual sua altura? ");
            altura = entrada.nextDouble();

            peso = (int) ((72.7 * altura) - 48);
            System.out.println("o peso ideal masculino é   " + peso);


        
        }

        
    }
    
}