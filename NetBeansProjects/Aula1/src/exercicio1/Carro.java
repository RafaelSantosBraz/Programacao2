/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1;

/**
 *
 * @author a120121
 */
public class Carro {

    boolean motor;
    int ano;
    int velocidade;
    boolean arCondicionado;

    public Carro() {
        motor = false;
        arCondicionado = false;
        ano = 0;
        velocidade = 0;
    }

    void ligar() {
        motor = true;
    }

    void desligar() {
        if (velocidade == 0) {
            motor = false;
            desligarAr();
        }
    }

    void acelerar() {
        if (motor == true && velocidade < 160) {
            velocidade += 10;
        }
    }

    void frear() {
        if (motor == true && velocidade > 0) {
            velocidade -= 10;
        }
    }

    void ligarAr() {
        if (motor == true) {
            arCondicionado = true;
        }
    }

    void desligarAr() {
        arCondicionado = false;
    }
}
