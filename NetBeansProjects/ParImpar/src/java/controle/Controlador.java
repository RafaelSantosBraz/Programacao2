package controle;

import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import modelo.Jogador;
import modelo.Jogo;

@ManagedBean(name = "controlador")
@ViewScoped

public class Controlador implements Serializable {

    private Jogo jogo;

    public Controlador() {
        jogo = new Jogo();
    }
    
    public void confirmar(){
        
    }
    
    //quando o usuario escolher par
    public void par() {
        jogo.getJogador().setEscolha(Jogador.PAR);
        jogo.getComputador().setEscolha(Jogador.IMPAR);
        jogo.getComputador().jogar();
        Jogador ganhador = jogo.verGanhador();
        if (ganhador == jogo.getJogador()) {
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Jogador ganhou!", null));
        } else {
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Computador ganhou!", null));
        }
    }

    //quando o usuario escolher ímpar
    public void impar() {
        jogo.getJogador().setEscolha(Jogador.IMPAR);
        jogo.getComputador().setEscolha(Jogador.PAR);
        jogo.getComputador().jogar();
        Jogador ganhador = jogo.verGanhador();
        if (ganhador == jogo.getJogador()) {
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Jogador ganhou!", null));
        } else {
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Computador ganhou!", null));
        }
    }

    public Jogo getJogo() {
        return jogo;
    }

    public void setJogo(Jogo jogo) {
        this.jogo = jogo;
    }
}
