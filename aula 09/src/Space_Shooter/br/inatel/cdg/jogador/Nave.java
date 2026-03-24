package Space_Shooter.br.inatel.cdg.jogador;

import Space_Shooter.br.inatel.cdg.inimigo.Asteroide;

public class Nave {
    private String nome;
    private double vida;
    private String tipoTiro;

    public Nave(String nome, double vida, String tipoTiro){
        this.nome = nome;
        this.vida = vida;
        this.tipoTiro = tipoTiro;
    }

    public void atirar(Asteroide ast){
        if(ast.getTipoAsteroide().equals("Grande")){
            if(tipoTiro.equals("Explosivo")){
                ast.destruir();
            }
            else{
                this.vida -= 1;
                System.out.println("*AHH*  Asteroide atingiu a nave");
            }
        }
        else{
            ast.destruir();
        }
    }

    public String getNome() {
        return nome;
    }
}
