package src.main.kotlin

fun main () {

    /* 1. Peça ao usuário para digitar um número inteiro e informe se ele é par ou ímpar, utilizando
o if como expressão. */
    println("Digite um número inteiro e eu te informarei se ele é par ou ímpar");

    val num = readLine()?.toIntOrNull() ?: 0;

    if (num != null) {
        if (num % 2 == 0) {
            println("O numero é par!!!!!");
        } else {
            println("O numero é impar!!!");
        }
    }

    /* Escreva um programa que leia três números inteiros e indique qual o menor valor dentre eles.*/

    println("Agora vamos fazer a leitura de três números inteiros e indicar o menor valor entre eles...")
    println("Digite o primeiro número: ");
    var num1 = readLine()?.toIntOrNull() ?: 0;

    println("Digite o segundo número: ");
    var num2 = readLine()?.toIntOrNull() ?: 0;

    println("Digite o terceiro número: ");
    var num3 = readLine()?.toIntOrNull() ?: 0;

    var menorNum: Int? = null;
    if (num1 >= num2) {
        menorNum = num2;
        if (menorNum >= num3) {
            menorNum = num3;
        }
    }
    println("O menor número é ${menorNum}");

    /* Peça dois números e uma operação (+, -, *, /). Mostre o resultado da operação escolhida.
Se a operação for inválida, exiba uma mensagem de erro. */

}
