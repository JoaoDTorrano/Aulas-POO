package Campo_Minado;
import java.util.Random;

public class Campo {
    boolean montado[][] = new boolean[2][2];

    Random rand = new Random();
    int z = rand.nextInt(2);
    int t = rand.nextInt(2);

    void campoMinado(int x, int y) {
        montado[z][t] = true;
        for (int i = 0; i < montado.length; i++) {
            for (int j = 0; j < montado[i].length; j++) {
                if(montado[x][y] == true) {
                    System.out.println("Booooom!");
                    break;
                }
                else{
                    System.out.println("GANHOU!!!");
                    break;
                }
            }
            break;
        }
    }
}