/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;

/**
 *
 * @author a120121
 */
public class Jogador implements Serializable{

    public static final int PAR = 0;
    public static final int IMPAR = 1;
    private int dedos;
    private int escolha;
    private int pontos;

    public Jogador() {
        dedos = 0;
        escolha = 0;
        pontos = 0;
    }

    public int getDedos() {
        return dedos;
    }

    public void setDedos(int dedos) {
        this.dedos = dedos;
    }

    public int getEscolha() {
        return escolha;
    }

    public void setEscolha(int escolha) {
        this.escolha = escolha;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }
}
