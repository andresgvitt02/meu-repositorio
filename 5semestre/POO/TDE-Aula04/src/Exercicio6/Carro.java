package Exercicio6;

interface Veiculo {
    void ligar();
    void desligar();
}

class Motor {
    private boolean funcionando;

    public Motor() {
        this.funcionando = false;
    }

    public void ligar() {
        this.funcionando = true;
    }

    public void desligar() {
        this.funcionando = false;
    }

    public boolean isFuncionando() {
        return funcionando;
    }
}

class Carro implements Veiculo {
    protected Motor motor;

    public Carro() {
        this.motor = new Motor();
    }

    @Override
    public void ligar() {
        System.out.println("Tentando ligar o carro...");
        motor.ligar();
        if (motor.isFuncionando()) {
            System.out.println("Carro ligado com sucesso!");
        } else {
            System.out.println("Falha ao ligar o carro.");
        }
    }

    @Override
    public void desligar() {
        System.out.println("Desligando o carro...");
        motor.desligar();
        System.out.println("Carro desligado.");
    }
}

class CarroEsportivo extends Carro {
    @Override
    public void ligar() {
        System.out.println("Ligando o carro esportivo com ronco potente...");
        motor.ligar();
        if (motor.isFuncionando()) {
            System.out.println("Carro esportivo ligado com sucesso!");
        } else {
            System.out.println("Falha ao ligar o carro esportivo.");
        }
    }
}
