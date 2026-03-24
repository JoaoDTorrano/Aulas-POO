package Space_Shooter;
import Space_Shooter.br.inatel.cdg.inimigo.Asteroide;
import Space_Shooter.br.inatel.cdg.jogador.Nave;

public class Main {
    public static void main(String[] args) {

        Nave nave1 = new Nave("Fox",10,"Explosivo");
        Nave nave2 = new Nave("Crow",20,"Normal");
        Nave nave3 = new Nave("Wolf",10,"Explosivo");
        Asteroide ast1 = new Asteroide("Asteroide1","Grande");
        Asteroide ast2 = new Asteroide("Asteroide2","Pequeno");
        Asteroide ast3 = new Asteroide("Asteroide3","Grande");

        System.out.println("Desempenho da nave " + nave1.getNome());
        nave1.atirar(ast1);
        nave1.atirar(ast2);
        nave1.atirar(ast3);

        System.out.println("Desempenho da nave " + nave2.getNome());
        nave2.atirar(ast1);
        nave2.atirar(ast2);
        nave2.atirar(ast3);

        System.out.println("Desempenho da nave " + nave3.getNome());
        nave3.atirar(ast1);
        nave3.atirar(ast2);
        nave3.atirar(ast3);
    }
}
