package examen1.ej4;

public class Client {
    public static void main(String[] args) {
        Director jefe=new Director();
        BuilderPaquete megaPaquete= new MegaPaquete();
        BuilderPaquete paqueteMediano= new PaqueteMediano();
        BuilderPaquete paqueteNormal= new PaqueteNormal();
        System.out.println("El cliente quiere");
        jefe.setBuilder(megaPaquete);
        jefe.hacerPaquete();
        Paquete p1=jefe.getPaqueteHecho();
        p1.showInfo();
        jefe.setBuilder(paqueteMediano);
        jefe.hacerPaquete();
        Paquete p2=jefe.getPaqueteHecho();
        p2.showInfo();
        jefe.setBuilder(paqueteNormal);
        jefe.hacerPaquete();
        Paquete p3=jefe.getPaqueteHecho();
        p3.showInfo();
    }
}
