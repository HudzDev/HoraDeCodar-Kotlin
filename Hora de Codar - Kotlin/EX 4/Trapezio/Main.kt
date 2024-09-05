//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    var base_maior: Int
    var base_menor: Int
    var altura: Int

    println("\nDigite a base maior: ")
    base_maior = readln().toInt()

    println("\nDigite a base menor: ")
    base_menor = readln().toInt()

    println("\nDigite a altura: ")
    altura = readln().toInt()

    val resultado = (base_maior + base_menor) * altura / 2

    println("\nO valor do Trapézio é: $resultado.\n")

}