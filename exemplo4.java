import java.util.Scanner;
public class exemplo4{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota1, nota2, media;
        String nome;//cadeia de caracteres
        
        System.out.println("Digite seu nome: ");//escreva
        nome = entrada.nextLine();//leia
        System.out.println("Digite a 1a nota: ");
        nota1 = entrada.nextDouble();
        System.out.println("Digite a 2a nota: ");
        nota2 = entrada.nextDouble();
        media = (nota1 + nota2) / 2.0;
        if(media >= 7.0 && media < 10.0){
            System.out.println(nome + ", você foi Aprovado!");
        }else if(media < 7.0){
            System.out.println(nome + ", você foi Reprovado!");
        }else{
            System.out.println(nome + ", você foi Aprovado com Distinção!!!");
        }
    }
}