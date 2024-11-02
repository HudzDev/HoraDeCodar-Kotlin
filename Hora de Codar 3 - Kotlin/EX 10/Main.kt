fun main() {
    print("\nDigite um número para ver a tabuada: ")
    val num1 = readLine()?.toIntOrNull() ?: 0

    var num2 = 1

    while (num2 <= 10) {
        println("\n$num1 x $num2 = ${num1 * num2}")
        num2 += 1
    }
}
