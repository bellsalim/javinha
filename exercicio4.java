import java.util.Scanner;
public class exercicio4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double produto, media, diferença, n1, n2;

        System.out.println("digite um número ");
        Scanner scan = new Scanner(System.in);
        n1 = scan.nextFloat();

        System.out.println("digite outro número ");
        n2 = scan.nextFloat();

        produto = n1 + n2;
        media = (n1 + n2)/2;

        if(n1 > n2){
            diferença = n1 - n2;
      
        }else if(n1 < n2){
            diferença = n2 - n1;
        System.out.println("o produto entre os dois números é " + produto);
         System.out.println("a média entre os dois números é  " + media);
        System.out.println("a diferença do maior pelo menos é  " + diferença);
        }

    }
}    
