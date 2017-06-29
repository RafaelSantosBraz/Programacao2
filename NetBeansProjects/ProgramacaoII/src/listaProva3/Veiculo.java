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
public abstract class Veiculo {
    private String marca;
    private String modelo;
    private double valor;
    private int anoFabricacao;
    
    public Veiculo(){
        marca = "";
        modelo = "";
        valor = 0.0;
        anoFabricacao = 0;
    }
    
    public abstract double calcularIPVA();

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }
    
}
