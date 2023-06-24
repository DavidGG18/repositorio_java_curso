import java.util.Scanner;

public class trocar_letra_do_nome {
public static void main(String []args) {

Scanner teclado = new Scanner(System.in);

System.out.println(" Digite o seu nome e sobrenome ");
String nome = teclado.nextLine();


String[] nomeseparado = nome.split(" ");
String primeiro_nome = nomeseparado[0];
        String sobrenome = nomeseparado[nomeseparado.length - 1];
        

        // Exibir o nome no console
        System.out.println("Nome completo: " + nome);
        System.out.println("Primeiro nome: " + primeiro_nome);
        System.out.println("Sobrenome : " + sobrenome);

        // charAt serve para pegar uma letra do nome de acordo com sua alocação (0) seria primeira letra do nome (1) seria a segunda letra 
        System.out.println(" Seu nome embaralhado é  : " + sobrenome + " " + primeiro_nome.charAt(0));
 


}}