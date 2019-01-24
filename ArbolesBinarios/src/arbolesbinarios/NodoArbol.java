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
    private NodoArbol izquierdo;
    private NodoArbol derecho;

    public void CreaNodo(int numero) {
        NodoArbol nuevo = new NodoArbol();
        this.numero = numero;
        izquierdo = null;
        derecho = null;
    }

    public int getNumero() {
        return numero;
    }

    public void setPunteroIzquierdo(NodoArbol hijo) {
        izquierdo = hijo;
    }

    public void setPunteroDerecho(NodoArbol hijo) {
        derecho = hijo;
    }

    public NodoArbol getPunteroIzquierdo() {
        return izquierdo;
    }

    public NodoArbol getPunteroDerecho() {
        return derecho;
    }
}
