fun main() {

    println("digite o val de x: ")
    var x = readln().toInt()
    println("digite o valor de y: ")
    var y = readln().toInt()
    x = x + y
    y = x - y
    x = x - y
    println("os novos valores de x e y são $x e $y")
}