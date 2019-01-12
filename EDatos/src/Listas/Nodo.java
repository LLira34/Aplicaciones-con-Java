/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

/**
 *
 * @author LLira
 */
public class Nodo {
    private String dato;//Informacion del nodo
    private Nodo sig;//Enlace al siguiente 

    public Nodo() {
    }
    
    public Nodo(String dato){
        this.dato= dato;
    }

    public Nodo(String dato, Nodo sig) {
        this.dato = dato;
        this.sig = sig;
    }
    
    //Generate getters and setters 
    public void setDato(String dato) {
        this.dato = dato;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }

    public String getDato() {
        return dato;
    }

    public Nodo getSig() {
        return sig;
    }
    
    
}//End
