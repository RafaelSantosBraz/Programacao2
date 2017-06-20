/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lampada;

/**
 *
 * @author rafael
 */
public class LampadaModificadores {
    private int potencia;
    private String marca;
    private boolean acesso;
    
    public int getPotencia(){
        return potencia;
    }
    
    public void setPotencia(int potencia){
        this.potencia = potencia;
    }

    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public boolean getAcesso() {
        return acesso;
    }
    
    public void setAcesso(boolean acesso) {
        this.acesso = acesso;
    }
    
    public LampadaModificadores(){
        setAcesso(false);
    }
    
    void acender(){
        setAcesso(true);
    }
    
    void apagar(){
        setAcesso(false);
    }
}
