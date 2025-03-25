package Exercicio4

fun ultimoImpar(numeros: List<Int>): Int? {
    return numeros.lastOrNull { it % 2 != 0 }
}

fun main() {
    val lista = listOf(2, 4, 6, 8, 9, 10, 13)
    val ultimo = ultimoImpar(lista)
    if (ultimo != null) {
        println("O último número ímpar é: $ultimo")
    } else {
        println("Nenhum número ímpar encontrado.")
    }
}
