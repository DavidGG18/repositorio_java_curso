import java.util.Scanner;
public class whilepin {
 
    public static void main (String []args) {

Scanner teclado = new Scanner (System.in); 
int pin_digitado = 0;
int PIN = 0;
int pin_digitado2 = 0;
System.out.println(" Digite sua senha PIN ");
pin_digitado = teclado.nextInt();
System.out.println(" Digite sua senha PIN NOVAMENTE ");
pin_digitado2 = teclado.nextInt();


while (pin_digitado != pin_digitado2) {
    System.out.println(" Pin errado"); 
    System.out.println(" Digite sua senha PIN ");
    pin_digitado2 = teclado.nextInt();
}
System.out.println(" Acesso aceito ");
        
    }}