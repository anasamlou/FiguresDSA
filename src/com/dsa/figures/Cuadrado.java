package com.dsa.figures;

public class Cuadrado extends Rectangulo {

    private double lado;
    // Construtor do cuadrado
    public Cuadrado(double l) {
        super(l,l);
    }

    // Metodo SET
    public void SetLado(double l){
        super.SetLado1(l);
        super.SetLado2(l);
    }

    // Metodo GET
    public double GetLado(){
        return super.GetL1();
    }


    }



