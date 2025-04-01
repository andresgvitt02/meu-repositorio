package Exercicio3;

public class DescontoNatal implements Desconto {
    @Override
    public double calcular(double valor) {
        return valor * 0.90; // 10% de desconto
    }
}
