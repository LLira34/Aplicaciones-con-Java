/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

import javax.swing.JOptionPane;

/**
 *
 * @author LLira
 */
public class TestListaSimple {
    public static void main(String[] args) {
        int resp =0;
        String nombre="";
        Nodo nuevo;
        ListaSimple miLista = new ListaSimple();
        do{
            nombre= JOptionPane.showInputDialog("Elemento a insertar: ");
            nuevo= new Nodo(nombre);
            miLista.insertarNodoOrden(nuevo);
            resp= JOptionPane.showConfirmDialog(null, "Deseas insertar otro? ");
        }while(resp==JOptionPane.OK_OPTION);
        System.out.println("La lista tiene " + miLista.contarElementos() + " elementos.");
        miLista.recorrerLista();
    }
}//End
