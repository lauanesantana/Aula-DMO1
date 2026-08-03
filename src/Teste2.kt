fun main () {

        println ("Hello World!!!!!!!!");
        var num1 = 12;
        val num2: Int = num1;
        num1 = 55;

        println (num1);
        println (num2);

        // ----------------------
        //  Leitura de dados
        println ("Digite a sua idade: ");
        var idade = readln().toIntOrNull();

        println ("No ano que vem sua idade será: $idade");

}
