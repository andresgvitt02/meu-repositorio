package Exercicio2;

public class ContaBancaria {
    private String titular;
    private double saldo;

    // Construtor
    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    // Método para depositar dinheiro
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    // Método para sacar dinheiro
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }

    // Método para transferir dinheiro para outra conta
    public void transferir(ContaBancaria destino, double valor) {
        if (valor > 0 && valor <= saldo) {
            this.sacar(valor);
            destino.depositar(valor);
            System.out.println("Transferência de R$ " + valor + " para " + destino.titular + " realizada com sucesso.");
        } else {
            System.out.println("Transferência falhou. Saldo insuficiente ou valor inválido.");
        }
    }

    // Método para exibir o saldo atual
    public void exibirSaldo() {
        System.out.println("Titular: " + titular + " | Saldo: R$ " + saldo);
    }


}
