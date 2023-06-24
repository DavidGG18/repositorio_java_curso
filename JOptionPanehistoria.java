import javax.swing.JOptionPane;

public class JOptionPanehistoria {
    public static void main(String[] args) {

// Exibir uma mensagem
JOptionPane.showMessageDialog(null, "Olá! Bem-vindo! \n vamos criar uma historia   ");

        // Solicitar ao usuário que digite algo
String nome = JOptionPane.showInputDialog(null, "Digite o nome do personagem:");

        // Exibir o que o usuário digitou
JOptionPane.showMessageDialog(null, nome + " Estava fazendo uma atividade de matemática \n Uma qestão dizia para o aluno fazer o calculo com dois numeros inteiros ");
int Numero1 = Integer.parseInt(JOptionPane.showInputDialog(" Digite o primeiro numéro"));
int n2 = Integer.parseInt(JOptionPane.showInputDialog( " Digite o outro numéro "));
int soma = Numero1 + n2;
JOptionPane.showMessageDialog(null, " A soma deu " + soma);
JOptionPane.showMessageDialog(null, " a próxima qestão dizia para o aluno fazer o calculo com dois numeros reais ");
Double n1 = Double.parseDouble(JOptionPane.showInputDialog(" Digite o primeiro numéro real"));
Double Numero2 = Double.parseDouble(JOptionPane.showInputDialog( " Digite o outro numéro real"));
Double somaReal  = n1 + Numero2;
JOptionPane.showMessageDialog(null, " A soma deu " + somaReal );
JOptionPane.showMessageDialog(null,nome + " Acertou asquestões e concluiu a prova");
}
}
