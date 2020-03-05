package com.dsa.figures;

public class Rectangulo extends Figura {

    private double lado1, lado2;

    // Construtor do circulo
    public Rectangulo (double l1, double l2) {
        this.lado1 = l1;
        this.lado2 = l2;
    }

    // Metodos SET
    public void SetLado1(double l1){
        this.lado1 = l1;
    }
    public void SetLado2(double l2){
        this.lado2 = l2;
    }

    // Metodos GET
    public double GetL1(){
        return this.lado1;
    }

    public double GetL2(){
        return this.lado2;
    }

    // Metodo GetArea heredado de figura

    // Metodo GetArea herdado de figura
    @Override
    public double GetArea() {
        return (this.lado1*this.lado2);
    }

}
