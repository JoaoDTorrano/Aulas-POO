package Zumbiz;

public class Main {
    public static void main(String[] args) {

        Zumbi z1  = new Zumbi();
        Zumbi z2  = new Zumbi();

        z1.nome = "Chris";
        z2.nome = "Juan";

        z1.vida = 100;
        z2.vida = 200;

        System.out.println(z1.vida);
        System.out.println(z2.vida);

        z2.transfereVida(z1,20);

        System.out.println(z1.vida);
        System.out.println(z2.vida);
    }
}
