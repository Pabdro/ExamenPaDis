package examen1.ej4;

public class PaqueteMediano extends BuilderPaquete{
    @Override
    public void buildNombre() {
        this.paquete.setNombre("Paquete mediano");
    }

    @Override
    public void buildPipocasExtragrandes() {

    }

    @Override
    public void buildGaseosasExtragrandes() {

    }

    @Override
    public void buildChocolatesGigantes() {

    }

    @Override
    public void buildPipocasGrandes() {
        this.paquete.setPipocasGrandes(1);
    }

    @Override
    public void buildVasosDeRefresco() {
        this.paquete.setVasoDeRefresco(2);

    }

    @Override
    public void buildChocolate() {
        this.paquete.setChocolate(1);
    }

    @Override
    public void buildPipocasNormales() {

    }

    @Override
    public void buildRefresco() {

    }
}
