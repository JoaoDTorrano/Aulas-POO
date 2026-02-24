import java.util.Random;
import java.util.Scanner;

public class Exercicio_5 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Random rand = new Random();

        int numGerado, numAdivinhado;

        numGerado = rand.nextInt(10) + 1;

        System.out.println("Adivinhe o numero gerado: ");
        do{
            numAdivinhado = entrada.nextInt();
            if(numAdivinhado == numGerado){
                System.out.println("Acertou!!!!");
            }
            else{
                System.out.println("Errou!!!!");
            }
        }while(numAdivinhado != numGerado);

        entrada.close();
    }
}
