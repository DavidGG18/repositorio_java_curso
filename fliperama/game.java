import java.util.Random;

import javax.smartcardio.cartao;

class game {

private int numero_de_creditos_n;
Random rnd = new Random();

// gerador numéro aleatório
int numero_aleatorio = rnd.nextInt(1000)+1;


  public void playGame(cartao cartao) {
        int saldo_cartao = cartao.getsaldo_cartao();
        if (saldo_cartao >= CREDITS_PER_GAME) {
            
System.out.println(" Número do cartão : " + cartao.getnumero_do_cartao());
System.out.println(" Números de creditos para jogar : " + numero_aleatorio);
cartao.setsaldo_de_tiquetes(cartao.getsaldo_de_tiquetes() + numero_aleatorio);
cartao.setsaldo_cartao(saldo_cartao - numero_de_creditos_n);
System.out.println(" Novo número de tiquetes no cartã apos jogar o  jogo : " + cartao.getsaldo_de_tiquetes());
} else {
System.out.println(" creditos insuficientes para jogar .");
        }
    }

}