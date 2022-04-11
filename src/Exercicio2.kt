// Crie um algoritmo que leia uma idade de uma pessoa e calcule
//quantos dias essa pessoa já viveu
//Um ano = 360 dias. Tem que receber o ano lido e botar numa função que calcule ano*360

fun main() {
println("Quer saber quantos dias você já viveu? Informe sua idade: ")
    val idade = readln().toInt()
    val dias = idade*360

    println("Você tem $idade anos e viveu $dias dias")
}

