/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaProva3;

/**
 *
 * @author rafin
 * @param <T>
 */
public class pilha <T extends IVeiculo> {
    
    public Class nomeClasse(Integer i){
        return i.getClass();
    }
    
    public <T> Class  nomeClasse(T i){
        return  (Class<T>) i.getClass();
    }
}
