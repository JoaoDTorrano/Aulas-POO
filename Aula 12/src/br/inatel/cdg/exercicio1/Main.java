package br.inatel.cdg.exercicio1;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Double> listaDeDouble = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            listaDeDouble.add(random.nextDouble());
        }

        Collections.sort(listaDeDouble, Collections.reverseOrder());

        for(Double d : listaDeDouble) {
            System.out.println(d);
        }
    }
}
