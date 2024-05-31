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
            "/" -> {
                if (n2 == 0) {
                    println("Erro: Divisão por zero não é permitida.")
                } else {
                    println("$n1 / $n2 = ${n1 / n2}")
                }
            }
            else -> throw Exception("Operador INVÁLIDO!")
        }
    } catch (e: Exception) {
        println("Erro: ${e.message}")
    }
}