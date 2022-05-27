package examen1.ej4;

public abstract class BuilderPaquete {
    protected Paquete paquete;

    public Paquete getProduct() {
        return paquete;
    }
  // te falta insyancias te esta dando null pointer revisa la estrcutura basica y resolvelo son errores de tipo de datos e instanciacion
   public void createPaquete() {
        this.paquete = paquete;
    }
    public abstract void buildNombre();
    public abstract void buildPipocasExtragrandes();
    public abstract void buildGaseosasExtragrandes();
    public abstract void buildChocolatesGigantes();
    public abstract void buildPipocasGrandes();
    public abstract void buildVasosDeRefresco();
    public abstract void buildChocolate();
    public abstract void buildPipocasNormales();
    public abstract void buildRefresco();
}
