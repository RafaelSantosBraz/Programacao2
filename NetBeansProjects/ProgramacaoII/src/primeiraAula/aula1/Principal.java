/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula1;

import java.util.Scanner;

/**
 *
 * @author a120121
 */
public class Principal {

    public static void main(String[] args) {
        Carros carro1;
        carro1 = new Carros(2018, "Fiat");
        System.out.println("Ano: " + carro1.ano);
        System.out.println("Montadora: " + carro1.marca);
        carro1.acelerar();
        System.out.println("Velocidade: " + carro1.velocidade);
        Scanner tela = new Scanner(System.in); //leitura *cin*
        int n = tela.nextInt();
    }
}
