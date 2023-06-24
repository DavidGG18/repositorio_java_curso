public class Equipe {

    private   String nome;  
    private int vitorias;
    private int derrotas;
    private int empate;
    private int golsmarcados;
    private int golssofridos;

    // get recupera exibe os dados 
    // set altera os dados 

    // get nome exibe dados nome
  public String getnome(){
        return nome;
    }

    // set nome pode alterar os nome 
public void setnome(String n) {
    nome = n;
}


public int getvitorias(){
    return vitorias;
} 

public void setvitorias(int vitorias){
    this.vitorias = vitorias;
}
/* Se nome das variaveis for igual precisa colocar o this para o prorama saber que está sendo puxado das
 variaveis se não tiver this e a 
*/

public int getderrotas(){
    return derrotas;
} 

public void setderrotas(int derrotas){
    this.derrotas = derrotas;
}


public int empate(){
    return empate;
} 

public void setempate(int empate){
    this.empate = empate;
}

public int getgolsmarcados(){
    return golsmarcados;
} 

public void setgolsmarcados(int golsmarcados){
    this.golsmarcados = golsmarcados;
}

public int golssofridos(){
    return golssofridos;
} 

public void setgolssofridos(int golssofridos){
    this.golssofridos = golssofridos;
}

}