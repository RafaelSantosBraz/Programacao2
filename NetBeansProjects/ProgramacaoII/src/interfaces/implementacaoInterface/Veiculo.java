/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces.implementacaoInterface;

/**
 *
 * @author a120121
 */
public interface Veiculo {

    //diferente da classe abstrata, pois neste caso não é construída uma classe a qual o Carro e o Caminhão herdarão.
    //Aqui são apenas indicados os métodos que as classes que implementarem esta interface deverão implementar.
    //Não são criados atributos, apenas constantes.
    public double calcularIPVA();
}
