fun main() {

    println("------------------------- Calculadora -------------------------")
    print("Insira um número: ")
    val n1 = readln().toInt()
    print("Escolha outro número: ")
    val n2 = readln().toInt()

    println("""Escolha uma das seguintes operações
        |+ adição
        |- subtração
        |* multiplicação
        |/ divisão
    """.trimMargin())
    print("> ")
    var op = readln()

    println()

    try {
        when (op) {
            "+" -> println("$n1 + $n2 = ${n1 + n2}")
            "-" -> println("$n1 - $n2 = ${n1 - n2}")
            "*" -> println("$n1 * $n2 = ${n1 * n2}")
            "/" -> println("$n1 / $n2 = ${n1 / n2}")
            else -> throw Exception("Operação inválida!")
        }
    } catch (_: Exception) {
        println("Escolha uma operação válida.")
    }
}