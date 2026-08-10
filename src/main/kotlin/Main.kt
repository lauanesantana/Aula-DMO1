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