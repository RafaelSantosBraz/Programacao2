/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;


/**
 *
 * @author a120121
 */
public class Vaga {
    String rotulo;
    boolean situacao;
    LocalDateTime dataHoraEntrada;
    LocalDateTime dataHoraSaida;
    String placaCarroAtual;
    
    public Vaga(){
        rotulo = "";
        situacao = false;
        dataHoraEntrada = null;
        dataHoraSaida = null;
        placaCarroAtual = "";
    }
}
