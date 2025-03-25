package Ex3;

public class Main {
    public static void main(String[] args) {
        Funcionario func = new Funcionario("Carlos", 3000);
        Gerente gerente = new Gerente("Mariana", 5000);
        Desenvolvedor dev = new Desenvolvedor("Lucas", 4000);

        func.exibirDados();
        System.out.println("Bônus: R$ " + func.calcularBonus() + "\n");

        gerente.exibirDados();
        System.out.println("Bônus: R$ " + gerente.calcularBonus() + "\n");

        dev.exibirDados();
        System.out.println("Bônus: R$ " + dev.calcularBonus());
    }
}

