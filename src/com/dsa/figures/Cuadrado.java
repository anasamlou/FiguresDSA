package com.dsa.figures;

public class Cuadrado extends Rectangulo {

    private double lado;
    // Construtor do cuadrado
    public Cuadrado(double l) {
        super(l,l);
    }

    // Metodo SET
    public void setLado(double l){
        super.setLado1(l);
        super.setLado2(l);
    }

    // Metodo GET
    public double getLado(){
        return super.getL1();
    }


    }



