package exercicio12Apostila;

import java.util.Date;

public class Emprestimo {

    private int codigo, quiloSaida, quiloChegada;
    private Motorista motorista;
    private Carro carro;
    private Date datahoraSaida, dataHoraChegada;

    public Emprestimo(Motorista motorista, Carro carro) {
        codigo = quiloSaida = quiloChegada = 0;
        this.motorista = motorista;
        this.carro = carro;
    }

    public boolean alugar(int quiloSaida) {
        if (this.carro.isAlugado()) {
            return false;
        }
        //calculo data e hora
        this.carro.setAlugado(true);
        this.quiloSaida = quiloSaida;
        return true;
    }

    public boolean devolver(int quiloChegada) {
        if (!this.carro.isAlugado()) {
            return false;
        }
        //calculo data e hora
        this.carro.setAlugado(false);
        this.quiloChegada = quiloChegada;
        return true;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQuiloSaida() {
        return quiloSaida;
    }

    public void setQuiloSaida(int quiloSaida) {
        this.quiloSaida = quiloSaida;
    }

    public int getQuiloChegada() {
        return quiloChegada;
    }

    public void setQuiloChegada(int quiloChegada) {
        this.quiloChegada = quiloChegada;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public Date getDatahoraSaida() {
        return datahoraSaida;
    }

    public void setDatahoraSaida(Date datahoraSaida) {
        this.datahoraSaida = datahoraSaida;
    }

    public Date getDataHoraChegada() {
        return dataHoraChegada;
    }

    public void setDataHoraChegada(Date dataHoraChegada) {
        this.dataHoraChegada = dataHoraChegada;
    }

}
