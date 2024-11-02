fun main() {

    var num = 15
    var soma = 0
    var quantidade = 0
    val media: Double

    while (num <= 100){
        soma = soma + num
        quantidade = quantidade + 1
        num = num + 1
    }

    media = soma.toDouble() / quantidade.toDouble()

    println("\nA média dos números de 15 a 100 é: $media")

}