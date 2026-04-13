package br.com.inatel.exercicio1_brownie;

public class BrownieCafe extends Brownie {

    public BrownieCafe(String nome, double preco, String sabor){
        super(nome, preco, sabor);
    }

    @Override
    public void addCarrinhoDeCompras() {
        System.out.println("Brownie de café adicionado ao carrinho ;)");
    }

    public void adicionaCafe(){
        System.out.println("Adicionando Cafe");
    }
}
