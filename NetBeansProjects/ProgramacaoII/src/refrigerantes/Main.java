package refrigerantes;

public class Main {

    public static void main(String[] args) {
        FabricaRefrigelixInc fabrica = new FabricaRefrigelixInc();
        Refrigerante refrigelix = fabrica.factoryMethod();
        refrigelix.setNome("Refrigerante Refrigelix");
        refrigelix.setConteudo(2000);
        refrigelix.setSabor("Tamarindo");
        refrigelix.setComposicao("Tamarindo, água, açucar e gás Carbônico");
        refrigelix.setInformacaoNutricional("Kcal: 800");
        System.out.println("Nome: " + refrigelix.getNome() + "\nConteúdo: "
                + refrigelix.getConteudo() + "ml" + "\nSabor: "
                + refrigelix.getSabor() + "\nComposição: " 
                + refrigelix.getComposicao()
                + "\nInformação Nutricional: "
                + refrigelix.getInformacaoNutricional());
    }
}



