package Exercicio2;

public class Veiculo {
    String marca;
    String modelo;
    int ano;

    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void ligar() {
        System.out.println(marca + " " + modelo + " está ligado.");
    }

    public void desligar() {
        System.out.println(marca + " " + modelo + " está desligado.");
    }
}