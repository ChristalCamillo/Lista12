// Escreva um algoritmo para ler as dimensões de um retângulo (base
//e altura), calcular e escrever a área do retângulo

fun main() {
    println("Vamos calcular a area de um retangulo, informe a seguir")
    println("altura: ")
    val altura = readln().toInt()
    println("largura: ")
    val largura = readln().toInt()
    val area = altura*largura
    println("A area do retangulo é de $area")
}