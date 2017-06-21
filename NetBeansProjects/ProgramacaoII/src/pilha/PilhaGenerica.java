/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilha;

import java.util.ArrayList;

/**
 *
 * @author rafin
 * @param <T>
 */
public class PilhaGenerica<T> {

    private ArrayList<T> elementos;
    
    public static <I extends Number> Double MetodoGenerico(I i, I i2){
        return i.doubleValue()+ i2.doubleValue();
    }
    
    public PilhaGenerica() {
        elementos = new ArrayList<>();
    }

    public boolean pilhaVazia() {
        return elementos.isEmpty();
    }

    public void empilhar(T valor) {
        elementos.add(0, valor);
    }

    public boolean desempilhar() {
        if (pilhaVazia()) {
            return false;
        }
        elementos.remove(0);
        return true;
    }

    public ArrayList<T> getElementos() {
        return elementos;
    }

    public void reicializarPilha() {
        elementos = new ArrayList<>();
    }
}
