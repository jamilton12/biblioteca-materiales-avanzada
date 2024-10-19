package com.mycompany.examensegundomometojava.materiales;

public class Libro  extends Material{
    private String isbn;
    private int numeroDepaginas;
    public Libro(String titiulo, String autor, int añoDePublicacion, String isbn, int numeroDePaginas) {
        super(titiulo, autor, añoDePublicacion);
        this.isbn = isbn;
        this.numeroDepaginas = numeroDePaginas;
    }
    
    @Override
    public String getTipoMaterial() {
        return "Libro";
    }
    
    @Override
    public int calcularTarifaPrestamo(int diasPrestamo) {
        int precioxDia = 10000;
        int precioTotal = precioxDia * diasPrestamo;
        
        if (this.numeroDepaginas >= 500) {
             precioTotal = (precioxDia * diasPrestamo) + 10000;
        }
        return  precioTotal;
    }

    @Override
    public String mostrarInformacion () {
        String informacion = "Autor " + this.autor + ", titulo " + this.titiulo + ", esta disponible " + this.disponible + ", isbn " + this.isbn + ", numero de paginas " + this.numeroDepaginas  ;
        
        return informacion;
    }
    
}
