package br.com.inatel.exercicio1_brownie;

public class Brownie {
    protected String nome;
    protected double preco;
    protected String sabor;

    public Brownie(String nome, double preco, String sabor) {
        this.nome = nome;
        this.preco = preco;
        this.sabor = sabor;
    }

    public void addCarrinhoDeCompras() {
        System.out.println(nome + " adicionado ao carrinho de compras");
    }

    public void calculaValorTotalCompra(){
        System.out.println(nome + " por R$" + preco);
    }

    public void mostraInfo(){
        System.out.println("Produto: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Sabor: " + sabor);
    }

    public double getPreco() {
        return preco;
    }
}
