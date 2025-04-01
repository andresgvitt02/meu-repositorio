package Exercicio3;

// Classe que representa o sistema de caixa
class Caixa {
    public double aplicarDesconto(double valor, Desconto desconto) {
        return desconto.calcular(valor);
    }
}
