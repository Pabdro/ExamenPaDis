package examen1.ej4;

public class Paquete {
    private String nombre;
    private int pipocasExtragrandes;
    private int gaseosasExtragrandes;
    private int chocolatesGrandes;
    private int pipocasGrandes;
    private int vasoDeRefresco;
    private int chocolate;
    private int pipocasNormales;
    private int refresco;
    public Paquete(){}

    public String getNombre() {
        return nombre;
    }

    public Paquete setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public int getPipocasExtragrandes() {
        return pipocasExtragrandes;
    }

    public Paquete setPipocasExtragrandes(int pipocasExtragrandes) {
        this.pipocasExtragrandes = pipocasExtragrandes;
        return this;
    }

    public int getGaseosasExtragrandes() {
        return gaseosasExtragrandes;
    }

    public Paquete setGaseosasExtragrandes(int gaseosasExtragrandes) {
        this.gaseosasExtragrandes = gaseosasExtragrandes;
        return this;
    }

    public int getChocolatesGrandes() {
        return chocolatesGrandes;
    }

    public Paquete setChocolatesGrandes(int chocolatesGrandes) {
        this.chocolatesGrandes = chocolatesGrandes;
        return this;
    }

    public int getPipocasGrandes() {
        return pipocasGrandes;
    }

    public Paquete setPipocasGrandes(int pipocasGrandes) {
        this.pipocasGrandes = pipocasGrandes;
        return this;
    }

    public int getVasoDeRefresco() {
        return vasoDeRefresco;
    }

    public Paquete setVasoDeRefresco(int vasoDeRefresco) {
        this.vasoDeRefresco = vasoDeRefresco;
        return this;
    }

    public int getChocolate() {
        return chocolate;
    }

    public Paquete setChocolate(int chocolate) {
        this.chocolate = chocolate;
        return this;
    }

    public int getPipocasNormales() {
        return pipocasNormales;
    }

    public Paquete setPipocasNormales(int pipocasNormales) {
        this.pipocasNormales = pipocasNormales;
        return this;
    }

    public int getRefresco() {
        return refresco;
    }

    public Paquete setRefresco(int refresco) {
        this.refresco = refresco;
        return this;
    }
    public void showInfo(){
        System.out.println("* "+nombre);
        System.out.println("pipocas extra grande "+pipocasExtragrandes);
        System.out.println("vasos de gaseosa extra grande "+gaseosasExtragrandes);
        System.out.println("chocolates grandes "+chocolatesGrandes);
        System.out.println("pipocas grandes "+pipocasGrandes);
        System.out.println("vasos de refresco "+vasoDeRefresco);
        System.out.println("chocolates "+chocolate);
        System.out.println("pipocas normales "+pipocasNormales);
        System.out.println("refresco "+refresco);
        System.out.println();
    }
}
