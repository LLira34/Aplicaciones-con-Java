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
public class TestListaDoble {
    public static void main(String[] args) {
        int resp =0;
        String nombre="";
        NodoD nuevo;
        ListaDoble miLista = new ListaDoble();
        do{
            nombre= JOptionPane.showInputDialog("Elemento a insertar: ");
            nuevo= new NodoD();
            nuevo.setDato(nombre);
            miLista.insertarOrden(nuevo);
            resp= JOptionPane.showConfirmDialog(null, "Deseas insertar otro? ");
        }while(resp==JOptionPane.OK_OPTION);
        System.out.println("Los elementos de la lista son: ");
        miLista.recorrerLista('A');
        System.out.println("");
        miLista.recorrerLista('D');
    }
}//End
