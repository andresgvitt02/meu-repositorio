const AUTOMOBILISMO = 1;
const FUTEBOL = 0;

let treinamento = [
    {
        entrada1: 0,
        entrada2: 0,
        resultadoEsperado: 0
    },
    {
        entrada1: 1,
        entrada2: 0,
        resultadoEsperado: 0
    },
    {
        entrada1: 1,
        entrada2: 1,
        resultadoEsperado: 1
    },
]

let w1 = -1, w2 = -1

let sum, y, ajustes, ajustesTotais = 0;

function soma(entrada1, entrada2){
    return (entrada1 * w1) + (entrada2 * w2);
}
function transferencia(resulradoSoma){
    if (resulradoSoma < 0){
        return 0
    }else if (resulradoSoma >= 0 && resulradoSoma <= 1){
        return resulradoSoma;
    }
    return 1;
}

function ajuste(entrada1, entrada2, resultadoDesejado, resultadoObtido){
    w1 = w1 + 1 * (resultadoDesejado - resultadoObtido) * entrada1
    w2 = w2 + 1 * (resultadoDesejado - resultadoObtido) * entrada2
}

do {
    ajustes = 0;

    treinamento.forEach(valor => {
        sum = soma(valor.entrada1, valor.entrada2)
        y = transferencia(sum)
        if (y != valor.resultadoEsperado){
            ajuste(valor.entrada1, valor.entrada2, valor.resultadoEsperado, y)
            ajustes++
            ajustesTotais++;
        }
    });
    

}while(ajustes != 0)

console.log("Os pesos finais ficaram w1:" + w1 + " e w2: " + w2)
console.log("A quantidade de ajsutes foi:" + ajustesTotais)

console.log(treinamento);