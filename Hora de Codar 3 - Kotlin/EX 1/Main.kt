fun main() {

    var num1: Int
    var num2: Int

    println("\nDigite um número: ")
    num1 = readln().toInt()

    println("\nDigite outro número, ele deve ser maior que 0: ")
    num2 = readln().toInt()

    while (num2 <= 0){
        println("\nO número deve ser maior que 0: ")
        num2 = readln().toInt()
    }

    println("\nO resultado da divisão é: ${num1 / num2}.")

}
