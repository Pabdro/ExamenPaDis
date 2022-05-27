package examen1.ej4;

public class MegaPaquete extends BuilderPaquete{
    @Override
    public void buildNombre() {
        this.paquete.setNombre("Mega Paquete");
    }

    @Override
    public void buildPipocasExtragrandes() {
        this.paquete.setPipocasExtragrandes(1);
    }

    @Override
    public void buildGaseosasExtragrandes() {
        this.paquete.setGaseosasExtragrandes(3);
    }

    @Override
    public void buildChocolatesGigantes() {
        this.paquete.setChocolatesGrandes(2);
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

    }

    @Override
    public void buildRefresco() {

    }
}
