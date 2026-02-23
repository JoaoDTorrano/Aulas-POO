import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor do lanche1: ");
        int lanche1 = entrada.nextInt();
        System.out.println("Digite o valor do lanche2: ");
        int lanche2 = entrada.nextInt();
        System.out.println("Digite o valor do lanche3: ");
        int lanche3 = entrada.nextInt();

        int total = lanche1 + lanche2 + lanche3;

        System.out.println("Total de lanches: " + total);

        float media = (float)total / 3;

        System.out.printf("Média de lanches = %.2f\n" , media);
        System.out.println("Média de lanches = " + media);
        System.out.print("Média de lanches = " + media);

        entrada.close();

    }
}
