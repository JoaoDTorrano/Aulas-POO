package Lanchonete;

public class Main {
    public static void main(String[] args) {
        Cantina cantina = new Cantina();
        Salgado salgado1 = new Salgado();
        Salgado salgado2 = new Salgado();
        Salgado salgado3 = new Salgado();


        cantina.nome = "Salgados da Rosi";

        salgado1.nome = "Coxinha";
        salgado2.nome = "Esfirra";
        salgado3.nome = "Enroladinho";

        cantina.addSalgado(salgado1);
        cantina.addSalgado(salgado2);
        cantina.addSalgado(salgado3);

        cantina.monstraInfo();
    }
}
