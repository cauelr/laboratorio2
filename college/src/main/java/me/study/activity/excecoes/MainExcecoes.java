package me.study.activity.excecoes;

public class MainExcecoes {
    public static void main(String[] args) {
        ExerciciosExcecoes exerciciosExcecoes = new ExerciciosExcecoes();

        // Exercício 2:
        // System.out.println("Exercício 1a:");
        // exerciciosExcecoes.aumentaTemperatura(10);
        // System.out.println("Exercício 1b:");
        // exerciciosExcecoes.aumentaTemperatura(-5);

        // System.out.println("Exercício 1c:");
        // exerciciosExcecoes.diminuiTemperatura(5);
        // System.out.println("Exercício 1d:");
        // exerciciosExcecoes.diminuiTemperatura(-5);

        // Exercício 4
        try {
            System.out.println("Teste 1");
            exerciciosExcecoes.aumentaTemperatura(10);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println("Teste 2");
            exerciciosExcecoes.aumentaTemperatura(-5);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println("Teste 3");
            exerciciosExcecoes.diminuiTemperatura(10);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println("Teste 4");
            exerciciosExcecoes.diminuiTemperatura(-5);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
