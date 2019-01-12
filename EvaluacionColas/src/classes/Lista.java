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
public class Lista {
    private Nodo inicio;
    private Nodo fin;

    public Lista() {
        inicio = null;
        fin = null;
    }

    public void insertar(Comanda datos) {
        Nodo nuevo = new Nodo(datos);
        if (inicio == null) {//Esta vacia?
            inicio = nuevo;
            fin = nuevo;
        } else {
            fin.setSig(nuevo);
            fin = nuevo;
        }
    }
    
    public Comanda eliminar(){
        Nodo nodo;
        nodo = inicio;
        if (nodo!=null) {
            inicio= nodo.getSig();
            return nodo.getComanda();
        }else{
            return null;
        }
    }
    
    public boolean isEmpty(){
        return (inicio==null);
    }
    
    public Comanda getInicio(){
        if (inicio!=null) {
            return inicio.getComanda();
        }else{
            return null;
        }
    }
}//End
