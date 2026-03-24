package Arkanoid;

public class Main {
    public static void main(String[] args) {
        Jogador jg = new Jogador("Joao");

        Bloco bloco1 = new Bloco();
        Bloco bloco2 = new Bloco();
        Bloco bloco3 = new Bloco();
        Bloco bloco4 = new Bloco();
        Bloco bloco5 = new Bloco();

        System.out.println("Numero de blocos: " + Bloco.getNumBlocos());

        jg.destroi(Bloco.getNumBlocos());

    }
}
