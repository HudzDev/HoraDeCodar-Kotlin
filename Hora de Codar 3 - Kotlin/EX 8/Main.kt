fun main() {
    var num1: Int
    var num2 = 1

    print("\nDigite um número maior que 0: ")
    num1 = readLine()?.toIntOrNull() ?: 0

    while (num1 <= 0) {
        println("\nTente novamente, o número deve ser maior que 0: ")
        num1 = readLine()?.toIntOrNull() ?: 0
    }

    while (num1 >= num2) {
        print("$num2 ")
        num2 += 1
    }
}
