/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author birdo
 */
public class Rectangulo extends Figura {

    public Rectangulo(int x1, int y1, int x2, int y2) {
        super(x1, y1, x2, y2);
    }

    public Rectangulo() {
    }

    @Override
    public double calcularArea() {
        Punto puntoMedio = new Punto(punto1.getX(),punto2.getY());
        double lado1 = puntoMedio.calcularDistancia(punto1);
        double lado2 = puntoMedio.calcularDistancia(punto2);
        return lado1 * lado2;
    }

    @Override
    public double calcularPerimetro() {
        Punto puntoMedio = new Punto(punto1.getX(),punto2.getY());
        double lado1 = puntoMedio.calcularDistancia(punto1);
        double lado2 = puntoMedio.calcularDistancia(punto2);
        return lado1 + lado1 + lado2 + lado2;
    }
    
}
