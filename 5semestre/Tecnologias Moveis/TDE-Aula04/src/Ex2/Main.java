package Ex2;

public class Main {
    public static void main(String[] args) {
        // Criando duas contas bancárias
        ContaBancaria conta1 = new ContaBancaria("Ana", 1000);
        ContaBancaria conta2 = new ContaBancaria("João", 500);

        // Exibindo saldo inicial
        conta1.exibirSaldo();
        conta2.exibirSaldo();

        // Testando operações
        conta1.depositar(300);
        conta1.sacar(200);
        conta1.transferir(conta2, 150);

        // Exibindo saldo final
        conta1.exibirSaldo();
        conta2.exibirSaldo();
    }
}
