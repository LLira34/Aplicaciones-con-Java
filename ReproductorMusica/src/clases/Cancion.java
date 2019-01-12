/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author LLira
 */
public class Cancion {
    private static int contador=0;
    private int id;
    private String titulo;
    private String genero;
    private String artista;
    private String album;
    private int year;
    private String ruta;
    
    //Generate Constructor
    public Cancion(int id, String titulo, String genero, String artista, String album, int year, String ruta) {
        this.id= id;
        this.titulo = titulo;
        this.genero = genero;
        this.artista = artista;
        this.album = album;
        this.year = year;
        this.ruta = ruta;
    }
    
    //Generate constructor empty
    public Cancion(){
        this(0,"","","","",0,"");
        id=++contador;
    }

    
    //Generate getters and setters

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Cancion.contador = contador;
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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
    
    
    
    
    
    
}//End
