package Bandas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Banda banda = new Banda("Crustsox","Punk Rock");
        Membro membro1 = new Membro("Chris", "vocalista");
        Membro membro2 = new Membro("Zack", "Baterista");
        Membro membro3 = new Membro("John", "Baixista");
        Musica musica1 = new Musica("Hate Myself", 4.30);
        Musica musica2 = new Musica("Shut the fuck up", 3.50);

        banda.addMembro(membro1);
        banda.addMembro(membro2);
        banda.addMembro(membro3);
        banda.addMusica(musica1);
        banda.addMusica(musica2);
        banda.mostrarInfo();

        int n;
        int m;

        System.out.println("Quer adcionar outros membros a banda? Se sim digite 1 se nao digite 0! ");
        n = entrada.nextInt();
        if(n == 1) {
            Membro membro4 = new Membro("Hunter", "Guitarrista");
            Membro membro5 = new Membro("Loki", "Back vocal");

            banda.addMembro(membro4);
            banda.addMembro(membro5);
        }

        System.out.println("Quer adcionar outras musicas a discografia? Se sim digite 1 se nao digite 0! ");
        m = entrada.nextInt();
        if(m == 1){
            Musica musica3 = new Musica("Miss her", 5.00);
            Musica musica4 = new Musica("Sad clow", 2.15);

            banda.addMusica(musica3);
            banda.addMusica(musica4);

        }

        banda.mostrarInfo();
        entrada.close();
    }
}
