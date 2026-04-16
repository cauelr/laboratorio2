package me.study.activity;

import java.util.Scanner;

public class MainArrayBidimensional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Matrizes Aleatórias para exemplos dos exercícios
        double array[][] = new double[3][3];
        for (int l = 0; l < array.length; l++) {
            for (int c = 0; c < array[l].length; c++) {
                array[l][c] = Math.random() * 20;
            }
        }

        int array2[][] = new int[3][3];
        for (int l = 0; l < array2.length; l++) {
            for (int c = 0; c < array2[l].length; c++) {
                array2[l][c] = (int) (Math.random() * 20);
            }
        }

        System.out.println("Exercícios de Matrizes");
        System.err.println("------------------");
        System.out.println("Exercício 1a:");

        ExerciciosArrayBidimensional e1a = new ExerciciosArrayBidimensional();
        e1a.exercicio1a();

        System.err.println("------------------");
        System.out.println("Exercício 1b:");

        ExerciciosArrayBidimensional e1b = new ExerciciosArrayBidimensional();
        e1b.exercicio1b();

        System.err.println("------------------");
        System.out.println("Exercício 1c:");

        ExerciciosArrayBidimensional e1c = new ExerciciosArrayBidimensional();
        e1c.exercicio1c();

        System.err.println("------------------");
        System.out.println("Exercício 1d:");

        ExerciciosArrayBidimensional e1d = new ExerciciosArrayBidimensional();
        e1d.exercicio1d();

        System.err.println("------------------");
        System.out.println("Exercício 2:");

        ExerciciosArrayBidimensional e2 = new ExerciciosArrayBidimensional();
        e2.exercicio2();

        System.err.println("------------------");
        System.out.println("Exercício 3:");

        ExerciciosArrayBidimensional e3 = new ExerciciosArrayBidimensional();
        e3.exercicio3();

        System.err.println("------------------");
        System.out.println("Exercício 4:");

        ExerciciosArrayBidimensional e4 = new ExerciciosArrayBidimensional();
        e4.exercicio4(array);

        System.out.println("------------------");
        System.out.println("Exercício 6:");
        ExerciciosArrayBidimensional e6 = new ExerciciosArrayBidimensional();
        e6.exercicio6(array);

        System.out.println("------------------");
        System.out.println("Exercício 7:");
        ExerciciosArrayBidimensional e7 = new ExerciciosArrayBidimensional();
        e7.exercicio7(array);

        System.out.println("------------------");
        System.out.println("Exercício 8:");
        ExerciciosArrayBidimensional e8 = new ExerciciosArrayBidimensional();
        e8.exercicio8(array2);

        System.out.println("------------------");
        System.out.println("Exercício 9:");
        ExerciciosArrayBidimensional e9 = new ExerciciosArrayBidimensional();
        e9.exercicio9(array);

        System.out.println("------------------");
        System.out.println("Exercício 10:");
        ExerciciosArrayBidimensional e10 = new ExerciciosArrayBidimensional();
        e10.exercicio10();

        System.out.println("------------------");
        System.out.println("Exercício 11:");
        ExerciciosArrayBidimensional e11 = new ExerciciosArrayBidimensional();
        e11.exercicio11(array2);

    }
}
