/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces.implementacaoInterface;

import java.util.ArrayList;

/**
 *
 * @author a120121
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Veiculo> frota = new ArrayList<>();

        frota.add(new Carro(80000, 2000));
        frota.add(new Carro(23410, 2001));
        frota.add(new Caminhao(200000, 2016));
        frota.add(new Caminhao(123000, 1990));

        for (Veiculo v : frota) {
            System.out.println(String.format("%.2f", v.calcularIPVA())); //chama o método da classe carro ou caminhão
        }
    }
}
