/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author birdo
 */
public class Triangulo extends Figura {

    public Triangulo(int x1, int y1, int x2, int y2) {
        super(x1, y1, x2, y2);
    }

    public Triangulo() {
    }

    @Override
    public double calcularArea() {
        Punto puntoMedio = new Punto(punto2.getX(),punto1.getY());
        double base = puntoMedio.calcularDistancia(punto1);
        double altura = puntoMedio.calcularDistancia(punto2);
        return (base * altura) / 2;
    }

    @Override
    public double calcularPerimetro() {
        Punto puntoMedio = new Punto(punto2.getX(),punto1.getY());
        double base = puntoMedio.calcularDistancia(punto1);
        double altura = puntoMedio.calcularDistancia(punto2);
        double lado = punto1.calcularDistancia(punto2);
        return base + altura + lado;
    }
    
}
