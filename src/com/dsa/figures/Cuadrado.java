package com.dsa.figures;

public class Cuadrado extends Rectangulo {

    // Metodo SET
    public void SetLado(double l){
        super.SetLado1(l);
        super.SetLado2(l);
    }

    // Metodo GET
    public double GetLado(){
        return super.GetL1();
    }

    public Cuadrado(double l) {

        super(l,l);
    }

}
