/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import javax.swing.JOptionPane;

/**
 *
 * @author Alondra
 */
public class TestFecha {
    public static void main(String[] args) {
        String fecha="";
        
        fecha=JOptionPane.showInputDialog("Dame la fecha: ");
        
        if(Fecha.esValida(fecha)){
            JOptionPane.showMessageDialog(null, "La fecha es válida");
        }else{
            JOptionPane.showMessageDialog(null, "La fecha no es válida");
        }
        
    }
}
