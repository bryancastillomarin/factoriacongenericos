package com.bryan.ejercicios.factoriaygenericos.factoria;

/**
 *
 * @author bryan
 */
public abstract class Figura<T>{
    
    private double largo;
    private double ancho;
    
    public Figura(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }
    
    public abstract double getPerimetro();
    
    public abstract double getArea();
    
    public abstract T getFiguraGenerica();
    
    public abstract Figura getFigura();

    /**
     * @return the largo
     */
    public double getLargo() {
        return largo;
    }

    /**
     * @param largo the largo to set
     */
    public void setLargo(double largo) {
        this.largo = largo;
    }

    /**
     * @return the ancho
     */
    public double getAncho() {
        return ancho;
    }

    /**
     * @param ancho the ancho to set
     */
    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

}
