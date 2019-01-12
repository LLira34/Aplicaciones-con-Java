/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

/**
 *
 * @author Sergio
 */
public class Nodo {
    private String dato;    //Info del nodo
    private Nodo sig;       //enlace cobalente digo al siguiente 

    public Nodo() {
    }
    
    public Nodo(String dato){
        this.dato=dato;
        this.sig=sig;
    }

    public Nodo(String dato, Nodo sig) {
        this.dato = dato;
        this.sig = sig;
    }

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
    
    
}
