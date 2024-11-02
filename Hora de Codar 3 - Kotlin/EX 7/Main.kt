fun main() {
    var nota1: Int
    var nota2: Int
    var nota3: Int
    var nota4: Int
    var nota5: Int
    var nota6: Int
    val denominador = 6

    println("\nDigite a nota da primeira avaliação: ")
    nota1 = readLine()?.toIntOrNull() ?: 0
    while (nota1 < 0 || nota1 > 10) {
        println("\nA nota deve ser de 0 a 10, tente novamente: ")
        nota1 = readLine()?.toIntOrNull() ?: 0
    }

    println("\nDigite a nota da segunda avaliação: ")
    nota2 = readLine()?.toIntOrNull() ?: 0
    while (nota2 < 0 || nota2 > 10) {
        println("\nA nota deve ser de 0 a 10, tente novamente: ")
        nota2 = readLine()?.toIntOrNull() ?: 0
    }

    println("\nDigite a nota da terceira avaliação: ")
    nota3 = readLine()?.toIntOrNull() ?: 0
    while (nota3 < 0 || nota3 > 10) {
        println("\nA nota deve ser de 0 a 10, tente novamente: ")
        nota3 = readLine()?.toIntOrNull() ?: 0
    }

    println("\nDigite a nota da quarta avaliação: ")
    nota4 = readLine()?.toIntOrNull() ?: 0
    while (nota4 < 0 || nota4 > 10) {
        println("\nA nota deve ser de 0 a 10, tente novamente: ")
        nota4 = readLine()?.toIntOrNull() ?: 0
    }

    println("\nDigite a nota da quinta avaliação: ")
    nota5 = readLine()?.toIntOrNull() ?: 0
    while (nota5 < 0 || nota5 > 10) {
        println("\nA nota deve ser de 0 a 10, tente novamente: ")
        nota5 = readLine()?.toIntOrNull() ?: 0
    }

    println("\nDigite a nota da sexta avaliação: ")
    nota6 = readLine()?.toIntOrNull() ?: 0
    while (nota6 < 0 || nota6 > 10) {
        println("A nota deve ser de 0 a 10, tente novamente: ")
        nota6 = readLine()?.toIntOrNull() ?: 0
    }

    val soma = nota1 + nota2 + nota3 + nota4 + nota5 + nota6
    val media = soma / denominador

    println("\nA média desse aluno é: $media")
}
