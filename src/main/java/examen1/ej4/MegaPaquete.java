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
        this.paquete.setPipocasGrandes(0);
    }

    @Override
    public void buildVasosDeRefresco() {
        this.paquete.setVasoDeRefresco(0);
    }

    @Override
    public void buildChocolate() {
        this.paquete.setChocolate(0);
    }

    @Override
    public void buildPipocasNormales() {
        this.paquete.setPipocasNormales(0);
    }

    @Override
    public void buildRefresco() {
        this.paquete.setRefresco(0);
    }
}
