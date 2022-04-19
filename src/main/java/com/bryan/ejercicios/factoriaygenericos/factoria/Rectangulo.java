package com.bryan.ejercicios.factoriaygenericos.factoria;

/**
 *
 * @author bryan
 */
public class Rectangulo extends Figura {

    public Rectangulo(double largo, double ancho) {
        super(largo, ancho);
    }
    
    @Override
    public double getPerimetro() {
        return 2 * getLargo() + 2 * getAncho();
    }

    @Override
    public double getArea() {
        return getLargo() * getAncho();
    }

    @Override
    public Rectangulo getFiguraGenerica() {
        return this;
    }

    @Override
    public Figura getFigura() {
        return this;
    }
    
    public String getMensaje() {
        return "Este mensaje solo lo puede mostrar un rectangulo";
    }
    
}
