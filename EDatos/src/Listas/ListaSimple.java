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
public class ListaSimple {

    private Nodo inicio;

    public ListaSimple() {
        inicio = null;
    }

    /**
     * Método que inserta un nodo al inicio de la lista
     *
     * @param nuevo
     */
    public void insertarNodo(Nodo nuevo) {
        nuevo.setSig(inicio);
        inicio = nuevo;
    }

    public void insertarNodoFinal(Nodo nuevo) {
        Nodo aux;
        aux = inicio;
        while (aux != null && aux.getSig() != null) {
            aux = aux.getSig();
        }
        if (aux == null) {//Lista vacia, se insertara un primer nodo
            inicio = nuevo;
        } else {//Lista con elementos, el nodo se insertara al final
            aux.setSig(nuevo);
        }
    }

    public void insertarNodoOrden(Nodo nuevo) {
        Nodo anterior = null;
        Nodo siguiente = null;
        Nodo aux = inicio;

        while (aux != null && nuevo.getDato().compareTo(aux.getDato()) > 0) {
            anterior = aux;
            siguiente = aux.getSig();
            aux = aux.getSig();
        }
        //Caso 1
        if (inicio == null) {//Caso 1: Lista vacia
            inicio = nuevo;
            System.out.println("Lista vacia");
        } else if (anterior == null && siguiente == null) {//Caso 2. Insertar al inicio
            {
                nuevo.setSig(inicio);
                inicio = nuevo;
                System.out.println("Inserta al inicio");
            }

        } else if (anterior != null && siguiente == null) {//Caso 3. Insertar al final
            anterior.setSig(nuevo);
            System.out.println("Inserta al final");
        } else {//Caso 4. Insertar en medio
            anterior.setSig(nuevo);
            nuevo.setSig(siguiente);
            System.out.println("Inserta en el medio");
        }
        System.out.println("anterior= " + anterior);
        System.out.println("siguiente=" + siguiente);
        System.out.println("");
    }

    public void recorrerLista() {
        Nodo aux;
        aux = inicio;
        while (aux != null) {
            System.out.print(aux.getDato() + " ==> ");
            aux = aux.getSig();
        }
    }

    public int contarElementos() {
        Nodo aux;
        aux = inicio;
        int contador = 0;
        while (aux != null) {
            contador++;
            aux = aux.getSig();
        }
        return contador;
    }

}//End
