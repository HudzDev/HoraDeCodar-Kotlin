fun main() {
    var fora = 0
    var dentro = 0
    var num1 = 1

    while (num1 <= 10) {
    print("\nDigite o $num1 º valor: ")
        val num2 = readLine()?.toIntOrNull() ?: 0

        if (num2 in 24..42) {
            dentro += 1
        } else {
            fora += 1
        }

        num1 += 1
    }

    println("\nOs números entre 24 e 42 são: $dentro")
    println("\nJá os números fora de 24 e 42 são: $fora")
}
