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
public class Carro extends VeiculoMae implements Veiculo {

    public Carro() {
        super();
    }

    public Carro(double valor, int anoFabricacao) {
        super();
        super.setAnoFabricacao(anoFabricacao);
        super.setValor(valor);

    }

    @Override
    public double calcularIPVA() {
        if (2017 - this.getAnoFabricacao() >= 20) {
            return 0.0;
        }
        return this.getValor() * 0.04;
    }

}
