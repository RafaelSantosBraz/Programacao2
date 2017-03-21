/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalField;
import java.util.Date;

/**
 *
 * @author a120121
 */
public class Estacionamento {
    int precoHora;
    int precoHoraAdicinal;
    Vaga vagas[];
    
    public Estacionamento(){
        precoHora = 4;
        precoHoraAdicinal = 2;
        vagas = new Vaga[24];
        for (int j = 0; j < 24; j++){
            vagas[j] = new Vaga();
        }
        int i = 1;
        String marcacao = "E";
        for (Vaga vaga : vagas) {
            if (i > 12){
                i = 1;
                marcacao = "D";
            }
            vaga.rotulo = marcacao + Integer.toString(i);
            i++;
        }        
    }
    
    boolean estacionar(String placa){
        for (Vaga vaga : vagas) {
            if (!vaga.situacao){
               vaga.situacao = true;
               vaga.dataHoraEntrada = LocalDateTime.now();
               return true;
            }
        }
        return false;
    }
    
    long retirar(String placa){
        Vaga v = null;
        for (Vaga vaga : vagas) {
            if (vaga.rotulo.equals(placa)){
               vaga.situacao = false;
               vaga.dataHoraSaida = LocalDateTime.now();
               v = vaga;
               break;
            }
        }
        long permanencia = ChronoUnit.HOURS.between(v.dataHoraEntrada, v.dataHoraSaida);
        if (permanencia <= 1){
            return precoHora;
        } else{
            return precoHora + (permanencia - 1) * precoHoraAdicinal;
        }
    }
}
