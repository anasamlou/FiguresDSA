package com.dsa.figures;

public class Circulo extends Figura {

    private float raio;

    // Construtor do circulo
    public Circulo (float r) {
        this.raio = r;
    }

    // Metodo herdado de figura
    @Override
    public float area() {
        // Nao tem necessidade de ser double
        return (float) (Math.PI * Math.pow(this.raio, 2));
    }


}
