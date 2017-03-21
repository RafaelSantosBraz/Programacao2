/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author a120121
 */
public class Estacionamento {

    int precoHora;
    int precoHoraAdicinal;
    Vaga vagas[];

    public Estacionamento() {
        precoHora = 4;
        precoHoraAdicinal = 2;
        vagas = new Vaga[24];
        for (int j = 0; j < 24; j++) {
            vagas[j] = new Vaga();
        }
        int i = 1;
        String marcacao = "E";
        for (Vaga vaga : vagas) {
            if (i > 12) {
                i = 1;
                marcacao = "D";
            }
            vaga.rotulo = marcacao + Integer.toString(i);
            i++;
        }
    }

    boolean estacionar(String placa) {
        for (Vaga vaga : vagas) {
            if (!vaga.situacao) {
                vaga.situacao = true;
                vaga.dataHoraEntrada = LocalDateTime.now();
                vaga.placaCarroAtual = placa;
                return true;
            }
        }
        return false;
    }

    long retirar(String placa) {
        int p;
        long permanencia = -1;
        for (p = 0; p < 24; p++) {
            if (vagas[p].placaCarroAtual.equals(placa)) {
                vagas[p].situacao = false;
                vagas[p].dataHoraSaida = LocalDateTime.now();
                permanencia = ChronoUnit.HOURS.between(vagas[p].dataHoraEntrada, vagas[p].dataHoraSaida);
                break;
            }
        }
        if (permanencia != -1) {
            if (permanencia <= 1) {
                return precoHora;
            } else {
                return precoHora + (permanencia - 1) * precoHoraAdicinal;
            }
        } else {
            return 0;
        }
    }
}
