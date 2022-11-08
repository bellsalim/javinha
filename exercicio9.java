import java.util.Scanner;
public class exercicio9 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int cont1=0, cont2=0, cont3=0, cont4=0, cont5=0, cont6=0, voto;
        do{
            System.out.println("Entre com seu voto: ");
            voto = ent.nextInt();
            if(voto >= 1 && voto <= 6){
                switch(voto){
                    case 1: cont1++;
                            break;
                    case 2: cont2++;
                            break;
                    case 3: cont3++;
                            break;
                    case 4: cont4++;
                            break;
                    case 5: cont5++;
                            break;
                    case 6: cont6++;
                            break; 
                }
            }else if(voto == 0){
                        System.out.println("Término da votação!");
                    } else {
                        System.out.println("Voto inválido!");
                         }
        }while(voto != 0);
        System.out.println("Votos do candidato 1: "+cont1);
        System.out.println("Votos do candidato 2: "+cont2);
        System.out.println("Votos do candidato 3: "+cont3);
        System.out.println("Votos do candidato 4: "+cont4);
        System.out.println("Votos nulos: "+cont5);
        System.out.println("Votos em branco: "+cont6);
    }
}