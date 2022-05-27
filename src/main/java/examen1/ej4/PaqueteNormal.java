package examen1.ej4;

public class PaqueteNormal extends BuilderPaquete{
    @Override
    public void buildNombre() {
        this.paquete.setNombre("Paquete Normal");
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

    }

    @Override
    public void buildVasosDeRefresco() {

    }

    @Override
    public void buildChocolate() {

    }

    @Override
    public void buildPipocasNormales() {
        this.paquete.setPipocasNormales(1);
    }

    @Override
    public void buildRefresco() {
        this.paquete.setRefresco(1);
    }
}
