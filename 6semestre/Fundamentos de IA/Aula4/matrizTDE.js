const QUANTIDADE = 3;
const LARGURA = 5;
const ALTURA = 5;

// Função para criar a Matriz x Altura
function criarMatriz(altura, largura) {
    return Array.from({ length: altura }, () =>
        Array.from({ length: largura }, () => Math.round(Math.random()))
    );
}

// Criando as matrizes
const matrizes = Array.from({ length: QUANTIDADE }, () =>
    criarMatriz(ALTURA, LARGURA)
);

console.log(matrizes);
