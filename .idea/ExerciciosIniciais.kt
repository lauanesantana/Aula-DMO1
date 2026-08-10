fun main () {

    println("Hello World!!!!!!!!");
    //var num1 = 12;
    //val num2: Int = num1;
    //num1 = 55;

    //println(num1);
    //println(num2);

    // ----------------------
    //  Leitura de dados
    //println("Digite a sua idade: ");
    //var idade = readln()?.toIntOrNull() ?: 0;

    //if (idade != null) {
    //       println("No ano que vem sua idade será: ${idade + 1}");
    //} else {
    //     println("Idade digitada de forma incorreta: ${idade}");
    //}
// ------------------------------------------------------------------------------------
//1. Leia uma palavra do usuário e exiba-a em maiúsculas e em minúsculas.
//Entrada: Kotlin → Saída: Maiúsculas: KOTLIN | Minúsculas: kotlin
//Dica: lembre-se quetodo valor é um objeto. Veja os métodos para esta conversão na classe String

    println("Exercicio 1 da Lista: Digite uma palavra");
    val palavra = readln();


    println ("A palavra digitada foi...:" + palavra);
    println ("A palavra digitada em minuscula foi...: " + palavra.lowercase());
    println ("A palavra digitada em maiuscula foi...: " + palavra.uppercase());

// ------------------------------------------------------------------------------------
//2. Peça dois números inteiros e mostre a soma deles.
//Entrada: 3 e 7 → Saída: A soma é 10.

    println("Exercicio 2 da Lista: Soma de números");

    println("Digite o primeiro numero");
    var num1 = readln()?.toIntOrNull() ?: 0;

    println("Digite o segundo numero");
    var num2 = readln()?.toIntOrNull() ?: 0;

    num1 += num2;

    println("A soma dos dois números digitados foi...:  ${num1}");

// ------------------------------------------------------------------------------------
//3. Leia um número inteiro e mostre se ele é par ou ímpar. Trate entradas inválidas usando toIntOrNull().


    if (num1 != null) {
        if (num1 % 2 == 0) {
            println("O numero é par!!!!!");
        } else {
            println("O numero é impar!!!");
        }
    }

//------------------------------------------------------------------------------------
//4. Solicite três notas (decimais) e calcule a média. Exiba se o aluno está aprovado (média ≥
//6), recuperação (média entre 4 e 5.9) ou reprovado (média < 4)

    println ("Vamos calcular a sua media?...");
    println ("Digite a primeira nota em decimal");
    var nota1 = readln()?.toIntOrNull() ?: 0;

    println ("Digite a segunda nota em decimal");
    var nota2 = readln()?.toIntOrNull() ?: 0;

    println ("Digite a terceira nota em decimal");
    var nota3 = readln()?.toIntOrNull() ?: 0;

    var mediaAluno = (nota1 + nota2 + nota3)/3;

    println ("Sua media foi... ${mediaAluno}");

    if (mediaAluno >= 6.00) {
        println ("Parabeeeensssss!! Voce foi aprovado!");
    } else if (mediaAluno > 4 && mediaAluno < 5.9){
        println ("Calma... voce esta em recuperação!");
    } else if (mediaAluno < 4) {
        println ("Voce foi reprovado...");
    }
}