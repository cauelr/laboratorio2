package me.study.activity.classesabstrataseinterfaces;

import java.util.Scanner;

abstract class ContaBancaria {
    private String senha;
    private int numero;
    private double saldo;

    public ContaBancaria(int numero, String senha, double saldo) {
        this.numero = numero;
        this.senha = senha;
        this.saldo = saldo;
    }

    public ContaBancaria(String senha) {
        this.senha = senha;
    }

    public ContaBancaria() {

    }

    public abstract double sacar(double valor);

    public abstract double depositar(double valor);

    public abstract void tirarExtrato();

    public String alterarSenha(String senha) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a senha anterior para alterar a senha");
        String senhaAnterior = sc.next();

        if (senhaAnterior.equals(this.senha)) {
            return this.senha = senha;
        } else {
            return "Senha anterior inválida";
        }
    }

    public String getSenha() {
        return senha;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
