/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolesbinarios;

import javax.swing.JOptionPane;

/**
 *
 * @author Ashley Quintero
 */
public class Arbol {

    NodoArbol raiz;

    public void iniciarArbol() {
        NodoArbol raiz = new NodoArbol();
        raiz = null;
    }

    public void setRaiz(NodoArbol hijo) {
        this.raiz = hijo;
    }

    public NodoArbol getRaiz() {
        return raiz;
    }

    public NodoArbol insertarArbol(NodoArbol nuevo, NodoArbol raiz) {
        if (raiz == null) {
            raiz = nuevo;
        } else {
            if (nuevo.getNumero() < raiz.getNumero()) {
                if (raiz.getPunteroIzquierdo() == null) {
                    raiz.setPunteroIzquierdo(nuevo);
                } else {
                    insertarArbol(nuevo, raiz.getPunteroIzquierdo());
                }
            } else {
                if (nuevo.getNumero() > raiz.getNumero()) {
                    if (raiz.getPunteroDerecho() == null) {
                        raiz.setPunteroDerecho(nuevo);
                    } else {
                        insertarArbol(nuevo, raiz.getPunteroDerecho());
                    }
                }
            }
        }
        return raiz;
    }

    public void inOrden(NodoArbol raiz) { //realiza el recorrido en inOrden
        if (raiz == null) {
        } else {
            inOrden(raiz.getPunteroIzquierdo());
            JOptionPane.showMessageDialog(null, "Nodo: " + raiz.getNumero());
            inOrden(raiz.getPunteroDerecho());
        }

    }

    public void preOrden(NodoArbol raiz) { //realiza el recorrido en preOrden de un arbol

        if (raiz == null) {
        } else {
            JOptionPane.showMessageDialog(null, " Nodo: " + raiz.getNumero());
            preOrden(raiz.getPunteroIzquierdo());
            preOrden(raiz.getPunteroDerecho());
        }
    }

    public void postOrden(NodoArbol raiz) {
        if (raiz == null) {
        } else {
            postOrden(raiz.getPunteroIzquierdo());
            postOrden(raiz.getPunteroDerecho());
            JOptionPane.showMessageDialog(null, " Nodo: " + raiz.getNumero());
        }

    }

    public void amplitud(NodoArbol raiz) {
        Cola cola = new Cola();
        NodoArbol nodo = null;
        if (raiz != null) {
            cola.Enqueue(raiz);
            while (!(cola.Empty())) {
                nodo = cola.principio.num;
                cola.Dequeue();
                JOptionPane.showMessageDialog(null, " Nodo: " + nodo.getNumero() + "\n");
                if (nodo.getPunteroIzquierdo() != null) {
                    cola.Enqueue(nodo.getPunteroIzquierdo());
                }
                if (nodo.getPunteroDerecho() != null) {
                    cola.Enqueue(nodo.getPunteroDerecho());
                }
            }
        }
    }
}
