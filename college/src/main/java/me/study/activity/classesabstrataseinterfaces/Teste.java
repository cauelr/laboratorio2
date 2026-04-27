package me.study.activity.classesabstrataseinterfaces;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas contas você deseja criar?");
        int numDeContas = sc.nextInt();
        ContaBancaria[] contas = new ContaBancaria[numDeContas];

        int selecter = 0;
        for (int i = 0; i < numDeContas; i++) {
            System.out.println("Insira a conta que desejas acessar: ");
            System.out.println("1 - Conta Corrente");
            System.out.println("2 - Conta Poupança");
            selecter = sc.nextInt();

            switch (selecter) {
                case 1:
                    contas[i] = new ContaCorrente(001, "senha123", 1200.10);
                    break;
                case 2:
                    contas[i] = new ContaPoupanca(002, "senha321", 500.10);
                    break;
                default:
                    System.err.println("Saindo do programa");
                    break;
            }
        }

        for (ContaBancaria conta : contas) {
            System.out.println(conta);
        }
    }
}
