package com.dsa.figures;

public class Triangulo extends Figura{

    private double base, altura;

    // Metodos SET
    public void setBase(double b){
        this.base = b;
    }
    public void setAltura(double a){
        this.altura = a;
    }

    // Metodos GET
    public double getBase(){
        return this.base;
    }

    public double getAltura(){
        return this.altura;
    }

    // Construtor do triangulo
    public Triangulo (double b, double a) {
        this.base = b;
        this.altura = a;
    }

    // Metodo herdado de figura
    @Override
    public double getArea() {
        // Tem que fazer a formula para calcular a area do triangulo (so deixei assim pra testar)
        return (this.base*this.altura);
    }


}
