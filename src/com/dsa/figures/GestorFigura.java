package com.dsa.figures;

import java.util.Arrays;

public class GestorFigura {

    public static double sumatorio(Figura[] 1){
        double sumatorioarea = 0;
        for (Figura figura: 1){
            sumatorioarea += figura.GetArea();
        }
    }



}
