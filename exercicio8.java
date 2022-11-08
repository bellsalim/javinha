import java.util.Scanner;
public class exercicio8 {
public static void main(String args[]){
        
    Scanner scan = new Scanner(System.in);
    int dividendo, divisor, c, a, b;

    System.out.println("Qual o valor de a?  ");
    Scanner scan = new Scanner(System.in);
    a = scan.nextInt();

    System.out.println("Qual o valor de b?  ");
    b = scan.nextInt();
do
    if (b > a){
    dividendo = b;
    divisor = a;

    }else
     dividendo = a;
     divisor = b;

while (dividendo % divisor != 0){
    c = dividendo % divisor;
    dividendo = divisor;

    System.out.println("o divisor é  " + divisor);
}
}
}






