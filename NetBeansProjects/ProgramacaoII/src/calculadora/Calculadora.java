/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author Rafael dos Santos Braz
 */
public class Calculadora {

    private double x;
    private double y;

    public Calculadora() {
        setX(0.0);
        setY(0.0);
    }

    public double somar() {
        return getX() + getY();
    }

    public double subtrair() {
        return getX() - getY();
    }
    
    public double multiplicar(){
        return getX() * getY();
    }
    
    public double dividir(){
        return getX() / getY();
    }
    
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
