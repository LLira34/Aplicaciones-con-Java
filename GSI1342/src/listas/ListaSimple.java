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
public class ListaSimple {
    private Nodo inicio;
    
    public ListaSimple(){  
        inicio = null;
    }
    
    /**
     * Wea que inserta uno de esos nodos en el principio de la lista
     * @param nuevo 
     */
    public void insertarNodo(Nodo nuevo){
        nuevo.setSig(inicio);
        inicio = nuevo;
    }
    
    public void insertarNodoLast(Nodo nuevo){
        Nodo aux;
        aux = inicio;
        
        while(aux!=null&&aux.getSig()!=null){
            aux = aux.getSig();
        }
        aux.setSig(nuevo);
    }
    
    public void recorrerLista(){
        Nodo aux;
        aux = inicio;
        while(aux!=null){
            System.out.print(aux.getDato()+"==>");
            aux=aux.getSig();
        }
    }
    
    public int contarElemsLista(){
        Nodo aux;
        aux = inicio;
        int count = 0;
        while(aux!=null){
            count++;
            aux=aux.getSig();
        }
        
        return count;
    }
    
}
