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
public class ListaImages {
    private NodoD inicio;
    private NodoD fin;
    private NodoD actual;

    public ListaImages() {
        inicio = null;
        fin = null;
    }

    //Code of ListaSimple
    public void insertarOrden(NodoD nuevo) {
        NodoD aux;
        Imagen image = null;
        Imagen image2 = null;
        //Caso 1: Lista vacia
        if (inicio == null) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            aux = inicio;
            //busca donde insertar la cancion en la lista
            if (aux != null) {
                image = (Imagen) nuevo.getDatos();
                image2 = (Imagen) aux.getDatos();
            }
            while (aux != null && image.getTitulo().compareTo(image2.getTitulo()) > 0) {
                aux = aux.getSig();
                if (aux != null) {
                    //cancion = (Cancion) nuevo.getDatos();
                    image2 = (Imagen) aux.getDatos();
                }
            }
            //Caso 2: Insertar al inicio
            if (aux == inicio) {
                nuevo.setSig(inicio);
                inicio.setAnt(nuevo);
                inicio = nuevo;
            } //Caso 3: Insercion al final
            else if (aux == null) {
                fin.setSig(nuevo);
                nuevo.setAnt(fin);
                fin = nuevo;
            } else //Caso 4: Insercion en medio
            if (aux != null && aux.getAnt() != null) {
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
                System.out.println("==> " + aux.getDatos().toString());
                aux = aux.getSig();
            }
        } else {//Orden descendente 
            System.out.println("Recorrido desde el final hasta el inicio...");
            aux = fin;
            while (aux != null) {
                System.out.println("==> " + aux.getDatos().toString());
                aux = aux.getSig();
            }
        }
    }
    //End code ListaDoble

    //Se dirige a la primera cancion
    public NodoD irPrimero() {
        actual = inicio; //Cancion actual se ira al inicio
        return inicio;
    }

    public NodoD irUltimo() {
        actual = fin;
        return fin;
    }

    public NodoD irAnterior() {
        if (actual.getAnt() != null) {
            actual = actual.getAnt();
        }
        return actual;
    }

    public NodoD irSiguiente() {
        if (actual.getSig() != null) {
            actual = actual.getSig();
        }
        return actual;
    }

    public NodoD getActual() {
        return actual;
    }

}//End
