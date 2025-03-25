package Exercicio3

fun removerDuplicados(numeros: List<Int>): List<Int> {
    return numeros.toSet().toList()
}

fun main() {
    val lista = listOf(1, 2, 2, 3, 4, 4, 5, 5, 6)
    val semDuplicatas = removerDuplicados(lista)
    println("Lista sem duplicatas: $semDuplicatas")
}
