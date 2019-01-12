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
public class NodoArbolBin {
    private Alumno datos;
    private NodoArbolBin hijoIzq;
    private NodoArbolBin hijoDer;
    private NodoArbolBin padre;
    
    private NodoArbolBin(){}
    public NodoArbolBin(Alumno datos, NodoArbolBin padre) {
        this.datos = datos;
        this.padre = padre;
    }

    public Alumno getDatos() {
        return datos;
    }

    public void setDatos(Alumno datos) {
        this.datos = datos;
    }

    public NodoArbolBin getHijoIzq() {
        return hijoIzq;
    }

    public void setHijoIzq(NodoArbolBin hijoIzq) {
        this.hijoIzq = hijoIzq;
    }

    public NodoArbolBin getHijoDer() {
        return hijoDer;
    }

    public void setHijoDer(NodoArbolBin hijoDer) {
        this.hijoDer = hijoDer;
    }

    public NodoArbolBin getPadre() {
        return padre;
    }

    public void setPadre(NodoArbolBin padre) {
        this.padre = padre;
    }
}//End
