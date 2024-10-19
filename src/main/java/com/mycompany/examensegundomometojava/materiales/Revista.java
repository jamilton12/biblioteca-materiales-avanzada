package com.mycompany.examensegundomometojava.materiales;

public class Revista extends  Material{
    private String mesPublicacion ;
    private int numeroEdicion ;
    public Revista(String titiulo, String autor, int añoDePublicacion, String mesPublicacion , int numeroEdicion ) {
        super(titiulo, autor, añoDePublicacion);
        this.mesPublicacion  = mesPublicacion ;
        this.numeroEdicion  = numeroEdicion ;
    }
    
    @Override
    public String getTipoMaterial() {
        return "Rvista";
    }
    
    @Override
    public int calcularTarifaPrestamo(int diasPrestamo) {
        int precioxDia = 10000;
        int precioTotal = precioxDia * diasPrestamo;

        return  precioTotal;
    }

    @Override
    public String mostrarInformacion () {
        String informacion = "Autor " + this.autor + ", titulo " + this.titiulo + ", esta disponible " + this.disponible + ", numero de edicion  " + this.numeroEdicion  + ", mes de publicacion " + this.mesPublicacion  ;
        
        return informacion;
    }
}
