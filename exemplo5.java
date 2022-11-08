import java.util.Scanner;
public class exemplo5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char turma;
        double media, mediaTurmaA = 0.0, mediaTurmaB = 0.0;
        int contTurmaA = 0, contTurmaB = 0;
        do{
            System.out.println("Digite a turma (A ou B) ou S p/ sair: ");
            turma = entrada.next().charAt(0);//pegar o 1o caracter da linha fora o ENTER
            if(turma == 'A' || turma == 'a'){
                System.out.println("Digite a média: ");
                media = entrada.nextDouble();
                mediaTurmaA += media; //mediaTurmaA = mediaTurmaA + media;
                contTurmaA++;
            }else if(turma == 'B' || turma == 'b'){
                    System.out.println("Digite a média: ");
                    media = entrada.nextDouble();
                    mediaTurmaB += media; //mediaTurmaB = mediaTurmaA + media;
                    contTurmaB++;
                }
        }while (turma != 'S' && turma != 's');
        System.out.println("Turma A tem "+contTurmaA+" alunos e média igual a "+mediaTurmaA/contTurmaA);
        System.out.println("Turma B tem "+contTurmaB+" alunos e média igual a "+mediaTurmaB/contTurmaB);
    }
}