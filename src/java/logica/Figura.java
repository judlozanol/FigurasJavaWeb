/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author birdo
 */
public abstract class Figura {
    Punto punto1 = new Punto(0,0);
    Punto punto2 = new Punto(0,0);
    
    public Figura(int x1, int y1, int x2, int y2){
        this.punto1 = new Punto(x1, y1);
        this.punto2 = new Punto(x2, y2);
    }
    
    public Figura(){}
    
    public void setPunto1(int x, int y){
        this.punto1.setX(x);
        this.punto1.setY(y);
    }
    
    public void setPunto2(int x, int y){
        this.punto2.setX(x);
        this.punto2.setY(y);
    }
    
    public abstract double calcularArea();
    
    public abstract double calcularPerimetro();
    
}
