package com.bryan.ejercicios.factoriaygenericos.factoria;

/**
 *
 * @author bryan
 */
public class Triangulo extends Figura {

    public Triangulo(double largo, double ancho) {
        super(largo, ancho);
    }

    @Override
    public double getPerimetro() {
        return getLargo() * 3;
    }

    @Override
    public double getArea() {
        return getLargo() * getAncho() / 2;
    }

    @Override
    public Triangulo getFiguraGenerica() {
        return this;
    }

    @Override
    public Figura getFigura() {
        return this;
    }
    
    public String getMensaje() {
        return "Este mensaje solo lo puede mostrar un triangulo";
    }
    
}
