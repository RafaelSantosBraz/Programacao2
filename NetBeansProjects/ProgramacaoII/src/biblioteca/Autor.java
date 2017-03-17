/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

/**
 *
 * @author rafin
 */
public class Autor {

    int codigo;
    String nome;

    public Autor() {
        codigo = 0;
        nome = "";
    }
    
    public Autor(int codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
    }
}
