package examen1.ej4;

public class Director {
    private BuilderPaquete builder;
    public Paquete getPaqueteHecho(){
        return builder.getProduct();
    }

    public void setBuilder(BuilderPaquete builder){
        this.builder=builder;
    }
    public void hacerPaquete(){
        this.builder.createPaquete();
        this.builder.buildNombre();
        this.builder.buildPipocasExtragrandes();
        this.builder.buildGaseosasExtragrandes();
        this.builder.buildChocolatesGigantes();
        this.builder.buildPipocasGrandes();
        this.builder.buildVasosDeRefresco();
        this.builder.buildChocolate();
        this.builder.buildPipocasNormales();
        this.builder.buildRefresco();
    }
}
