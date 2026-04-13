package br.com.inatel.exercicio1_brownie;

public class Main {
    public static void main(String[] args) {
        Comprador comp = new Comprador("Juliano", 100);
        BrownieNutella bn = new BrownieNutella("Brownie de Nutella", 10, "Nutella");
        BrownieDoceDeLeite bdl = new BrownieDoceDeLeite("Brownie de Doce de Leite", 9, "Doce de Leite");
        BrownieCafe bc = new BrownieCafe("Brownie de Cafe", 12, "Cafe");

        bc.mostraInfo();
        bn.mostraInfo();
        bdl.mostraInfo();

        bc.addCarrinhoDeCompras();
        bn.addCarrinhoDeCompras();
        bdl.addCarrinhoDeCompras();

        bc.calculaValorTotalCompra();
        bn.calculaValorTotalCompra();
        bdl.calculaValorTotalCompra();

        bc.adicionaCafe();
        bn.adicionaNutella();
        bdl.adicionaDoceDeLeite();

        System.out.println("Saldo atual é de R$ " + comp.getSaldo());

        comp.efetuarCompra(bc);
        comp.efetuarCompra(bdl);
        comp.efetuarCompra(bn);

        System.out.println("Agora seu saldo é de R$ " + comp.getSaldo());
    }
}
