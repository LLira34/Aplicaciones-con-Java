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
public class ArbolBin {
    private NodoArbolBin raiz;
    private String lista = "";
    private boolean ban = true;

    public ArbolBin() {
        raiz = null;
    }

    public void insertar(Alumno dato) {
        NodoArbolBin padre = null;
        NodoArbolBin tempo;
        NodoArbolBin nuevo = new NodoArbolBin(dato, null);
        tempo = raiz;
        if (raiz == null) {//Si el arbol esta vacio
            raiz = nuevo;
        } else {
            boolean banIzq = true;
            while (tempo != null) {
                padre = tempo;
                if (dato.getNumControl() < tempo.getDatos().getNumControl()) {
                    banIzq = true;
                    tempo = tempo.getHijoIzq();
                } else {
                    banIzq = false;
                    tempo = tempo.getHijoDer();
                }
            }
            if (banIzq) {
                nuevo.setPadre(padre);
                padre.setHijoIzq(nuevo);
            } else {
                nuevo.setPadre(padre);
                padre.setHijoDer(nuevo);
            }
        }
    }

    public void recorridoIn(NodoArbolBin nodo) {
        if (nodo != null) {
            recorridoIn(nodo.getHijoIzq());
            lista += nodo.getDatos().toString() + "\n";
            recorridoIn(nodo.getHijoDer());
        }
    }
    
    public void recorridoPre(NodoArbolBin nodo) {
        if (nodo != null) {
            lista += nodo.getDatos().toString() + "\n";
            recorridoPre(nodo.getHijoIzq());
            recorridoPre(nodo.getHijoDer());
        }
    }
    
    public void recorridoPost(NodoArbolBin nodo) {
        if (nodo != null) {
            recorridoPost(nodo.getHijoIzq());
            recorridoPost(nodo.getHijoDer());
            lista += nodo.getDatos().toString() + "\n";
        }
    }
    

    /**
     * 
     * @param nodo Nodo raiz, donde inicia la busqueda
     * @param arbol2 Nuevo arbol generado 
     * @param num El numero de control del nodo a eliminar
     */
    public void eliminar(NodoArbolBin nodo, ArbolBin arbol2, int num) {
        if (nodo != null) {
            if (nodo.getDatos().getNumControl() != num) {
                arbol2.insertar(nodo.getDatos());
            }
            eliminar(nodo.getHijoIzq(), arbol2, num);
            eliminar(nodo.getHijoDer(), arbol2, num);
        }
    }

    public Alumno buscar(int control) {
        NodoArbolBin tempo = null;
        tempo = raiz;
        while (tempo != null && control != tempo.getDatos().getNumControl()) {
            if (control < tempo.getDatos().getNumControl()) {
                tempo = tempo.getHijoIzq();
            } else {
                tempo = tempo.getHijoDer();
            }
        }
        if (tempo == null) {
            return null;
        } else {
            return tempo.getDatos();
        }
    }

    public NodoArbolBin getRaiz() {
        return raiz;
    }

    public String getLista() {
        return lista;
    }

    public void setLista(String lista) {
        this.lista = lista;
    }

}//End
