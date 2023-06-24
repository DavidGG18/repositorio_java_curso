// Nome do Aluno : David Gabriel Fonseca Simôes
// Ra: 32312961
// Data: 23/06/2023
/*  Nome do programa: sessão 5 problema 3  
Usando switch case semáforo */

import java.util.Scanner;

public class switch_case_semaforo {
public static void main (String[]args){

Scanner teclado = new Scanner (System.in);
System.out.println(" Digite um número 1, 2 ou 3  ");
int numero = teclado.nextInt();


switch(numero){
case 1: System.out.println(" A cor e vermelho e a próxima cor e verde ");
break;

case 2: System.out.println( " A cor é Verde e a próxima cor do semáfora e amarelo " );
break;

case 3: System.out.println( "  A cor amarelo e a próxima cor do semáfora e vermelho " );

default: System.out.println(" Número errado "); 
break;

}

 }}