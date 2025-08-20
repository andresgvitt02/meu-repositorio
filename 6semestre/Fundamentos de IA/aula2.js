//Entrada for 0, 0 = 0
//Entrada for 1, 1 = 1

// e1c1 = Entrada 1 do Caso 1
// e2c1 = Entrada 2 do Caso 1
// re1 = Resultado esperado 1

let e1c1 = 0,
  e2c1 = 0,
  re1 = 0;
let e1c2 = 1,
  e2c2 = 1,
  re2 = 1;

let pesos = [-1, -1];

let c = 1;

let ajustes1 = 0,
  repeticoes = 0,
  quantidadeAjustesNecessarios = 0;

function transferencia(soma){
  if (soma <= 0) {
    return 0;
  }
  return 1;
}

function soma(valores){
  resultado = 0;

  valores.forEach((valor) => {
    resultado += valor.entrada * valor.peso;
  });

  return resultado;
}

function ajuste(valores) {
  i = 0;
  valores.forEach((valor) => {
    valores[i].peso =
      valor.peso +
      c * (valor.resultadoDesejado - valor.resultadoObtido) * valor.entrada;
    i++;
  });

  return valores;
}

function minhaFuncaoAbstrata(entradas, pesos, resultadoEsperado){
  let valores = entradas.map((entrada, i) => ({
    entrada: entrada,
    peso: pesos[i],
  }));

  let resultadoSoma = soma(valores);
  let resultadoObtido = transferencia(resultadoSoma);

  if (resultadoObtido !== resultadoEsperado){
    let valoresAjuste = entradas.map((entrada, i) => ({
      entrada: entrada,
      peso: pesos[i],
      resultadoDesejado: resultadoEsperado,
      resultadoObtido: resultadoObtido,
    }));

    let resultado = ajuste(valoresAjuste);

    resultado.forEach((item, i) => {
      pesos[i] = item.peso;
    });

    return {pesos, houveAjuste: true};
  }

  return {pesos, houveAjuste: false};
}

do {
  ajustes = 0;

  // Caso 1
  let resultado1 = minhaFuncaoAbstrata([e1c1, e2c1], pesos, re1);
  pesos = resultado1.pesos;
  if (resultado1.houveAjuste) {
    ajustes++;
    quantidadeAjustesNecessarios++;
  }

  // Caso 2
  let resultado2 = minhaFuncaoAbstrata([e1c2, e2c2], pesos, re2);
  pesos = resultado2.pesos;
  if (resultado2.houveAjuste){
    ajustes++;
    quantidadeAjustesNecessarios++;
  }

  repeticoes++;
} while 
(ajustes != 0);

console.log(
  "Os pesos apos o treinamento da rede é: " + pesos[0] + " e " + pesos[1]
);
console.log(
  "Quantidade de ajustes necessarios: " + quantidadeAjustesNecessarios
);
console.log("Repeticões: " + repeticoes);