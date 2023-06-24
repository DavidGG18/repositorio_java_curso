
/* Sessão 3 problema 2 Faça com que o usuário insira um número e use um loop for para 
exibir todos os múltiplos desse número de 1 a 12.
 */


import java.util.Scanner;
public class Tabuada {

public static void main(String[] args) {
int num;

Scanner leitura = new Scanner(System.in);
System.out.println("Informe o numero desejado" + "ou digite 0 para sai ");
num = leitura.nextInt();

for (int i=0;i<=12;i++) {
System.out.println(num + " vezes " + i + " = " + num * i);
 
   
}
}}


