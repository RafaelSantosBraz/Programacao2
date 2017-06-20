/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula1;

/**
 *
 * @author a120121
 */
public class Carros {

    /**
     * @param args the command line arguments
     */
    int velocidade;
    int ano;
    String marca;

    public Carros() {
        ano = 2017;
        velocidade = 0;
        marca = "";
    }

    public Carros(int anoFabr) { //sobrecarga de métodos
        ano = anoFabr;
        velocidade = 0;
        marca = "";
    }

    public Carros(int anoFabr, String montadora) {
        ano = anoFabr;
        velocidade = 0;
        marca = montadora;
    }

    public Carros(int anoFabr, int vel, String montadora) {
        ano = anoFabr;
        velocidade = vel;
        marca = montadora;
    }

    void acelerar() {
        velocidade++;
    }

}
