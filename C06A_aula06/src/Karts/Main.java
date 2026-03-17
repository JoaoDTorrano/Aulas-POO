package Karts;

public class Main {
    public static void main(String[] args) {

        Kart kart1 = new Kart();
        Kart kart2 = new Kart();

        Piloto p1 = new Piloto();
        Piloto p2 = new Piloto();

        kart1.piloto = p2;
        kart2.piloto = p1;

        kart1.piloto.nome = "Farriz";
    }
}
