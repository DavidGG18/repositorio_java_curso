import java.util.Scanner;

public class hipotenusa {
public static void main(String []args) {

Scanner teclado = new Scanner(System.in);

System.out.println(" Digite o valor do lado A");
Double ladoa = teclado.nextDouble(); 
System.out.println(" Digite o valor do lado B");
Double ladob = teclado.nextDouble(); 


Double quadrado = (ladoa * ladoa) + (ladob * ladob);
Double raizQuadrada = Math.sqrt(quadrado);
teclado.close();
System.out.printf(" O valor da hipotenuna é %.2f ", raizQuadrada);
      



}}