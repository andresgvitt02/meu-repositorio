import java.util.ArrayList;

//Override significa que está subescrevendo aquele método
public class CalculadoraBasica extends Calculadora{
    @Override
    void calcular(Operador operador, ArrayList<Double> lista) {
        double resultadoDaOperacao = operador.calcular(lista);
        setResultado(resultadoDaOperacao);

    }
}
