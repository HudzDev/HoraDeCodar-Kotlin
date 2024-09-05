fun main() {

    val pi = 3.14
    var raio: Int

    println("\nDigite o raio do círculo: ")
    raio = readln().toInt()

    val area = pi * (raio * raio)
    println("\nA área do círculo é: $area")

}