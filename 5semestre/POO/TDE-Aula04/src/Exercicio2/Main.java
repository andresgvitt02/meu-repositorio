package Exercicio2;

public class Main {
    // Método principal para testar a classe
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("Maria", 1000);
        ContaBancaria conta2 = new ContaBancaria("Carlos", 500);

        conta1.exibirSaldo();
        conta2.exibirSaldo();

        conta1.depositar(200);
        conta1.sacar(150);
        conta1.transferir(conta2, 300);

        conta1.exibirSaldo();
        conta2.exibirSaldo();
    }
}
