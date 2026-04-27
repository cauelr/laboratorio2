package me.study.activity.classesabstrataseinterfaces;

public class ContaPoupanca extends ContaBancaria {
    private double taxaDeRendimento = 14.2;

    public ContaPoupanca(int numero, String senha, double saldo) {
        super(numero, senha, saldo);
    }

    public ContaPoupanca() {

    }

    public double getTaxaDeRendimento() {
        return taxaDeRendimento;
    }

    public void setTaxaDeRendimento(double taxaDeRendimento) {
        this.taxaDeRendimento = taxaDeRendimento;
    }

    @Override
    public double sacar(double valor) {
        double novoSaldo = getSaldo() - valor;
        setSaldo(novoSaldo);
        return novoSaldo;
    }

    @Override
    public double depositar(double valor) {
        double novoSaldo = getSaldo() + valor;
        setSaldo(novoSaldo);
        return novoSaldo;
    }

    @Override
    public void tirarExtrato() {
        // TODO Auto-generated method stub
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Tipo de Conta: CONTA CORRENTE\n" +
                "Número da Conta: " + getNumero() +
                "\nSenha da Conta: " + getSenha() +
                "\nSaldo da Conta: " + getSaldo() +
                "\nTaxa de Rendimentos: " + this.taxaDeRendimento + "%";
    }
}
