fun main() {

    val planetas = arrayOf("Terra", "Marte", "Plutão", "Vênus", "Júpiter", "Saturno")

    println("\nDigite o nome de um planeta:")
    val planetaUsuario = readLine() ?: ""

    if (planetas.contains(planetaUsuario.capitalize())) {
        println("\nO planeta $planetaUsuario está na lista!")
    } else {
        println("\nO planeta $planetaUsuario não está na lista.")
    }
}