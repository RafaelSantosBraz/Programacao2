/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaProva3;

/**
 *
 * @author rafin
 */
public class Carro extends Veiculo{
    
    public Carro(){
        super();
        
    }
    
    @Override
    public double calcularIPVA(){
        if (2017 - getAnoFabricacao() >= 20){
            return getValor() * 0.04;
        }
        return 0.0;
    }
}
