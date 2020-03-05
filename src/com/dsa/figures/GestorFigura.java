package com.dsa.figures;

import java.util.Arrays;

public interface GestorFigura {

    public double areas(Figura[] fig);
    public void sort2(Figura[] fig);

    // Funcao para somar todas as areas
    static double sumaAreas(Figura [] fig) {
        double suma = 0;
        for (Figura n: fig) {
            suma += n.getArea();
        }
        return suma;
    }

    //Sort an array of Figura by its areas
    static void sort(Figura[] fig) {
        Arrays.sort(fig);
    }


}
