package com.dsa.figures;


abstract class Figura implements Comparable<Figura>{

    // Metodo abstrato area para ser escrito nas outras classes
    public abstract double GetArea();

    // Implementacao do metodo compareTo na clase comparable
    @Override
    public int compareTo(Figura n) {

        if (this.GetArea() < n.GetArea()) {
            return -1;
        }else{
            return 1;
        }

    }
}