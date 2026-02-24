import java.util.Scanner;

public class Exercicio_4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o numero de alunos: ");
        int n_alunos = entrada.nextInt();

        switch(n_alunos){
            case 10:
            case 20:
                System.out.println("Sala I-16");
            break;

            case 30:
                System.out.println("Sala I-22");
            break;

            default:
                System.out.println("Sala não encontrada");
            break;
        }

        entrada.close();
    }
}
