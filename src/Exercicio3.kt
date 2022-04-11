//Crie um algoritmo que receba do usuário um número qualquer e
//verifique se esse é múltiplo de 5

fun main() {
println("Saiba se o número é múltiplo de 5. Digite: ")
    val numero = readln().toInt()
    if(numero % 5 == 0){
        println("O número $numero é multiplo de 5")
    }else{
        println("não é múltiplo de 5")
    }
}