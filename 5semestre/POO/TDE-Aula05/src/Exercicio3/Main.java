package Exercicio3;

// Classe principal para testar a aplicação
public class Main {
    public static void main(String[] args) {
        Caixa caixa = new Caixa();

        double valorOriginal = 100.0;

        Desconto descontoNatal = new DescontoNatal();
        System.out.println("Preço com desconto de Natal: R$ " + caixa.aplicarDesconto(valorOriginal, descontoNatal));

        Desconto descontoAniversario = new DescontoAniversario();
        System.out.println("Preço com desconto de Aniversário: R$ " + caixa.aplicarDesconto(valorOriginal, descontoAniversario));
    }
}

