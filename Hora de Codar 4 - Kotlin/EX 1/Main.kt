fun main() {

    val listaDeEstudantes = mutableListOf<String>()

    while (true){
        println("\nDigite o nome dos estudantes (quando finalizar digite 'PARE'): ")
        val nome = readLine() ?: ""

        if (nome.uppercase() == "PARE") break

        listaDeEstudantes.add(nome)
    }

    println("\nQuantidade de estudantes cadastrados: ${listaDeEstudantes.size}")
    println("\nLista de estudantes: $listaDeEstudantes")
}
