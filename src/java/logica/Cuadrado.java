/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author birdo
 */
public class Cuadrado extends Figura {

    public Cuadrado(int x1, int y1, int x2, int y2) {
        super(x1, y1, x2, y2);
    }

    public Cuadrado() {}

    @Override
    public double calcularArea() {
        double lado = punto1.calcularDistancia(punto2);
        return lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        double lado = punto1.calcularDistancia(punto2);
        return 4 * lado;
    }
    
    
    
}
