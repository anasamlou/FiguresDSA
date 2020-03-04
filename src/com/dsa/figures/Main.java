package com.dsa.figures;

import java.util.ArrayList;

// Classe Main ainda inutil, so para testes
public class Main {

    public static void main(string[] args){

        System.out.println("Hello world!");
        Triangulo tri1 = new Triangulo(3,4);
        Rectangulo rec1 = new Rectangulo(3,4);
        Circulo cir1 = new Circulo(3);
        Cuadrado cua1 = new Cuadrado(3);

        Figura[] fig = new Figura[4];

        fig[0] = tri1;
        fig[1] = rec1;
        fig[2] = cir1;
        fig[3] = cua1;

        System.out.println(fig[0].GetArea());
        System.out.println(fig[1].GetArea());
        System.out.println(fig[2].GetArea());
        System.out.println(fig[3].GetArea());

        // Maneira mais facil
        Figura[] fig2 = {tri1,rec1,cir1,cua1};

        for (Figura n: fig2){
            // Nome simples mais lowercase do nome
            System.out.println("Area del "+n.getClass().getSimpleName().toLowerCase()+" = "+n.GetArea());
        }

        GestorFigura.sort(fig2);

        for (Figura n: fig2){
            // Nome simples mais lowercase do nome
            System.out.println("Area del "+n.getClass().getSimpleName().toLowerCase()+" = "+n.GetArea());

            if(n instanceof Cuadrado ) {
                Cuadrado c = (Cuadrado) n;
                c.SetLado2(2);
            }

        }

        // Teste funcao soma areas
        System.out.println("Soma area = "+GestorFigura.sumaAreas(fig2));



    }

}
