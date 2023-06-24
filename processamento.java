import java.util.Scanner;

public class processamento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que insira um nome
        System.out.print("Digite um nome: ");
        String nomeCompleto = scanner.nextLine();

        // Extrair o primeiro e último nomes
      //  String[] partesNome = nomeCompleto.trim().split("\\s+");
        String primeiroNome = partesNome[0];
        String ultimoNome = partesNome[partesNome.length - 1];

        // Exibir o nome no console
        System.out.println("Nome completo: " + nomeCompleto);
        System.out.println("Primeiro nome: " + primeiroNome);
        System.out.println("Último nome: " + ultimoNome);
    }
}
