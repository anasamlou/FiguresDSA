package com.dsa.figures;

public class Rectangulo extends Figura {
    // Nao tem necessidade de ser double
    private float lado1, lado2;

    // Construtor do circulo
    public Rectangulo (float l1, float l2) {

        this.lado1 = l1;
        this.lado2 = l2;
    }

    // Metodo herdado de figura
    @Override
    public float area() {
        return (this.lado1*this.lado2);
    }

}
