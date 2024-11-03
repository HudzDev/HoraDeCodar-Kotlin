data class Aluno(
    var nome: String,
    var notas: List<Double>
) {
    fun calcularMedia(): Double {
        return notas.average()
    }

    fun situacao(): String {
        return if (calcularMedia() >= 5) "Aprovado!" else "Reprovado!"
    }
}

fun main() {
    val turma = mutableListOf<Aluno>()
    var opcao: Int

    do {
        println("\n1. Cadastrar 20 alunos")
        println("2. Pesquisar aluno por nome")
        println("3. Exibir todos os registros")
        println("4. Sair")
        print("Escolha uma opção: ")
        opcao = readLine()?.toIntOrNull() ?: 0

        when (opcao) {
            1 -> cadastrarAlunos(turma)
            2 -> pesquisarAluno(turma)
            3 -> exibirRegistros(turma)
            4 -> println("\nSaindo...")
            else -> println("\nOpção inválida. Tente novamente.")
        }
    } while (opcao != 4)
}

fun cadastrarAlunos(turma: MutableList<Aluno>) {
    if (turma.size >= 20) {
        println("\nA turma já possui 20 alunos cadastrados.")
        return
    }

    for (i in 1..20) {
        println("\nCadastro do aluno $i:")
        print("Nome: ")
        val nome = readLine().orEmpty()

        val notas = mutableListOf<Double>()
        for (j in 1..4) {
            print("Nota do bimestre $j: ")
            val nota = readLine()?.toDoubleOrNull() ?: 0.0
            notas.add(nota)
        }

        turma.add(Aluno(nome, notas))
    }

    turma.sortBy { it.nome } // Classificar por nome
    println("\nAlunos cadastrados com sucesso e classificados por nome.")
}

fun pesquisarAluno(turma: List<Aluno>) {
    print("\nDigite o nome do aluno para pesquisa: ")
    val nomePesquisa = readLine().orEmpty()
    val aluno = turma.find { it.nome.equals(nomePesquisa, ignoreCase = true) }

    if (aluno != null) {
        val media = aluno.calcularMedia()
        println("\nAluno encontrado: ${aluno.nome}, Média: ${media}, Situação: ${aluno.situacao()}")
    } else {
        println("\nAluno não encontrado.")
    }
}

fun exibirRegistros(turma: List<Aluno>) {
    if (turma.isEmpty()) {
        println("\nA turma está vazia.")
    } else {
        println("\nLista de Alunos")
        turma.forEach {
            val media = it.calcularMedia()
            println("\n${it.nome}, Média: $media, Situação: ${it.situacao()}")
        }
    }
}
