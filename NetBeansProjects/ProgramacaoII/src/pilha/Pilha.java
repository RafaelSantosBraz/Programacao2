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
 */
public class Pilha {

    private ArrayList<String> elementos;

    public Pilha() {
        elementos = new ArrayList<>();
    }

    public boolean pilhaVazia() {
        return elementos.isEmpty();
    }

    public void empilhar(String valor) {
        elementos.add(0, valor);
    }

    public boolean desempilhar() {
        if (pilhaVazia()) {
            return false;
        }
        elementos.remove(0);
        return true;
    }
    
    public boolean desempilharExcecao() throws ExecaoPilhaVazia{
        if (pilhaVazia()) {
            throw new ExecaoPilhaVazia(); //não há retorno, ele dispara a exceção especificada
        }
        elementos.remove(0);
        return true;
    }
    
    public ArrayList<String> getElementos() {
        return elementos;
    }

    public void reicializarPilha() {
        elementos = new ArrayList<>();
    }
}
