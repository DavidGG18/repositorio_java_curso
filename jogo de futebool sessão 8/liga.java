import java.util.Scanner;
import caminho.para.Equipe;
import caminho.para.ligaliga;
import caminho.para.jogo;

public class liga {
    public static void main(String [] args ) {

        Equipe barcelona = new Equipe();
        Equipe realmadri = new Equipe();

ligaliga liga = new ligaliga(); 

        barcelona.setnome(" barcelona ");
        realmadri.setnome(" real madri ");

jogo jogodeabertura = new jogo();


jogodeabertura.settemperatura(30);
jogodeabertura.settime1(barcelona);
jogodeabertura.settime("barcelona");
jogodeabertura.settime2(realmadri);
jogodeabertura.setplacart1(5);
jogodeabertura.setplacart2(0);

liga.tabeladejogos.add(jogodeabertura);
jogo partidafinal = new jogo();
liga.tabeladejogos.add(partidafinal);

liga.tabeladejogos.remove(1);

System.out.println( jogodeabertura.gettime1().getNome() +" "+ jogodeabertura.getplacart1() +"x"+ jogodeabertura.getplacart2()     +" "+     jogodeabertura.gettime2().getNome() );

}
}