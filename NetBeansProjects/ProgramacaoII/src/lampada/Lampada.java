/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lampada;

/**
 *
 * @author rafin
 */
public class Lampada {
    boolean estado;
    
    public Lampada(){
        estado = false;
    }
    
    void acender(){
        estado = true;
    }
    
    void apagar(){
        estado = false;
    }
}
