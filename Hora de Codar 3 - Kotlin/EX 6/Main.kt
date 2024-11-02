fun main() {
    var aprovados = 0
    var resposta = "Sim"

    while (resposta == "Sim") {
        println("\nDigite a primeira nota: ")
        val nota1 = readLine()?.toDoubleOrNull() ?: 0.0

        println("\nDigite a segunda nota: ")
        val nota2 = readLine()?.toDoubleOrNull() ?: 0.0

        val media = (nota1 + nota2) / 2

        println("\nA média desse aluno é: $media")

        if (media >= 9.5) {
            println("\nAluno aprovado!")
            aprovados = aprovados + 1
        } else {
            println("\nAluno reprovado!")
        }

        println("\nDeseja calcular a média de mais um aluno? (Sim/Não): ")
        resposta = readLine() ?: "Não"
    }

    println("\nQuantidade de alunos aprovados: $aprovados.")
}
