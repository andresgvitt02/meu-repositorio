package Exercicio7

// Função de extensão para String
fun String.comRS(): String {
    return "R$ $this"
}

fun main() {
    val preco = "49.99"
    println(preco.comRS())  // Saída: R$ 49.99

    val salario = "2500"
    println(salario.comRS()) // Saída: R$ 2500
}
