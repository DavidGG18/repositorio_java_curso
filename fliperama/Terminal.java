class Terminal {
    private static final int f_PER_moeda = 2;
    private cartao cartao;
    private PrizeCategory[] prizeCategories;

    public Terminal(PrizeCategory[] prizeCategories) {
        this.prizeCategories = prizeCategories;
    }

    // método para o usúario inserir dinheiro 
    public void Inserirdinheiro(int moeda) {
        int creditos = moeda * creditos_PER_moeda;
        cartao.setsaldo_cartao(cartao.getsaldo_cartao() + creditos);
    }

    public void checarsaldodocartao() {
        System.out.println(" Numero do cartão: " + cartao.getnumero_do_cartao());
        System.out.println(" saldo de créditos: " + cartao.getsaldo_cartao());
        System.out.println(" saldo de tiquetes: " + cartao.getsaldo_de_tiquetes());
    }

    public void transfercreditosAndTickets(cartao destinationcartao, int creditos, int tickets) {
        int sourcesaldo_cartao = cartao.getsaldo_cartao();
        int sourcesaldo_de_tiquetes = cartao.getsaldo_de_tiquetes();
        if (creditos <= sourcesaldo_cartao && tickets <= sourcesaldo_de_tiquetes) {
            cartao.setsaldo_cartao(sourcesaldo_cartao - creditos);
            cartao.setsaldo_de_tiquetes(sourcesaldo_de_tiquetes - tickets);
            destinationcartao.setsaldo_cartao(destinationcartao.getsaldo_cartao() + creditos);
            destinationcartao.setsaldo_de_tiquetes(destinationcartao.getsaldo_de_tiquetes() + tickets);
            System.out.println(" Transferencia  realizada com  sucesso.");
        } else {
            System.out.println(" creditos insuficientes. ");
        }
    }

    public void requestPrize(PrizeCategory prizeCategory) {
        if (cartao.getsaldo_de_tiquetes() >= prizeCategory.getRequiredTickets() && prizeCategory.getRemainingItems() > 0) {
            cartao.setsaldo_de_tiquetes(cartao.getsaldo_de_tiquetes() - prizeCategory.getRequiredTickets());
            prizeCategory.setRemainingItems(prizeCategory.getRemainingItems() - 1);
            System.out.println("Prize " + prizeCategory.getName() + " awarded.");
            System.out.println("Remaining " + prizeCategory.getName() + " items: " + prizeCategory.getRemainingItems());
        } else {
            System.out.println(" creditos insuficientes " + prizeCategory.getName() + " available.");
        }
    }

    public void usecartao(cartao cartao) {
        this.cartao = cartao;
    }
}