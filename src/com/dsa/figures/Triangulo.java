package com.dsa.figures;

public class Triangulo extends Figura{

    private double base, altura;

    // Metodos SET
    public void SetBase(double b){
        this.base = b;
    }
    public void SetAltura(double a){
        this.altura = a;
    }

    // Metodos GET
    public double GetBase(){
        return this.base;
    }

    public double GetAltura(){
        return this.altura;
    }

    // Construtor do triangulo
    public Triangulo (double b, double a) {
        this.base = b;
        this.altura = a;
    }

    // Metodo herdado de figura
    @Override
    public double GetArea() {
        // Tem que fazer a formula para calcular a area do triangulo (so deixei assim pra testar)
        return (this.base*this.altura);
    }


}
