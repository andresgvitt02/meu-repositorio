package Exercicio6

// Definindo uma função de extensão para a classe String
fun String.maiuscula(): String {
    return this.uppercase()
}

fun main() {
    val texto = "dale grêmio!"
    println(texto.maiuscula())  // Saída: KOTLIN É DEMAIS!
}
