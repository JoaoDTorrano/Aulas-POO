package br.com.inatel.exercicio1_brownie;

public class BrownieNutella extends Brownie {

    public BrownieNutella(String nome, double preco, String sabor){
        super(nome,preco,sabor);
    }

    @Override
    public void addCarrinhoDeCompras() {
        System.out.println("Brownie de Nutella adicionado ao carrinho de compras :>");
    }

    public void adicionaNutella(){
        System.out.println("Adicionando Nutella");
    }
}
