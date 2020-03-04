package com.dsa.figures;

public class Cuadrado extends Rectangulo {
<<<<<<< HEAD

    // Construtor do circulo
    public Cuadrado (double l) {
        // Metodo super passa valores para o contrutor da classe pai
=======

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

>>>>>>> 87498e3aed5b1a252b9af8db649f82525c666b19
        super(l,l);
    }

}
