package Exercicio1

fun calcularMedia(lista: List<Double>): Double {
    if (lista.isEmpty()) return 0.0
    return lista.sum() / lista.size
}

fun main() {
    val numeros = listOf(10.0, 20.0, 30.0, 40.0, 50.0)
    val media = calcularMedia(numeros)
    println("A média é: $media")
}
