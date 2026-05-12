package mamiferos;

import mamiferos.Interface.Aquatico;

public class Lontra extends Mamifero implements Aquatico {
    public Lontra(String nome, double vida){
        super(nome,vida);
    }

    @Override
    public void emitirSom() {
        System.out.println("O " + nome + " faz IhihIhihihihihIhih");
    }

    @Override
    public void nadar(){
        System.out.println("A " + nome + " nada e nada");
    }
}
