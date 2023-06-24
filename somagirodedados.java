import java.util.Random;
import java.util.Scanner;

public class somagirodedados {
    public static void main(String[]args){

    Scanner teclado = new Scanner(System.in);

Random rnd = new Random();
int dado1 = rnd.nextInt(6)+1;
System.out.println(" Saiu o número " + dado1);

Random rnd2 = new Random();
int dado2 = rnd.nextInt(6)+1;
System.out.println(" Saiu o número " + dado2);

int soma = dado1 + dado2;
System.out.println(" A soma dos números é " + soma);

    }
}