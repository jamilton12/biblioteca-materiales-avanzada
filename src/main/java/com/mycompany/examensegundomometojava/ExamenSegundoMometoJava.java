package com.mycompany.examensegundomometojava;

import com.mycompany.examensegundomometojava.materiales.Audiovisual;
import com.mycompany.examensegundomometojava.materiales.Libro;
import com.mycompany.examensegundomometojava.materiales.Material;
import com.mycompany.examensegundomometojava.materiales.Revista;

public class ExamenSegundoMometoJava {

    public static void main(String[] args) {
        Libro libro = new Libro("1", "23", 2014, "asd", 200);
        Revista revista = new Revista("2", "23", 2014, "asd", 200);
        Audiovisual audio  = new Audiovisual("3", "23", 2014, "asd", 200);
        
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.agregarMaterial(audio);
        biblioteca.agregarMaterial(revista);
        biblioteca.agregarMaterial(libro);
        
        biblioteca.mostrarCatalogo();
        
        Material materialBuscado =  biblioteca.buscarMaterial("2"); 
        
        System.out.println(materialBuscado);
    }
}
