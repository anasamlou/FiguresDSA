package com.dsa.figures;


abstract class Figura implements Comparable<Figura>{

    // Metodo abstrato area para ser escrito nas outras classes
    public abstract double getArea();

    // Implementacao do metodo compareTo na clase comparable
    @Override
    public int compareTo(Figura n) {
        // return (int)this.getArea()-n.getArea();

        if (this.getArea() < n.getArea()) {
            return -1;
        }else{
            return 1;
        }

    }
}