package me.study.review;

public class Pessoa {
    private int idade;
    private double altura;
    private boolean vivo;

    Pessoa(int idade, double altura, boolean vivo) {
        this.idade = idade;
        this.altura = altura;
        this.vivo = vivo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Pessoa [idade=" + idade + ", altura=" + altura + ", vivo=" + vivo + "]";
    }
}
