package com.dsa.figures;

public class Circulo extends Figura {

    private double raio;

    // Construtor do circulo
    public Circulo (double r) {
        this.raio = r;
    }

    // Metodo SET
    public void setRaio(double r){
        this.raio = r;
    }

    // Metodo GET
    public double getRaio(){
        return this.raio;
    }

    // Metodo herdado de figura
    @Override
    public double getArea() {
        // Nao tem necessidade de ser double
        return (float) (Math.PI * Math.pow(this.raio, 2));
    }


}
