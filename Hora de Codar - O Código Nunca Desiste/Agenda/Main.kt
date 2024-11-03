data class Contato(
    var nome: String,
    var endereco: String,
    var telefone: String
)

fun main() {
    val agenda = mutableListOf<Contato>()
    var opcao: Int

    do {
        println("\n1. Cadastrar contatos")
        println("2. Pesquisar contato por nome")
        println("3. Classificar contatos por nome")
        println("4. Exibir todos os contatos")
        println("5. Sair")
        print("Escolha uma opção: ")
        opcao = readLine()?.toIntOrNull() ?: 0

        when (opcao) {
            1 -> cadastrarContatos(agenda)
            2 -> pesquisarContato(agenda)
            3 -> ordenarContatos(agenda)
            4 -> exibirContatos(agenda)
            5 -> println("\nSaindo...")
            else -> println("\nOpção inválida. Tente novamente.")
        }
    } while (opcao != 5)
}

fun cadastrarContatos(agenda: MutableList<Contato>) {
    if (agenda.size >= 10) {
        println("\nA agenda já possui 10 contatos cadastrados.")
        return
    }

    for (i in 1..10) {
        println("\nCadastro do contato $i:")
        print("Nome: ")
        val nome = readLine().orEmpty()
        print("Endereço: ")
        val endereco = readLine().orEmpty()
        print("Telefone: ")
        val telefone = readLine().orEmpty()

        agenda.add(Contato(nome, endereco, telefone))
    }
    println("\nContatos cadastrados com sucesso.")
}

fun pesquisarContato(agenda: List<Contato>) {
    print("\nDigite o nome para pesquisa: ")
    val nomePesquisa = readLine().orEmpty()
    val contato = agenda.find { it.nome.equals(nomePesquisa, ignoreCase = true) }

    if (contato != null) {
        println("\nContato encontrado: $contato")
    } else {
        println("\nContato não encontrado.")
    }
}

fun ordenarContatos(agenda: MutableList<Contato>) {
    agenda.sortBy { it.nome }
    println("\nContatos ordenados por nome.")
}

fun exibirContatos(agenda: List<Contato>) {
    if (agenda.isEmpty()) {
        println("\nA agenda está vazia.")
    } else {
        println("\nLista de Contatos")
        agenda.forEach { println(it) }
    }
}
