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
public class Jogo implements Serializable {

    private Jogador jogador;
    private Computador computador;

    public Jogo() {
        jogador = new Jogador();
        computador = new Computador();
    }

    public Jogador verGanhador() {
        int soma = this.getComputador().getDedos() + this.getJogador().getDedos();
        if ((soma % 2 == 0) && (this.getComputador().getEscolha() == Jogador.PAR)){
            computador.setPontos(computador.getPontos() + 1);
            return computador;
        }
        if ((soma % 2 != 0) && (this.getComputador().getEscolha() == Jogador.IMPAR)){
            computador.setPontos(computador.getPontos() + 1);
            return computador;
        }
        jogador.setPontos(jogador.getPontos() + 1);
        return jogador;
    }

    public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }

    public Computador getComputador() {
        return computador;
    }

    public void setComputador(Computador computador) {
        this.computador = computador;
    }
}
