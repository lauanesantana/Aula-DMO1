package src.main.kotlin

fun main () {

    println ("Digite o seu nome: ");
    val nome = readln();

    println ("Digite a sua idade: ");
    /* val idade = readln().toInt(); */
    val idade = readln().toIntOrNull();

    if (idade != null) {
        println("Idade: $idade");
    } else {
        println ("Idade inválida");
    }
    val idade2 = 45
    //semelhante ao switch, siginfica quando
    val resultado = when {
        idade2 >= 18 -> "Acabou de ficar com maioridade penal"
        idade2 >= 65 -> "Terceira idade"
        else -> println("Outra idade");
    }
    println ("Resultado: $resultado");

    /*    val dados = """
            Nome: $nome,
            /*Idade = $idade,*/
            Idade ano que vem: ${idade+1}
        """ .trimIndent()
    */
//    println(dados);
}

