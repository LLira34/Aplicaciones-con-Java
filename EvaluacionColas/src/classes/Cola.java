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
public class Cola {
    private Lista lista;
    private Comanda frente;
    private Comanda fin;
    private int ordenes;
    
    public Cola(){
        lista= new Lista();
        frente= null;
        ordenes = 0;
    }
    
    public void agregar(Comanda nueva){
        lista.insertar(nueva);
        ordenes++;
    }
    
    public Comanda atender(){
        Comanda comanda;
        ordenes--;
        comanda=  lista.eliminar();
        frente = lista.getInicio();
        return comanda;
    }
    
    public int getOrdenes(){
        return ordenes;
    }
}//End
