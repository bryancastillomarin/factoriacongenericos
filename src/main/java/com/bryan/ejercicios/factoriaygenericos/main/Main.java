package com.bryan.ejercicios.factoriaygenericos.main;

import static com.bryan.ejercicios.factoriaygenericos.factoria.Factory.*;
import com.bryan.ejercicios.factoriaygenericos.factoria.Factory;
import com.bryan.ejercicios.factoriaygenericos.factoria.Figura;
import com.bryan.ejercicios.factoriaygenericos.factoria.Rectangulo;
import com.bryan.ejercicios.factoriaygenericos.factoria.Triangulo;

/**
 *
 * @author bryan
 */
public class Main {
    
    public static void main(String[] args) {
        
        try {
            Factory factory  = new Factory();
            Figura triangulo = factory.obtenerFigura(TRIANGULO, 4, 8);
            
            System.out.println("Triangulo Area: " + triangulo.getArea());
            System.out.println("Triangulo perimetro: " + triangulo.getPerimetro());
            
            Triangulo triangulo2 = (Triangulo) triangulo.getFigura();
            Figura figuraTriangulo = triangulo.getFigura();
            
            System.out.println(triangulo2.getMensaje());
            //System.out.println(figura.getMensaje()); no puede acceder a este metodo
            System.out.println(triangulo2.getClass());//clase figura
            System.out.println(figuraTriangulo.getClass());//a pesar de ser un objeto figura es de clase triangulo
            
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - ");
            
            Figura rectangulo = factory.obtenerFigura(RECTANGULO, 7, 4);
            
            System.out.println("Rectangulo Area: " + rectangulo.getArea());
            System.out.println("Rectangulo perimetro: " + rectangulo.getPerimetro());
            
            Rectangulo rectangulo2 = (Rectangulo) rectangulo.getFiguraGenerica();
            Figura figuraRectangulo = rectangulo.getFigura();
            
            System.out.println(rectangulo2.getMensaje());
            //System.out.println(figura.getMensaje()); no puede acceder a este metodo
            System.out.println(rectangulo.getClass());//clase figura
            System.out.println(figuraRectangulo.getClass());//a pesar de ser un objeto figura es de clase rectangulo
            
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
