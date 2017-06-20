/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.Random;

/**
 *
 * @author a120121
 */
public class Computador extends Jogador implements Serializable {
    
    public Computador() {
        super();
    }
    
    public void jogar(){
        this.setDedos(new Random().nextInt(6));
    }
}
