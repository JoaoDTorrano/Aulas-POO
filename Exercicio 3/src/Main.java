import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner nota = new Scanner(System.in);

        System.out.println("Digite a nota da NP1: ");
        int NP1 = nota.nextInt();
        System.out.println("Digite a nota da NP2: ");
        int NP2 = nota.nextInt();

        int NPA = NP1+NP2;

        float media = (float)NPA/2;

        if(media >= 60){
            System.out.println("Você foi aprovado, sua nota final é " + media);
        }
        else if (media < 60 && media >= 30){
            System.out.println("Você precisa fazer NP3");

            System.out.println("Digite a nota da NP3: ");
            int NP3 = nota.nextInt();

            int NFA = NP3 + NPA;

            media = (float)NFA/2;

            if(media >= 50){
                System.out.println("Você foi aprovado, sua nota final é " + media);
            }
            else{
                System.out.println("Você reprovou, sua nota final é " + media);
            }
        }
        else{
            System.out.println("Você reprovou, sua nota final é " + media);
        }
    }
}
