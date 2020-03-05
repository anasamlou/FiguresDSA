package com.dsa.figures;


// Classe Main ainda inutil, so para testes
public class Main {

    public static void main(String[] args){

        System.out.println("Hello world!");
        System.out.println("Sem ordenar:");
        Triangulo tri1 = new Triangulo(3,4);
        Rectangulo rec1 = new Rectangulo(3,4);
        Circulo cir1 = new Circulo(3);
        Cuadrado cua1 = new Cuadrado(3);

        Figura[] fig = new Figura[4];

        fig[0] = tri1;
        fig[1] = rec1;
        fig[2] = cir1;
        fig[3] = cua1;

//        System.out.println(fig[0].GetArea());
//        System.out.println(fig[1].GetArea());
//        System.out.println(fig[2].GetArea());
//        System.out.println(fig[3].GetArea());

        // Maneira mais eficiente de printar
        Figura[] fig2 = {tri1,rec1,cir1,cua1};

        for (Figura n: fig2){
            // Nome simples mais lowercase do nome
            System.out.println("Area del "+n.getClass().getSimpleName().toLowerCase()+" = "+n.GetArea());

        }

        Cuadrado quad = new Cuadrado(15);

        System.out.println("Area del cuadrado "+quad.GetLado());

        GestorFigura.sort(fig2);
        //Printamos da manera ordenada
        System.out.println("Ordenado:");

        for (Figura n: fig2){
            // Nome simples mais lowercase do nome
            System.out.println("Area del "+n.getClass().getSimpleName().toLowerCase()+" = "+n.GetArea());

// No utilizar, pero deberia ser echo asi
//           if(n instanceof Cuadrado ) {
//               Cuadrado c = (Cuadrado) n;
//                c.SetLado2(2);
//           }

        }

        // Teste funcao soma areas
        System.out.println("Soma area = "+GestorFigura.sumaAreas(fig2));



    }

}
