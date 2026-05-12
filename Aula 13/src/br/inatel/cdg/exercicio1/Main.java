package br.inatel.cdg.exercicio1;

public class Main {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Crag", 490223912);
        Cliente cliente2 = new Cliente("Maya", 432463234);
        Cliente cliente3 = null;

        Conta conta = new Conta(2000, 1500);

        conta.addCliente(cliente1);
        conta.addCliente(cliente2);
        conta.addCliente(cliente3);

        conta.mostraInfo();
    }

}