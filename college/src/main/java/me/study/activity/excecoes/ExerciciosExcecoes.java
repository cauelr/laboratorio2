package me.study.activity.excecoes;

public class ExerciciosExcecoes {
    private double temperatura;

    // Exercício 1
    // public void aumentaTemperatura(double tempMais) {
    // try {
    // if (tempMais < 0) {
    // throw new IllegalArgumentException("A temperatura a ser aumentada deve ser
    // positiva.");
    // } else {
    // this.temperatura += tempMais;
    // }
    // System.out.println("Temperatura atual: " + this.temperatura);
    // } catch (IllegalArgumentException e) {
    // System.out.println("Erro: " + e.getMessage());
    // }
    // }

    // public void diminuiTemperatura(double tempMenos) {
    // try {
    // if (tempMenos < 0) {
    // throw new IllegalArgumentException("A temperatura a ser diminuída deve ser
    // positiva.");
    // }
    // System.out.println("Temperatura atual: " + this.temperatura);
    // } catch (IllegalArgumentException e) {
    // System.out.println("Erro: " + e.getMessage());
    // }
    // this.temperatura -= tempMenos;
    // }

    // Exercício 3
    public void aumentaTemperatura(double tempMais) {
        if (tempMais < 0)
            throw new IllegalArgumentException("A temperatura a ser aumentada deve ser positiva.");
        this.temperatura += tempMais;
        System.out.println("Temperatura atual:" + tempMais);
    }

    public void diminuiTemperatura(double tempMenos) {
        if (tempMenos < 0)
            throw new IllegalArgumentException("A temperatura a ser diminuida deve ser positiva.");
        this.temperatura -= tempMenos;
        System.out.println("Temperatura atual: " + tempMenos);
    }
}
