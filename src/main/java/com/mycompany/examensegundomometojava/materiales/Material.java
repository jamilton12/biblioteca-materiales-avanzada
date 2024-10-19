package com.mycompany.examensegundomometojava.materiales;

public abstract class Material {
    protected String titiulo; 
    protected String autor;
    protected int añoDePublicacion; 
    protected boolean disponible; 

    public Material(String titiulo, String autor, int añoDePublicacion) {
        this.titiulo = titiulo;
        this.autor = autor;
        this.añoDePublicacion = añoDePublicacion;
    }


    public String mostrarInformacion (){
        return "Material{" + "titiulo=" + titiulo + ", autor=" + autor + ", a\u00f1oDePublicacion=" + añoDePublicacion + ", disponible=" + disponible + '}';
    }
    
    public void prestar() {
        this.disponible = false; 
    }
    
    public void devolver() {
        this.disponible = true;
    }
    
    public String getTipoMaterial() {
        return null; 
    }
    
    public int calcularTarifaPrestamo(int diasPrestamo){
        return  0;
    }

    public String getTitiulo() {
        return titiulo;
    }

    public void setTitiulo(String titiulo) {
        this.titiulo = titiulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAñoDePublicacion() {
        return añoDePublicacion;
    }

    public void setAñoDePublicacion(int añoDePublicacion) {
        this.añoDePublicacion = añoDePublicacion;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
}
