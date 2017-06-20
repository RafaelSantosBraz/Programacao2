/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamentoGrafico;

import java.time.LocalDateTime;

/**
 *
 * @author Rafael dos Santos Braz
 */
public class Vaga {

    private String rotulo;
    private boolean situacao;
    private LocalDateTime dataHoraEntrada;
    private LocalDateTime dataHoraSaida;
    private String placaCarroAtual;

    public Vaga() {
        rotulo = "";
        situacao = false;
        dataHoraEntrada = null;
        dataHoraSaida = null;
        placaCarroAtual = "";
    }

    public String getRotulo() {
        return rotulo;
    }

    public void setRotulo(String rotulo) {
        this.rotulo = rotulo;
    }

    public boolean getSituacao() {
        return situacao;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }

    public LocalDateTime getDataHoraEntrada() {
        return dataHoraEntrada;
    }

    public void setDataHoraEntrada(LocalDateTime dataHoraEntrada) {
        this.dataHoraEntrada = dataHoraEntrada;
    }

    public LocalDateTime getDataHoraSaida() {
        return dataHoraSaida;
    }

    public void setDataHoraSaida(LocalDateTime dataHoraSaida) {
        this.dataHoraSaida = dataHoraSaida;
    }

    public String getPlacaCarroAtual() {
        return placaCarroAtual;
    }

    public void setPlacaCarroAtual(String placaCarroAtual) {
        this.placaCarroAtual = placaCarroAtual;
    }

}
