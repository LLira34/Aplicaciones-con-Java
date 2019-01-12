/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

import javax.swing.JOptionPane;

/**
 *
 * @author Sergio
 */
public class TestListaSimple {
    
    public static void main(String[] args) {
        
        try {
            javax.swing.UIManager.setLookAndFeel(
                    javax.swing.UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
        }
        
        ListaSimple miLista = new ListaSimple();
        int resp = 0;
        String nombre = "";
        Nodo nuevo;
        
        do{
            nombre = JOptionPane.showInputDialog("Elemento a insertar");
            nuevo = new Nodo(nombre);
            miLista.insertarNodoLast(nuevo);
            resp = JOptionPane.showConfirmDialog(null, "Deseas insertar otro nombre?");
        }while(resp==JOptionPane.OK_OPTION);
        JOptionPane.showMessageDialog(null, "la lista tiene " + miLista.contarElemsLista() + " elementos");
        miLista.recorrerLista();
    }
    
}
