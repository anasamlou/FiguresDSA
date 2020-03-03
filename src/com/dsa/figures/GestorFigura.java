package com.dsa.figures;

import java.util.Arrays;

public class GestorFigura {

    // Funcao para somar todas as areas
    static double sumaAreas(Figura [] fig) {
        double suma = 0;
        for (Figura n: fig) {
            suma += n.GetArea();
        }
        return suma;
    }

    //Sort an array of Figura by its areas
    static void sort(Figura[] fig) {
        Arrays.sort(fig);
    }


}
