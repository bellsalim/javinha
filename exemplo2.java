import java.util.Scanner;

public class exemplo2 {

    public static void main(String[] args) {
        int x;
        Scanner entrada = new Scanner(System.in);
        System.out.println ("Entre com um número inteiro: ");
        x = entrada.nextInt(); //leia(x)

        if(x % 2 == 0){
            System.out.println("Par");
        }else if(x % 2 == 1){
            System.out.println("Ímpar");
        }else{
            System.out.println("Zero");
        }
        
    }
    
}