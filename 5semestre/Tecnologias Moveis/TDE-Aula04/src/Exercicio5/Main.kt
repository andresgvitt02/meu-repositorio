package Exercicio5

fun converterParaMaiusculas(strings: List<String>): List<String> {
    return strings.map { it.uppercase() }
}

fun main() {
    val lista = listOf("kotlin", "é", "incrível", "não?", "sim!")
    val listaMaiuscula = converterParaMaiusculas(lista)
    println("Lista em maiúsculas: $listaMaiuscula")
}
