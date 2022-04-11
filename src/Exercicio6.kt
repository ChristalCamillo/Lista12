fun main() {
    println("Informe um numero para saber se ele é positivo ou negativo: ")
    val numero = readln().toInt()
    if (numero >= 0) {
        println("O numero $numero é positivo")
    } else {
        println("O numero $numero é negativo")
    }
}