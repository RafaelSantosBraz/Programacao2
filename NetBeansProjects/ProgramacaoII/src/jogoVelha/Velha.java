package jogoVelha;

public class Velha {

    private Jogador jogador1;
    private Jogador jogador2;
    private Jogador[] jogadas;
    private boolean fim;
    private Jogador vencedor;

    public Velha(Jogador jogador1, Jogador jogador2) {
        this.jogador1 = jogador1;
        this.jogador2 = jogador2;
        jogadas = new Jogador[9];
        fim = false;
        vencedor = null;
    }

    public void inserirJogada(Jogador atual, int pos) {
        jogadas[pos - 1] = atual;
        verificarEstado();

    }

    public Jogador getJogador1() {
        return jogador1;
    }

    public void setJogador1(Jogador jogador1) {
        this.jogador1 = jogador1;
    }

    public Jogador getJogador2() {
        return jogador2;
    }

    public void setJogador2(Jogador jogador2) {
        this.jogador2 = jogador2;
    }

    public void verificarEstado() {
        int preen = 0;
        fim = true;
        if (jogadas[0] == jogadas[1] && jogadas[0] == jogadas[2] && jogadas[0] != null) {
            vencedor = jogadas[0];
        } else if (jogadas[3] == jogadas[4] && jogadas[3] == jogadas[5] && jogadas[3] != null) {
            vencedor = jogadas[3];
        } else if (jogadas[6] == jogadas[7] && jogadas[6] == jogadas[8] && jogadas[6] != null) {
            vencedor = jogadas[6];
        } else if (jogadas[0] == jogadas[3] && jogadas[0] == jogadas[6] && jogadas[0] != null) {
            vencedor = jogadas[0];
        } else if (jogadas[1] == jogadas[4] && jogadas[1] == jogadas[7] && jogadas[1] != null) {
            vencedor = jogadas[1];
        } else if (jogadas[2] == jogadas[5] && jogadas[2] == jogadas[8] && jogadas[2] != null) {
            vencedor = jogadas[2];
        } else if (jogadas[0] == jogadas[4] && jogadas[0] == jogadas[8] && jogadas[0] != null) {
            vencedor = jogadas[0];
        } else if (jogadas[6] == jogadas[4] && jogadas[6] == jogadas[2] && jogadas[6] != null) {
            vencedor = jogadas[6];
        } else {
            vencedor = null;
            fim = false;
        }
        for (int c = 0; c < 9; c++) {
            if (jogadas[c] != null) {
                preen++;
            }
        }
        if (preen == 9) {
            fim = true;
        }
    }

    public Jogador[] getJogadas() {
        return jogadas;
    }

    public void setJogadas(Jogador[] jogadas) {
        this.jogadas = jogadas;
    }

    public boolean getFim() {
        return fim;
    }

    public void setFim(boolean fim) {
        this.fim = fim;
    }

    public Jogador getVencedor() {
        return vencedor;
    }

    public void setVencedor(Jogador vencedor) {
        this.vencedor = vencedor;
    }

}
