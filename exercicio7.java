import java.util.Scanner;
import java.lang.Math;
public class exercicio7 {
    public static void main(String args[]){
        
        Scanner entrada = new Scanner(System.in);
    double n1,n2,n3,n4,n5,n6,n7,n8,mf; 

    System.out.println("v1");
    n1 = entrada.nextDouble();

    System.out.println("v2");
    n2 = entrada.nextDouble();

    System.out.println("v3");
    n3 = entrada.nextDouble();

    System.out.println("v4");
    n4 = entrada.nextDouble();

    System.out.println("v5");
    n5 = entrada.nextDouble();

    System.out.println("v6");
    n6 = entrada.nextDouble();

    System.out.println("v7");
    n7 = entrada.nextDouble();

    System.out.println("v8");
    n8 = entrada.nextDouble();

    mf=(n1+n2+n3+n4+n5+n6+n7+n8)/((Math.pow(n1, 0.0))+(Math.pow(n2, 0.0))+(Math.pow(n3, 0.0))+(Math.pow(n4, 0.0))+(Math.pow(n5, 0.0))+(Math.pow(n6, 0.0))+(Math.pow(n7, 0.0))+(Math.pow(n8, 0.0)));
    
    {
    System.out.println(mf);
    }
    
    }
    }