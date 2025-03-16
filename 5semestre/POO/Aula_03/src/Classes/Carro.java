package Classes;

public class Carro {
    String marca;
    String modelo;
    String ano;
    String cor;
    String cv;
    Pessoa pessoa;

    public Carro(Pessoa dono) {
        this.pessoa = dono;
    }

    public void ligar(){
        System.out.println("Ligando...");
    }
    public void desligar(){
        System.out.println("Desligando..");
    }
}
