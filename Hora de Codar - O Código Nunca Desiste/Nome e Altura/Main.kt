data class Pessoa(
    var nome: String,
    var altura: Double
)

fun main() {
    val pessoas = mutableListOf<Pessoa>()
    var opcao: Int

    do {
        println("\n1. Cadastrar pessoas")
        println("2. Apresentar pessoas com altura menor ou igual a 1.5m")
        println("3. Apresentar pessoas com altura maior que 1.5m")
        println("4. Apresentar pessoas com altura maior que 1.5m e menor que 2.0m")
        println("5. Apresentar média das alturas")
        println("6. Sair")
        print("Escolha uma opção: ")
        opcao = readLine()?.toIntOrNull() ?: 0

        when (opcao) {
            1 -> cadastrarPessoas(pessoas)
            2 -> apresentarBaixas(pessoas)
            3 -> apresentarAltas(pessoas)
            4 -> apresentarAlturaIntermediaria(pessoas)
            5 -> apresentarMediaAlturas(pessoas)
            6 -> println("\nSaindo...")
            else -> println("\nOpção inválida. Tente novamente.")
        }
    } while (opcao != 6)
}

fun cadastrarPessoas(pessoas: MutableList<Pessoa>) {
    if (pessoas.size >= 15) {
        println("\nJá foram cadastradas 15 pessoas.")
        return
    }

    for (i in 1..15) {
        println("\nCadastro $i:")
        print("Nome: ")
        val nome = readLine().orEmpty()
        print("Altura (em metros): ")
        val altura = readLine()?.toDoubleOrNull() ?: 0.0

        pessoas.add(Pessoa(nome, altura))
    }
    println("\nPessoas cadastradas com sucesso.")
}

fun apresentarBaixas(pessoas: List<Pessoa>) {
    println("\nPessoas com altura menor ou igual a 1.5m")
    val baixas = pessoas.filter { it.altura <= 1.5 }
    if (baixas.isNotEmpty()) {
        baixas.forEach { println("Nome: ${it.nome}, Altura: ${it.altura}m") }
    } else {
        println("\nNenhuma pessoa encontrada com altura <= 1.5m.")
    }
}

fun apresentarAltas(pessoas: List<Pessoa>) {
    println("\nPessoas com altura maior que 1.5m")
    val altas = pessoas.filter { it.altura > 1.5 }
    if (altas.isNotEmpty()) {
        altas.forEach { println("Nome: ${it.nome}, Altura: ${it.altura}m") }
    } else {
        println("\nNenhuma pessoa encontrada com altura > 1.5m.")
    }
}

fun apresentarAlturaIntermediaria(pessoas: List<Pessoa>) {
    println("\nPessoas com altura maior que 1.5m e menor que 2.0m")
    val intermediarias = pessoas.filter { it.altura > 1.5 && it.altura < 2.0 }
    if (intermediarias.isNotEmpty()) {
        intermediarias.forEach { println("Nome: ${it.nome}, Altura: ${it.altura}m") }
    } else {
        println("\nNenhuma pessoa encontrada com altura > 1.5m e < 2.0m.")
    }
}

fun apresentarMediaAlturas(pessoas: List<Pessoa>) {
    if (pessoas.isEmpty()) {
        println("\nNenhuma pessoa cadastrada para calcular a média.")
        return
    }
    val media = pessoas.map { it.altura }.average()
    println("\nA média das alturas é: $media m")
}
