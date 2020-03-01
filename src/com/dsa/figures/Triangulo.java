package com.dsa.figures;

public class Triangulo extends Figura{

    private float base, altura;

    // Construtor do circulo
    public Triangulo (float l1, float l2) {
        this.base = l1;
        this.altura = l2;
    }

    // Metodo herdado de figura
    @Override
    public float area() {
        // Tem que fazer a formula para calcular a area do triangulo (so deixei assim pra testar)
        return (this.base*this.altura);
    }


}
