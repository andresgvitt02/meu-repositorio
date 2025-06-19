package Exercicio2;

public class Main {
    public static void main(String[] args) {
        Veiculo carro = new Veiculo("Toyota", "Corolla", 2022);
        Veiculo moto = new Veiculo("Honda", "CG 160", 2020);

        carro.ligar();
        carro.desligar();

        moto.ligar();
        moto.desligar();
    }
}
