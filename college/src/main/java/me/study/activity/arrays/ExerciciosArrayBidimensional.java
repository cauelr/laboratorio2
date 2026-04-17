package me.study.activity.arrays;

import java.util.Random;
import java.util.Scanner;

public class ExerciciosArrayBidimensional {
    int array[][] = new int[0][0];

    public void exercicio1a() {
        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 10; c++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    // Gabarito do Exercicio 1a:

    // public int[][] exercicio1a() {
    // /*
    // * 0 1 2 3 4 5 6 7 8 9
    // * 0 1 2 3 4 5 6 7 8 9
    // * 0 1 2 3 4 5 6 7 8 9
    // */
    // int[][] array = new int[3][10];
    // for (int i = 0; i < array.length; i++)
    // for (int j = 0; j < array[i].length; j++)
    // array[i][j] = j;

    // return array;
    // }

    public void exercicio1b() {
        for (int l = 0; l < 5; l++) {
            for (int c = 0; c < 10; c++) {
                System.out.print(c * c + " ");
            }
            System.out.println();
        }
    }

    // Gabarito do Exercicio 1b:

    // public int[][] exercicio1b() {
    // /*
    // * 0 1 4 9 16 25 36 49 64 81
    // * 0 1 4 9 16 25 36 49 64 81
    // * 0 1 4 9 16 25 36 49 64 81
    // * 0 1 4 9 16 25 36 49 64 81
    // * 0 1 4 9 16 25 36 49 64 81
    // */
    // int[][] array = new int[5][10];
    // for (int i = 0; i < array.length; i++)
    // for (int j = 0; j < array[i].length; j++)
    // array[i][j] = j * j; // (int) Math.pow(j, 2);
    // return array;
    // }

    public void exercicio1c() {
        for (int l = 0; l < 6; l++) {
            for (int c = 0; c < 6; c++) {
                System.out.print(l + " ");
            }
            System.out.println();
        }
    }

    // Gabarito do Exercicio 1c:

    // public int[][] exercicio1c() {
    // /*
    // * 0 0 0 0 0 0
    // * 1 1 1 1 1 1
    // * 2 2 2 2 2 2
    // * 3 3 3 3 3 3
    // * 4 4 4 4 4 4
    // * 5 5 5 5 5 5
    // */

    // int[][] array = new int[6][6];
    // for (int i = 0; i < array.length; i++)
    // for (int j = 0; j < array[i].length; j++)
    // array[i][j] = i;

    // return array;
    // }

    public void exercicio1d() {
        for (int l = 0; l < 9; l++) {
            for (int c = 0; c < 6; c++) {
                if (l % 2 == 0) {
                    System.out.print("0" + " ");
                } else {
                    System.out.print("-1");
                }
            }
            System.out.println();
        }
    }

    // Gabarito do Exercicio 1d:

    // public int[][] exercicio1d(){
    // /*-1 -1 -1 -1 -1 -1
    // 0 0 0 0 0 0
    // -1 -1 -1 -1 -1 -1
    // 0 0 0 0 0 0
    // -1 -1 -1 -1 -1 -1
    // 0 0 0 0 0 0
    // -1 -1 -1 -1 -1 -1
    // 0 0 0 0 0 0
    // -1 -1 -1 -1 -1 -1*/
    // int[][] array = new int[9][6];
    // for(int i=0; i<array.length; i++)
    // for(int j=0; j<array[i].length; j++)
    // array[i][j] = i % 2 == 0 ? -1 : 0;

    // /*if(i % 2 == 0)
    // array[i][j] = -1;
    // else
    // array[i][j] = 0;*/

    // return array;
    // }

    public void exercicio2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número de linhas da matriz: ");
        int linhas = sc.nextInt();
        System.out.println("Digite o número de colunas da matriz: ");
        int colunas = sc.nextInt();

        int matriz[][] = new int[linhas][colunas];

        System.out.println("Gerando matriz de " + linhas + "x" + colunas + " com números aleatórios entre 0 e 99:");
        for (int l = 0; l < linhas; l++) {
            for (int c = 0; c < colunas; c++) {
                int numRandom = (int) (Math.random() * 100);
                matriz[l][c] = numRandom;
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println();
        }
    }

    // Gabarito do Exercicio 2:

    // public int[][] exercicio2(){
    // Scanner s = new Scanner(System.in);
    // System.out.println("Informe o numero de linhas:");
    // int linhas = Integer.parseInt(s.next());
    // System.out.println("Informe o numero de colunas:");
    // int colunas = Integer.parseInt(s.next());
    // int[][] retorno = new int[linhas][colunas];

    // for(int i=0; i<retorno.length; i++)
    // for(int j=0; j<retorno[i].length; j++)
    // retorno[i][j] = (int)(Math.random()*100);

    // return retorno;
    // }

    public void exercicio3() {
        double matriz[][] = new double[2][5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os valores para a matriz 2x5:");
        for (int l = 0; l < 2; l++) {
            for (int c = 0; c < 5; c++) {
                System.out.print("Elemento [" + l + "][" + c + "]: ");
                matriz[l][c] = sc.nextDouble();
            }
        }

        for (int l = 0; l < 2; l++) {
            for (int c = 0; c < 5; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println();
        }
    }

    // Gabarito do Exercicio 3:

    // public double[][] exercicio3(){
    // Scanner s = new Scanner(System.in);
    // double[][] retorno = new double[2][5];
    // for(int i=0; i<retorno.length; i++)
    // for(int j=0; j<retorno[i].length; i++){
    // System.out.println("Digite o prÃ³ximo valor (double):");
    // retorno[i][j] = Double.parseDouble(s.next());
    // }
    // return retorno;
    // }

    public void exercicio4(double matriz[][]) {
        int quantidadeElementos = matriz.length * matriz[0].length;
        System.out.println("A quantidade de elementos da matriz é: " + quantidadeElementos);
    }

    // Gabarito do Exercicio 4:

    // public int exercicio4_e_5(double[][] array){
    // int quantElementos = 0;

    // for(int i=0; i<array.length; i++)
    // for(int j=0; j<array[i].length; j++)
    // quantElementos++;

    // return quantElementos;
    // }

    public void exercicio6(double matriz[][]) {
        String arrayFormatado[][] = new String[matriz.length][matriz[0].length];
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                arrayFormatado[l][c] = String.valueOf(matriz[l][c]);
                if (!(c == matriz[0].length - 1))
                    arrayFormatado[l][c] = arrayFormatado[l][c].concat(" - ");
                System.out.print(arrayFormatado[l][c]);
            }
            System.out.println();
        }
    }

    // Gabarito do Exercicio 6:

    // public String exercicio6(int[][] array){
    // String retorno = "";
    // for(int i=0; i<array.length; i++)
    // for(int j=0; j<array[i].length; j++)
    // retorno += j == array[i].length-1 ? array[i][j] + "\n" : array[i][j]+" - ";
    // return retorno;
    // }

    public void exercicio7(double matriz[][]) {
        double maiorValor = matriz[0][0];
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                if (matriz[l][c] > maiorValor) {
                    maiorValor = matriz[l][c];
                }
            }
        }
        System.out.println("O maior valor da matriz é: " + maiorValor);
    }

    // Gabarito do Exercicio 7:

    // public double exercicio7(double[][] array){
    // double maior = array[0][0];
    // for(int i=0; i<array.length; i++)
    // for(int j=0; j<array[i].length; j++)
    // if(array[i][j] > maior)
    // maior = array[i][j];
    // return maior;
    // }

    public void exercicio8(int matriz[][]) {
        int soma = 0;
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                soma += matriz[l][c];
            }
        }
        System.out.println("A soma dos elementos da matriz é: " + soma);
    }

    // Gabarito do Exercicio 8:

    // public int exercicio8(int[][] array){
    // int soma = 0;
    // for(int i=0; i<array.length; i++)
    // for(int j=0; j<array[i].length; j++)
    // soma += array[i][j];
    // return soma;
    // }

    public void exercicio9(double matriz[][]) {
        double soma = 0;
        int quantidadeElementos = matriz.length * matriz[0].length;
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                soma += matriz[l][c];
            }
        }
        double media = soma / quantidadeElementos;
        System.out.println("A média dos elementos da matriz é: " + media);
    }

    // Gabarito do Exercicio 9:

    // public double exercicio9(int[][] array){
    // double soma = 0;
    // int quantElementos = 0;
    // for(int i=0; i<array.length; i++)
    // for(int j=0; j<array[i].length; j++){
    // soma += array[i][j];
    // quantElementos++;
    // }
    // return soma/quantElementos;
    // }

    public void exercicio10() {
        Random random = new Random();
        int numeroL = random.nextInt(5) + 1;
        int numeroC = random.nextInt(3) + 1;

        char[][] matriz = new char[numeroL][numeroC];

        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print("Digite um caractere para a posição [" + l + "][" + c + "]: ");
                Scanner sc = new Scanner(System.in);
                String caractere = sc.nextLine();
                matriz[l][c] = caractere.charAt(0);
            }
        }

        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println();
        }
    }

    // Gabarito do Exercicio 10:

    // public char[][] exercicio10(){
    // Scanner s = new Scanner(System.in);

    // int linhas = (int)(Math.random()*5+1);
    // int colunas = (int)(Math.random()*3+1);

    // char[][] retorno = new char[linhas][colunas];

    // for(int i=0; i<retorno.length; i++)
    // for(int j=0; j<retorno[i].length; j++){
    // System.out.println("Digite o prÃ³ximo valor (char):");
    // retorno[i][j] = s.next().charAt(0);
    // }

    // return retorno;
    // }

    public void exercicio11(int matriz[][]) {
        int[] arrayUnidimensional = new int[matriz.length * matriz[0].length];
        int index = 0;
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                arrayUnidimensional[index] = matriz[l][c];
                index++;
            }
        }

        System.out.println("Matriz unidimensional:");
        for (int i = 0; i < arrayUnidimensional.length; i++) {
            System.out.print(arrayUnidimensional[i] + " ");
        }
    }

    // Gabarito do Exercicio 11:

    // public int[] exercicio11(int[][] array){
    // int[] retorno = new int[array.length * array[0].length];
    // int cont = 0;
    // for(int i=0; i<array.length; i++)
    // for(int j=0; j<array[i].length; j++)
    // if(array[i][j] >= 0)
    // retorno[cont++] = array[i][j];
    // return retorno;
    // }
}
