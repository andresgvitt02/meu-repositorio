package Exercicio3;

public class Main {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente("João", 1000);
        ContaPoupanca cp = new ContaPoupanca("Maria", 2000);
        ContaSalario cs = new ContaSalario("Carlos", 1500);

        cc.depositar(500);
        System.out.println("Saldo Conta Corrente após depósito: " + cc.consultarSaldo());

        boolean saquePoupanca = cp.sacar(300);
        System.out.println("Saque da poupança foi " + (saquePoupanca ? "bem-sucedido" : "falhou"));
        System.out.println("Saldo Conta Poupança: " + cp.consultarSaldo());

        boolean transferencia = cc.transferir(cp, 200);
        System.out.println("Transferência foi " + (transferencia ? "realizada" : "falhou"));

        System.out.println("Saldo final Conta Corrente: " + cc.consultarSaldo());
        System.out.println("Saldo final Conta Poupança: " + cp.consultarSaldo());
        System.out.println("Saldo final Conta Salário: " + cs.consultarSaldo());
    }
}