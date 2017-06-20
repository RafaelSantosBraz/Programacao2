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
public class Caminhao extends VeiculoMae implements Veiculo {

    public Caminhao() {
        super();
    }

    public Caminhao(double valor, int anofabricacao) {
        super();
        super.setAnoFabricacao(anofabricacao);
        super.setValor(valor);
    }

    @Override
    public double calcularIPVA() {
        if (2017 - this.getAnoFabricacao() >= 15) {
            return 0.0;
        }
        return this.getValor() * 0.035;
    }
}
