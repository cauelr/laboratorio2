package me.study.activity;

public class Exercicios {
    int array[][] = new int[0][0];

    public void exercicio1a() {
        for (int c = 0; c < 3; c++) {
            for (int l = 0; l < 10; l++) {
                System.out.print(l + " ");
            }
            System.out.println();
        }
    }

    public void exercicio1b() {
        for (int c = 0; c < 5; c++) {
            for (int l = 0; l < 10; l++) {
                System.out.print(l * l + " ");
            }
            System.out.println();
        }
    }

    public void exercicio1c() {
        for (int c = 0; c < 6; c++) {
            for (int l = 0; l < 6; l++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    public void exercicio1d() {
        for (int c = 0; c < 6; c++) {
            for (int l = 0; l < 9; l++) {
                System.out.print(-1);
            }
            System.out.println(0);
        }
    }
}
