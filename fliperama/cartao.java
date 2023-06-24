// classe cartão
public class cartao {

    // atributos 
    private int numero_do_cartao;
    private Double saldo_cartao;
   private Double saldo_de_tiquetes;
   
   // Métodos

   public Cartao(int numero_do_cartao) {
    this.numero_do_cartao = numero_do_cartao;
    this.saldo_cartao = 0;
    this.saldo_de_tiquetes = 0;
}

// exibir o numero do cartão
public int getnumero_do_cartao() {
    return numero_do_cartao;
}
// Exibir o saldo do cartão
 public int getsaldo_cartao() {
        return saldo_cartao;
    }

    public void setsaldo_cartao(int saldo_cartao) {
        this.saldo_cartao = saldo_cartao;
    }
// Exibir saldo de tiquetes
    public int getsaldo_de_tiquetes() {
        return saldo_de_tiquetes;
    }

    public void setsaldo_de_tiquetes(int saldo_de_tiquetes) {
        this.saldo_de_tiquetes = saldo_de_tiquetes;
    }
}

