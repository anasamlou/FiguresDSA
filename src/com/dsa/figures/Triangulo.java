package com.dsa.figures;

public class Triangulo extends Figura{

    private double base, altura;

    // Construtor do circulo
    public Triangulo (double l1, double l2) {
        this.base = l1;
        this.altura = l2;
    }

    // Metodo herdado de figura
    @Override
    public double GetArea() {
        // Tem que fazer a formula para calcular a area do triangulo (so deixei assim pra testar)
        return (this.base*this.altura);
    }


}
