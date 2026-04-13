package br.com.inatel.exercicio1_brownie;

public class BrownieDoceDeLeite extends Brownie{

    public BrownieDoceDeLeite(String nome, double preco, String sabor){
        super(nome, preco, sabor);
    }

    @Override
    public void addCarrinhoDeCompras() {
        System.out.println("Brownie de doce de leite adicionado ao carrinho :)");
    }

    public void adicionaDoceDeLeite(){
        System.out.println("Adicionando Doce de Leite");
    }
}
