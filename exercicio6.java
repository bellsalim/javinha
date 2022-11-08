import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        double p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, media;

        System.out.println("digite a idade da pessoa 1 ");
        Scanner scan = new Scanner(System.in);
        p1 = scan.nextFloat();
        if (p1 >= 18){
            System.out.println(p1);
        }

        System.out.println("digite  a idade da pessoa 2 ");
        p2 = scan.nextFloat();
        if (p2 >= 18){
            System.out.println(p2);
        }
        System.out.println("digite  a idade da pessoa 3 ");
        p3 = scan.nextFloat();
        if (p3 >= 18){
            System.out.println(p3);
        }
        System.out.println("digite  a idade da pessoa 4 ");
        p4 = scan.nextFloat();
        if (p4 >= 18){
            System.out.println(p4);
        }
        
        System.out.println("digite  a idade da pessoa 5 ");
        p5 = scan.nextFloat();
        if (p5 >= 18){
            System.out.println(p5);
        }
        
        System.out.println("digite  a idade da pessoa 6 ");
        p6 = scan.nextFloat();
        if (p6 >= 18){
            System.out.println(p6);
        }
        
        System.out.println("digite  a idade da pessoa 7 ");
        p7 = scan.nextFloat();
        if (p7 >= 18){
            System.out.println(p7);
        }
        
        System.out.println("digite  a idade da pessoa 8 ");
        p8 = scan.nextFloat();
        if (p8 >= 18){
            System.out.println(p8);
        }
        
        System.out.println("digite  a idade da pessoa 9 ");
        p9 = scan.nextFloat();
        if (p9 >= 18){
            System.out.println(p9);
        }
        
        System.out.println("digite  a idade da pessoa 10 ");
        p10 = scan.nextFloat();
        if (p10 >= 18){
            System.out.println(p10);
        }

        media = (p1 + p2 + p3 + p4 + p5 + p6 + p7 + p8 + p9 + p10)/10;
        System.out.println("a média das idades é  " + media);

    }

}