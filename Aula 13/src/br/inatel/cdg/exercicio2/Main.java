package br.inatel.cdg.exercicio2;

import br.inatel.cdg.exercicio2.exceptions.SaldoInsuficienteException;

public class Main {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Crag", 490223912);
        Cliente cliente2 = new Cliente("Maya", 432463234);
        Cliente cliente3 = null;

        Conta conta1 = new Conta(2000, 1500);
        Conta conta2 = new Conta(6500, 6000);
        Conta conta3 = new Conta(18000, 14000);

        conta1.addCliente(cliente1);
        conta2.addCliente(cliente2);
        conta3.addCliente(cliente3);

        try{
            conta1.sacar(80000);
        }catch(SaldoInsuficienteException e){
            System.out.println(e.getMessage());
        }

        conta1.mostraInfo();
        conta2.mostraInfo();
        conta3.mostraInfo();
    }

}