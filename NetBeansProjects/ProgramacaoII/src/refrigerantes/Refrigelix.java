package refrigerantes;

public class Refrigelix extends Refrigerante {

    public Refrigelix() {
        super();
    }

    public Refrigelix(String nome, int conteudo, String sabor) {
        super.setNome(nome);
        super.setConteudo(conteudo);
        super.setSabor(sabor);
        super.setComposicao("");
        super.setInformacaoNutricional("");
    }
}




