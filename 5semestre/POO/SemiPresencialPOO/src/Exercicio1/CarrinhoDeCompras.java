package Exercicio1;

import java.util.ArrayList;

public class CarrinhoDeCompras {
    private ArrayList<Produto> produtos;
    private double valorTotal;

    public CarrinhoDeCompras() {
        this.produtos = new ArrayList<>();
        this.valorTotal = 0;
    }

    public void adicionarAoCarrinho(Produto produto) {
        produtos.add(produto);
        valorTotal += produto.valor;
    }

    public double getTotal() {
        return valorTotal;
    }

    public void listarProdutos() {
        for (Produto p : produtos) {
            System.out.println("Produto: " + p.nome + " | Valor: " + p.valor + " | Descrição: " + p.descricao);
        }
    }
}
