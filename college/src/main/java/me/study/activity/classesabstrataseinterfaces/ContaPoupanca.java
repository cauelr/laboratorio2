package me.study.activity.classesabstrataseinterfaces;

public class ContaPoupanca extends ContaBancaria {
    private double taxaDeRendimento;

    public ContaPoupanca(double taxaDeRendimento, String senha, int numero, double saldo) {
        super(senha, numero, saldo);
        this.taxaDeRendimento = taxaDeRendimento;
    }

    @Override
    public double sacar(double valor) {
        // TODO Auto-generated method stub
        return getSaldo() - valor;
    }

    @Override
    public double depositar(double valor) {
        // TODO Auto-generated method stub
        return getSaldo() + valor;
    }

    @Override
    public void tirarExtrato() {
        // TODO Auto-generated method stub

    }

    public double getTaxaDeRendimento() {
        return taxaDeRendimento;
    }

    public void setTaxaDeRendimento(double taxaDeRendimento) {
        this.taxaDeRendimento = taxaDeRendimento;
    }
}
