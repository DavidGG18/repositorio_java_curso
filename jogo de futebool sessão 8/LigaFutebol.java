public class ProgramaLigaFutebol {
    public static void main(String[] args) {

        Equipe barcelona = new Equipe();
        Equipe realmadrid = new Equipe();

        ligaliga liga = new ligaliga();

        barcelona.setnome("Barcelona");
        realmadrid.setnome("Real Madrid");

        jogo jogodeabertura = new jogo();

        jogodeabertura.settemperatura(30);
        jogodeabertura.settime1(barcelona);
        jogodeabertura.settime2(realmadrid);
        jogodeabertura.setPlacarTime1(5);
        jogodeabertura.setplacart1(0);
        
        liga.tabeladejogos.add(jogoDeAbertura);

        System.out.println(jogodeabertura.gettime1().getNome()
            +" "+          jogodeabertura.getPlacarTime1() +"x"+ jogodeabertura.getPlacarTime2()
            +" "+          jogodeabertura.gettime2().getNome());
    }
}