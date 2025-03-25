package Exercicio6;

public class Main {
    public static void main(String[] args) {
        Veiculo meuCarro = new Carro();
        Veiculo meuEsportivo = new CarroEsportivo();

        meuCarro.ligar();
        meuCarro.desligar();

        meuEsportivo.ligar();
        meuEsportivo.desligar();
    }