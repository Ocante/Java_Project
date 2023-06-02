package edu.ocante.segundasemana;

public class MinhaClasse {
    public static void main(String[] args) {

        // sobre metodo
        String primeiroNome = "Ocante ";
        String segundoNome = " Antonio";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);

        // sobre metodo

        // System.out.println("Olá time, sejam bem-vindo");
        // int ano = 2021;
        // ano = 2022;
        // final String BR = "Brasil";
        // BR = "Brasil";
        // String BR = " Brasil";
        // double PI = 3.14;
        // int ESTADOS_BRASILEIRO = 27;
        // int ANO_2000 = 2000;
        // Declarar uma variável em Java segue sempre a seguinte estrutura:
        // Estrutura

        // Tipo NomeBemDefinido = Atribuicao (opcional em alguns casos)

        // Exemplo
        // String meuNome = "Ocante";
        // int anoFabricacao = 2022;
        // boolean verdadeia = false;
        // anoFabricacao = 2018;
        // int idade = 23;
        // double altura = 1.62;
        // Dog spike; //observe que aqui a variável spike não tem valor, é normal

    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);

    }
}