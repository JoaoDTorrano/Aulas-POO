package Campo_Minado;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Campo campo = new Campo();
        int x, y;
        int jogarNovamente;

        do {
            System.out.println("Digite as coordenadas: ");
            x = entrada.nextInt();
            y = entrada.nextInt();
            campo.campoMinado(x, y);
            System.out.println("Quer jogar de novo se sim digite 1 se n digite 0: ");
            jogarNovamente = entrada.nextInt();
        }while(jogarNovamente == 1);
    }
}