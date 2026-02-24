import java.util.Random;
import java.util.Scanner;

public class Exercicio_6 {
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
                if(numAdivinhado > numGerado) {
                    System.out.println("Errou o numero é menor do que o digitado!");
                }
                else if(numAdivinhado < numGerado){
                    System.out.println("Errou o numero é maior do que o digitado!");
                }
            }
        }while(numAdivinhado != numGerado);

        entrada.close();
    }
}
