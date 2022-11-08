import java.util.Scanner;
public class exercicio77 {
    public static void main(String args[]){
        
        Scanner entrada = new Scanner(System.in);
        double Numeros=0.0;
        int contNumeros=0;

        do{
            System.out.println("Digite um número ");
            Numeros = entrada.next().charAt(0);

            if (Numeros > 0 ){
                System.out.println("Digite um número ");
                Numeros = entrada.nextDouble();
                Numeros += contNumeros; 
                contNumeros++;}

        } while (Numeros <=0);

        System.out.println("a somatória dos números é  " + Numeros/contNumeros);
     
      
    }

}


