fun main() {

    val frutas = mutableListOf("Uva", "Banana", "Laranja", "Maracujá", "Manga", "Abacaxi")

    while (frutas.isNotEmpty()) {

        println("\nLista de frutas: $frutas")

        println("\nDigite a fruta já separada: ")
        val frutaUsuario = readLine() ?: ""

        if (frutas.contains(frutaUsuario.capitalize())) {
            frutas.remove(frutaUsuario.capitalize())
            println("Fruta separada com sucesso.")
        } else {
            println("Fruta não encontrada na lista.")
        }
    }

    println("\nCompras finalizada.")

}
