/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;
/**
 *
 * @author birdo
 */
public class Punto {
    private int x;
    private int y;
    
    public Punto(int x, int y){
        this.x=x;
        this.y=y;
    }
    
    public Punto(){}
    
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public double calcularDistancia(Punto punto){
        double distanciaX = Math.abs(this.getX() - punto.getX());
        double distaciaY = Math.abs(this.getY() - punto.getY());
        double distancia = Math.sqrt(Math.pow(distanciaX, 2) + Math.pow(distaciaY, 2));
        return distancia;
    }
}
