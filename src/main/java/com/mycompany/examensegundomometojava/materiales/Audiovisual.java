
package com.mycompany.examensegundomometojava.materiales;

public class Audiovisual extends Material {
    private String formato  ;
    private int duracion  ;
    public Audiovisual(String titiulo, String autor, int añoDePublicacion, String formato  , int duracion  ) {
        super(titiulo, autor, añoDePublicacion);
        this.formato   = formato  ;
        this.duracion   = duracion  ;
    }
    
    @Override
    public String getTipoMaterial() {
        return "Rvista";
    }
    
    @Override
    public int calcularTarifaPrestamo(int diasPrestamo) {
        int precioxDia = 10000;
        int precioTotal = precioxDia * diasPrestamo;
        if (this.formato.equals("Blu-ray")) {
            precioTotal = (precioxDia * diasPrestamo) + 10000;
            
        }
        return  precioTotal;
    }

    @Override
    public String mostrarInformacion () {
        String informacion = "Autor " + this.autor + ", titulo " + this.titiulo + ", esta disponible " + this.disponible + ", duracion " + this.duracion   + ", formato " + this.formato   ;
        
        return informacion;
    }
}


