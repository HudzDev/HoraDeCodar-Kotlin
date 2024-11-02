fun main() {

    var contagem = 30

    while (contagem > 1){
        println("\nFaltam $contagem segundos.")
        contagem--

        if (contagem == 1){
            println("\nFalta $contagem segundo.")
        }
    }

    println("\nEXPLOSÃO!")

}