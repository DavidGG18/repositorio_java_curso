import java.util.Scanner;

public class if_cores {
    public static void main (String[]args) {
    Scanner teclado = new Scanner(System.in);

        System.out.println(" Digite um número ");
        Double cor = teclado.nextDouble();

        if(cor >= 380 && cor < 450){
        System.out.println( " Violeta " );
        }
        else if (cor >= 450 && cor < 495){
        System.out.println( " Azul " );
        }
        else if (cor >= 495 && cor < 570){
        System.out.println( " Verde " );
        }
        else if (cor >= 570 && cor < 590){
        System.out.println( " Amarelo " );
        }
        else if (cor >= 590 && cor < 620){
        System.out.println( " Laranja " );
        }
        else if (cor >= 620 && cor < 750){
        System.out.println( " Vermelho " );
        }else { System.out.println( " Número errado " );
        }



        
    }
}