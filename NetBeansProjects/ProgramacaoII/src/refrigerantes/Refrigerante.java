package refrigerantes;

public abstract class Refrigerante {

    private String nome;
    private int conteudo;
    private String sabor;
    private String composicao;
    private String informacaoNutricional;

    public Refrigerante() {
        nome = "";
        conteudo = 0;
        sabor = "";
        composicao = "";
        informacaoNutricional = "";
    }
    
    //Getters and Setters
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getConteudo() {
        return conteudo;
    }

    public void setConteudo(int conteudo) {
        this.conteudo = conteudo;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getComposicao() {
        return composicao;
    }

    public void setComposicao(String composicao) {
        this.composicao = composicao;
    }

    public String getInformacaoNutricional() {
        return informacaoNutricional;
    }

    public void setInformacaoNutricional(String informacaoNutricional) {
        this.informacaoNutricional = informacaoNutricional;
    }

}
