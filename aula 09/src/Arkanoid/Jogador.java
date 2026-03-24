package Arkanoid;

public class Jogador {
    private String nome;
    private int pontos;
    public Jogador(String nome){
        this.nome = nome;
    }

    public void destroi(int numDestruidos){
        numDestruidos--;
    }

    public void pontos(int numDestruidos){

    }

    public int getPontos() {
        return pontos;
    }
}
