/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolesbinarios;

/**
 *
 * @author Ashley Quintero
 */
public class NodoArbol {
    private int numero;
    private NodoArbol izq;
    private NodoArbol der;
    
    public void CreaNodo(int numero){
        this.numero = numero;
        izq = null;
        der = null;
    }

    public int getNumero(){
        return numero;
    }
    
    public void setPunteroIzq(NodoArbol hijo){
        izq = hijo;
    }
    
    public void setPunteroDer(NodoArbol hijo){
        der = hijo;
    }

    public NodoArbol getPunteroIzq(){
        return izq;
    }
    
    public NodoArbol getPunteroDer(){
        return der;
    }
}
