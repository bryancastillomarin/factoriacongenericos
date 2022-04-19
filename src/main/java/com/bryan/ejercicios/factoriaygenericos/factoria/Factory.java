package com.bryan.ejercicios.factoriaygenericos.factoria;

/**
 *
 * @author bryan
 */
public class Factory {
    
    public static final int TRIANGULO = 3;
    public static final int RECTANGULO = 4;
    
    public Figura obtenerFigura(
            int figura, double largo, double ancho
    ) throws Exception {
        switch(figura) {
            case TRIANGULO: 
                return new Triangulo(largo, ancho);
            case RECTANGULO:
                return new Rectangulo(largo, ancho);
            default: 
                throw new Exception("Figura no contemplada");
        }
    }
    
}
