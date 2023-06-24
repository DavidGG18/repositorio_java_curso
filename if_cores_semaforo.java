import java.util.Scanner;

public class if_cores_semaforo {
    public static void main (String[]args) {
    Scanner teclado = new Scanner(System.in);

        System.out.println(" Digite um número entre 1, 2 e 3");
        int cor = teclado.nextInt();

        if(cor == 1){
        System.out.println( " A cor é vermelho e a próxima cor do semáfora e verde " );
        }
        else if (cor == 2){
        System.out.println( " A cor é Verde e a próxima cor do semáfora e amarelo " );
        }
        else if (cor == 3){
        System.out.println( "  A cor amarelo e a próxima cor do semáfora e vermelho " );
    
        }else { System.out.println( " Número errado " );
        }



        
    }
}