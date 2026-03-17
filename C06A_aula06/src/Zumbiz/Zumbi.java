package Zumbiz;

public class Zumbi {

    double vida;
    String nome;

    double mostraVida(){
        return vida;
    }

    public void transfereVida(Zumbi zumbiALvo, double quantia){

        zumbiALvo.vida += quantia;
        vida -= quantia;
    }
}
