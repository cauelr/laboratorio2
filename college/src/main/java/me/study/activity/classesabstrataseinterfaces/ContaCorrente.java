package me.study.activity.classesabstrataseinterfaces;

public class ContaCorrente extends ContaBancaria {
    private int qntdTransacoes;

    public ContaCorrente(int numero, String senha, double saldo) {
        super(numero, senha, saldo);
    }

    public ContaCorrente() {

    }

    public int getQntdTransacoes() {
        return qntdTransacoes;
    }

    public void setQntdTransacoes(int qntdTransacoes) {
        this.qntdTransacoes = qntdTransacoes;
    }

    @Override
    public double sacar(double valor) {
        ++qntdTransacoes;
        double novoSaldo = getSaldo() - valor;
        setSaldo(novoSaldo);
        return novoSaldo;
    }

    @Override
    public double depositar(double valor) {
        ++qntdTransacoes;
        double novoSaldo = getSaldo() + valor;
        setSaldo(novoSaldo);
        return novoSaldo;
    }

    @Override
    public void tirarExtrato() {
        String[] extrato = new String[this.qntdTransacoes];

    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Tipo de Conta: CONTA CORRENTE\n" +
                "Número da Conta: " + getNumero() +
                "\nSenha da Conta: " + getSenha() +
                "\nSaldo da Conta: " + getSaldo();
    }

}
