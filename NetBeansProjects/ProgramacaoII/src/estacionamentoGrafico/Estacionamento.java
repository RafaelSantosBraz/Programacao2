/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamentoGrafico;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Rafael dos Santos Braz
 */
public class Estacionamento {

    public static final int PRECO_HORA = 4;
    public static final int PRECO_HORA_ADICIONAL = 2;
    private final Vaga[] VAGAS;

    public Estacionamento() {
        VAGAS = new Vaga[24];
        for (int j = 0; j < 24; j++) {
            VAGAS[j] = new Vaga();
        }
        int i = 1;
        String marcacao = "E";
        for (Vaga vaga : VAGAS) {
            if (i > 12) {
                i = 1;
                marcacao = "D";
            }
            vaga.setRotulo(marcacao + Integer.toString(i));
            i++;
        }
    }

    boolean estacionar(String placa) {
        for (Vaga vaga : getVAGAS()) {
            if (!vaga.getSituacao()) {
                vaga.setSituacao(true);
                vaga.setDataHoraEntrada(LocalDateTime.now());
                vaga.setPlacaCarroAtual(placa);
                return true;
            }
        }
        return false;
    }

    long retirar(String placa) {
        int p;
        long permanencia = -1;
        for (p = 0; p < 24; p++) {
            if (getVAGAS()[p].getPlacaCarroAtual().equals(placa)) {
                getVAGAS()[p].setSituacao(false);
                getVAGAS()[p].setDataHoraSaida(LocalDateTime.now());
                permanencia = ChronoUnit.HOURS.between(getVAGAS()[p].getDataHoraEntrada(), getVAGAS()[p].getDataHoraSaida());
                break;
            }
        }
        if (permanencia != -1) {
            if (permanencia <= 1) {
                return PRECO_HORA;
            } else {
                return PRECO_HORA + (permanencia - 1) * PRECO_HORA_ADICIONAL;
            }
        } else {
            return 0;
        }
    }

    public Vaga[] getVAGAS() {
        return VAGAS;
    }

}
