package me.study.activity.classesabstrataseinterfaces;

public class ContaCorrente extends ContaBancaria {
    private int qntdTransacoes;

    public ContaCorrente(int qntdTransacoes, String senha, int numero, int saldo) {
        super(senha, numero, saldo);
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
        // TODO Auto-generated method stub

    }

    public int getQntdTransacoes() {
        return qntdTransacoes;
    }

    public void setQntdTransacoes(int qntdTransacoes) {
        this.qntdTransacoes = qntdTransacoes;
    }
}
