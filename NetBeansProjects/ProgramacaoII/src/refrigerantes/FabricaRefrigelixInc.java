package refrigerantes;

public class FabricaRefrigelixInc implements FabricaRefrigerante {

    @Override
    public Refrigerante factoryMethod() {
        return new Refrigelix();
    }

}





