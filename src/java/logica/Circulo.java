/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author birdo
 */
public class Circulo extends Figura {

    public Circulo(int x1, int y1, int x2, int y2) {
        super(x1, y1, x2, y2);
    }

    public Circulo() {}

    @Override
    public double calcularArea(){
        double radio = punto1.calcularDistancia(punto2);
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double calcularPerimetro() {
        double radio = punto1.calcularDistancia(punto2);
        return 2 * Math.PI * radio;
    }
}
