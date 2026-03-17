package Lanchonete;

public class Cantina {
    String nome;
    Salgado[] salgados = new Salgado[5];

    void addSalgado(Salgado novoSalgado){
        for(int i=0; i < salgados.length; i++){
            if(salgados[i] == null) {
                salgados[i] = novoSalgado;
                break;
            }
        }
    }

    void monstraInfo(){
        System.out.println(this.nome);
        System.out.println("Salgados de hoje:");
        /*for(int i=0; i < salgados.length; i++){
            System.out.println(salgados[i].nome);
        }
         */
        for(Salgado salgado: salgados){
            if(salgado != null) {
                System.out.println(salgado.nome);
            }
        }
    }
}
