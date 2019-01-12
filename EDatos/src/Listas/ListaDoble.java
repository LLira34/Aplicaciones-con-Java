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
public class ListaDoble {

    private NodoD inicio;
    private NodoD fin;

    //Constructor
    public ListaDoble() {
        inicio = null;
        fin = null;
    }

    public void insertarOrden(NodoD nuevo) {
        NodoD aux;
        //Caso 1: Lista vacia
        if (inicio == null) {
            inicio = nuevo;
            fin = nuevo;
        } else { //Caso 2:
            aux = inicio;
            while (aux != null && nuevo.getDato().compareTo(aux.getDato()) > 0) {
                aux = aux.getSig();
            }
            //Caso 2:
            if (aux == inicio) {
                nuevo.setSig(inicio);
                inicio.setAnt(nuevo);
                inicio = nuevo;
            }
            //Caso 3: Insercion al final
            else if (aux == null) {
                fin.setSig(nuevo);
                nuevo.setAnt(fin);
                fin = nuevo;
            }else
            //Caso 4: Insercion en medio
            if(aux!=null && aux.getAnt()!=null){
                nuevo.setSig(aux);
                nuevo.setAnt(aux.getAnt());
                aux.getAnt().setSig(nuevo);
                aux.setAnt(nuevo);
                
                
            }

        }
    }

    public void recorrerLista(char orden) {
        NodoD aux;
        if (orden == 'A') {//Orden ascendente
            aux = inicio;
            System.out.println("Recorrido desde el inicio hasta el final...");
            while (aux != null) {
                System.out.println("==> " + aux.getDato());
                aux = aux.getSig();
            }
        } else {//Orden descendente 
            System.out.println("Recorrido desde el final hasta el inicio...");
            aux = fin;
            while (aux != null) {
                System.out.println("==> " + aux.getDato());
                aux = aux.getSig();
            }
        }
    }
}//End
