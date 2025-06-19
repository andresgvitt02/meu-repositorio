package Exercicio1;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Notebook", 3500.00, "Notebook Dell 15'");
        Produto produto2 = new Produto("Mouse", 150.00, "Mouse sem fio");

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarAoCarrinho(produto1);
        carrinho.adicionarAoCarrinho(produto2);

        carrinho.listarProdutos();

        System.out.println("Total do carrinho: R$ " + carrinho.getTotal());
    }
}
