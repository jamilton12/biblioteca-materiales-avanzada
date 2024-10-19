package com.mycompany.examensegundomometojava;

import com.mycompany.examensegundomometojava.materiales.Material;
import java.util.ArrayList;

public class Biblioteca {
    ArrayList<Material> materiales;

    public Biblioteca() {
        materiales  = new ArrayList<>();
    }
    
    public void agregarMaterial(Material material) {
        this.materiales.add(material);
    }
    
    public Material buscarMaterial(String titulo) {
        for (Material material : materiales) {
            if (material.getTitiulo().equals(titulo)) {
                return  material;
            }
        }
        return  null;
    }
    
    public void mostrarCatalogo() {
        for (Material material : materiales) {
            System.out.println(material.mostrarInformacion());
        }
    }
}
