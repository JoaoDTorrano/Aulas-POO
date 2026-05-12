package mamiferos;

public abstract class Mamifero {
    protected String nome;
    protected double vida;

    public Mamifero(String nome, double vida) {
        this.nome = nome;
        this.vida = vida;
    }

    public void mostraInfo(){
        System.out.println("Nome do animal: " + nome);
        if(nome.equals("Mamiferos.Lontra")){
            System.out.println("Vida da " + nome + ": " + vida);
        }
        else {
            System.out.println("Vida do " + nome + ": " + vida);
        }
    }

    public abstract void emitirSom();
}
