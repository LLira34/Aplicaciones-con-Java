/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author LLira
 */
public class Imagen {
    private static int contador=0;
    private int id;
    private String titulo;
    private String ruta;
    
    //Generate Constructor
    public Imagen(int id, String titulo, String ruta) {
        this.titulo = titulo;
        this.ruta = ruta;
    }
    
    //Generate constructor empty
    public Imagen(){
        this(0,"","");
        id=++contador;
    }
    
    //Generate getters and setters
    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Imagen.contador = contador;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    @Override
    public String toString() {
        return "Imagen{" + "id=" + id + ", titulo=" + titulo + ", ruta=" + ruta + '}';
    }
    
    
    
    
    
}//End
