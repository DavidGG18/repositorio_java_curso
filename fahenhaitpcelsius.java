import java.util.Scanner;

public class fahenhaitpcelsius {
public static void main(String []args) {

Scanner teclado = new Scanner(System.in);

System.out.println(" Digite a temperatura em Farenheit");
 
Double  fahenhait = teclado.nextDouble();  
double celcius=(fahenhait-32) * 5/9;
teclado.close();
System.out.printf(" A temperatura em Farenheit é %.2f e convertida para Celsius é %.2f ", fahenhait, celcius);


}}