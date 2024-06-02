import kotlin.math.ln1p
import kotlin.system.exitProcess

fun main() {

    println("------------------------- Calculadora -------------------------")
    var n1 = 1
    var n2 = 1
    n1 = getInput("Insira um número: ")
    n2 = getInput("Insira outro número: ")

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

fun getInput(prompt: String): Int {
    return try {
        print(prompt)
        readln().toInt()
    } catch (e: Exception) {
        println("Digite um número válido!")
        exitProcess(0)
    }
}