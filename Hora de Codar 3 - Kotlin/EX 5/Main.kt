fun main() {

    var num1: Int
    var num2: Int
    var soma = 0
    var contagem = 0
    var media: Double

    println("\nDigite um número: ")
    num1 = readln().toInt()

    println("\nDigite outro número, maior que o primeiro: ")
    num2 = readln().toInt()

    while (num2 <= num1) {
        println("\nO número deve ser maior que o primeiro, tente outro: ")
        num2 = readln().toInt()
    }

    while (num1 < num2) {
        soma += num1
        contagem += 1
        num1 += 1
    }

    media = soma.toDouble() / contagem.toDouble()

    println("\nA média dos números é: $media")

}