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
public class Nodo {
    private Comanda comanda;
    private Nodo sig;

    public Nodo(Comanda comanda) {
        this.comanda = comanda;
    }

    //Generate getters and setters
    public Comanda getComanda() {
        return comanda;
    }

    public void setComanda(Comanda comanda) {
        this.comanda = comanda;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }

    @Override
    public String toString() {
        return "Nodo{" + "comanda=" + comanda + ", sig=" + sig + '}';
    }
    
    
}//End
