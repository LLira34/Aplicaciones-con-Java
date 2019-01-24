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
public class NodoList {

    NodoArbol num;
    NodoList sig;

    public NodoList(NodoArbol numero) {
        num = numero;
        sig = null;
    }

    public NodoList(NodoArbol numero, NodoList sigNodo) {
        num = numero;
        sig = sigNodo;
    }
}
