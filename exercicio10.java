import java.util.Scanner;
public class exercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota1, nota2, nota3,  media, matricula, frequencia;
        
        System.out.println("Digite sua matricula ");
        matricula = entrada.nextDouble();
        System.out.println("qual a sua frequencia em porcetagem?");
        frequencia = entrada.nextDouble();

        System.out.println("Digite a 1a nota: ");
        nota1 = entrada.nextDouble();
        System.out.println("Digite a 2a nota: ");
        nota2 = entrada.nextDouble();
        System.out.println("Digite a 3a nota: ");
        nota3 = entrada.nextDouble();

        media = (nota1 + nota2 + nota3) / 3.0;

        if(media >= 6.0 && media < 10.0 && frequencia >= 75){
            System.out.println(matricula + ", você foi Aprovado!");
        }else
            System.out.println(matricula + ", você foi Reprovado!");
        }
    }