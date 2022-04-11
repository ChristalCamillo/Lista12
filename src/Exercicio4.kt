// Crie um algoritmo que, dada uma temperatura em graus célsius,
//exiba uma mensagem informando o tipo do clima, de acordo com as
//seguintes condições:
//a. se a temperatura estiver até 18 graus, o clima é frio;
//b. se a temperatura estiver entre 19 e 23 graus, o clima é
//agradável;
//c. se a temperatura estiver entre 24 e 35 graus, o clima é quente;
//d. se a temperatura estiver acima de 35 graus, o clima é muito
//quente

fun main() {
println("Digite uma temperatura (apenas números inteiros) para saber o clima: ")
    val temperatura = readln().toInt()
    if( temperatura <= 18) {
        println("clima frio")
    }
    else if(temperatura >= 19 && temperatura <= 23){
        println("clima agradável")
    }
    else if(temperatura >= 24 && temperatura <= 35){
        println("clima quente")
    }
        else if(temperatura > 35){
            println("clima muito quente")
        }

        else{
            println("erro de imput. Informe um numero inteiro")
        }
}