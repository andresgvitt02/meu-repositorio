package Exercicio2

fun filtrarPares(numeros: List<Int>): List<Int> {
    return numeros.filter { it % 2 == 0 }
}

fun main() {
    val lista = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val pares = filtrarPares(lista)
    println("Números pares: $pares")
}
