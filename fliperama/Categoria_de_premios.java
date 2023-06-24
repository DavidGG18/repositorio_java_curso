class Categoria_de_premios {
    private String nome_do_premio;
    private int tiquetes_requeridos;
    private int contagem_de_itens;

    public PrizeCategory(String nome_do_premio, int tiquetes_requeridos, int contagem_de_itens) {
        this.nome_do_premio = nome_do_premio;
        this.tiquetes_requeridos = tiquetes_requeridos;
        this.contagem_de_itens = contagem_de_itens;
    }

    public String getnome_do_premio() {
        return nome_do_premio;
    }

    public int gettiquetes_requeridos() {
        return tiquetes_requeridos;
    }

    public int getcontagem_de_itens() {
        return contagem_de_itens;
    }

    public void setcontagem_de_itens(int contagem_de_itens) {
        this.contagem_de_itens = contagem_de_itens;
    }
}
