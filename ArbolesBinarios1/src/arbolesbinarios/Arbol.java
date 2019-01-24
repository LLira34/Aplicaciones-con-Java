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
public class Arbol {

    NodoArbol raiz;

    public void inicarRaiz() {
        NodoArbol raiz = new NodoArbol();
        raiz = null;
    }

    public void setRaiz(NodoArbol hijo) {
        raiz = hijo;
    }

    public NodoArbol getRaiz() {
        return raiz;
    }

    public NodoArbol insertaArbol(NodoArbol nuevo, NodoArbol raiz) {
        if (raiz == null) {
            raiz = nuevo;
        } else if (nuevo.getNumero() < raiz.getNumero()) {
            if (raiz.getPunteroIzq() == null) {
                raiz.setPunteroIzq(nuevo);
            } else {
                insertaArbol(nuevo, raiz.getPunteroIzq());
            }

        } else if (nuevo.getNumero() > raiz.getNumero()) {
            if (raiz.getPunteroDer() == null) {
                raiz.setPunteroDer(nuevo);
            } else {
                insertaArbol(nuevo, raiz.getPunteroDer());
            }

        }
        return raiz;
    }
    
    public void inOrden(NodoArbol raiz){
        if(raiz == null){
            return;
        }else{
            inOrden(raiz.getPunteroIzq());
            System.out.println("El nodo es: " + raiz.getNumero());
            inOrden(raiz.getPunteroDer());
        }
    }
}
