package Karts;

public class Kart {

    String nome;
    Piloto piloto;
    Motor motor;

    public Kart() {
        motor = new Motor();
    }

    void pular(){
        System.out.println("Pulando...");
    }

    void soltarTurno(){
        System.out.println("Usou o Turbo...");
    }

    void fazerDrift(){
        System.out.println("Usou Drift...");
    }

}
