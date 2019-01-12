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
public class NodoD {
   private String dato;
   private NodoD ant;
   private NodoD sig;

    public NodoD() {
    }
    
    //Generate Getters and Setters
    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public NodoD getAnt() {
        return ant;
    }

    public void setAnt(NodoD ant) {
        this.ant = ant;
    }

    public NodoD getSig() {
        return sig;
    }

    public void setSig(NodoD sig) {
        this.sig = sig;
    }

    //Generate method toString
    @Override
    public String toString() {
        return "NodoD{" + "dato=" + dato + ", ant=" + ant + ", sig=" + sig + '}';
    }

    
    
}//End
