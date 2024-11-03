data class Funcionario(
    val matricula: Int,
    var nome: String,
    var salario: Double
)

fun main() {
    val funcionarios = mutableListOf<Funcionario>()
    var opcao: Int

    do {
        println("\n1. Cadastrar 20 funcionários")
        println("2. Pesquisar funcionário pelo número de matrícula")
        println("3. Apresentar funcionários com salário acima de R$ 1.000,00")
        println("4. Apresentar funcionários com salário abaixo de R$ 1.000,00")
        println("5. Apresentar funcionários com salário igual a R$ 1.000,00")
        println("6. Sair")
        print("Escolha uma opção: ")
        opcao = readLine()?.toIntOrNull() ?: 0

        when (opcao) {
            1 -> cadastrarFuncionarios(funcionarios)
            2 -> pesquisarFuncionario(funcionarios)
            3 -> apresentarSalarioAcima(funcionarios)
            4 -> apresentarSalarioAbaixo(funcionarios)
            5 -> apresentarSalarioIgual(funcionarios)
            6 -> println("\nSaindo...")
            else -> println("\nOpção inválida. Tente novamente.")
        }
    } while (opcao != 6)
}

fun cadastrarFuncionarios(funcionarios: MutableList<Funcionario>) {
    if (funcionarios.size >= 20) {
        println("\nJá foram cadastrados 20 funcionários.")
        return
    }

    for (i in 1..20) {
        println("\nCadastro $i:")
        print("Matrícula: ")
        val matricula = readLine()?.toIntOrNull() ?: 0
        print("Nome: ")
        val nome = readLine().orEmpty()
        print("Salário: ")
        val salario = readLine()?.toDoubleOrNull() ?: 0.0

        funcionarios.add(Funcionario(matricula, nome, salario))
    }
    funcionarios.sortBy { it.matricula }
    println("\nFuncionários cadastrados com sucesso.")
}

fun pesquisarFuncionario(funcionarios: List<Funcionario>) {
    print("\nDigite o número da matrícula para pesquisa: ")
    val matricula = readLine()?.toIntOrNull() ?: return println("\nMatrícula inválida.")

    val funcionario = funcionarios.find { it.matricula == matricula }
    if (funcionario != null) {
        println("\nFuncionário encontrado: Nome: ${funcionario.nome}, Salário: R$ ${funcionario.salario}")
    } else {
        println("\nFuncionário com matrícula $matricula não encontrado.")
    }
}

fun apresentarSalarioAcima(funcionarios: List<Funcionario>) {
    println("\nFuncionários com salário acima de R$ 1.000,00")
    val acimaDeMil = funcionarios.filter { it.salario > 1000 }.sortedBy { it.matricula }
    if (acimaDeMil.isNotEmpty()) {
        acimaDeMil.forEach { println("\nMatrícula: ${it.matricula}, Nome: ${it.nome}, Salário: R$ ${it.salario}") }
    } else {
        println("\nNenhum funcionário encontrado com salário acima de R$ 1.000,00.")
    }
}

fun apresentarSalarioAbaixo(funcionarios: List<Funcionario>) {
    println("\nFuncionários com salário abaixo de R$ 1.000,00")
    val abaixoDeMil = funcionarios.filter { it.salario < 1000 }.sortedBy { it.matricula }
    if (abaixoDeMil.isNotEmpty()) {
        abaixoDeMil.forEach { println("\nMatrícula: ${it.matricula}, Nome: ${it.nome}, Salário: R$ ${it.salario}") }
    } else {
        println("\nNenhum funcionário encontrado com salário abaixo de R$ 1.000,00.")
    }
}

fun apresentarSalarioIgual(funcionarios: List<Funcionario>) {
    println("\nFuncionários com salário igual a R$ 1.000,00")
    val igualAMil = funcionarios.filter { it.salario == 1000.0 }.sortedBy { it.matricula }
    if (igualAMil.isNotEmpty()) {
        igualAMil.forEach { println("\nMatrícula: ${it.matricula}, Nome: ${it.nome}, Salário: R$ ${it.salario}") }
    } else {
        println("\nNenhum funcionário encontrado com salário igual a R$ 1.000,00.")
    }
}
