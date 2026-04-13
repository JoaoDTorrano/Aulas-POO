package br.com.inatel.exercicio1_brownie;

public class Comprador {
    private String nome;
    private static double saldo;

    public Comprador(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    public void efetuarCompra(Brownie brownie){
        if(saldo > brownie.preco){
            saldo = saldo - brownie.preco;
            System.out.println("Compra efetuado com sucesso");
        }
    }

    public static double getSaldo() {
        return saldo;
    }
}
