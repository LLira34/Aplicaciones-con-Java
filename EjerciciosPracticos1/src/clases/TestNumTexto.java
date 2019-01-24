/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import javax.swing.JOptionPane;

/**
 *
 * @author Lira
 */
public class TestNumTexto {
    public static void main(String[] args) {
        NumTexto t1= new NumTexto();
        int valor=0;
        
        t1.setNum(valor=Integer.parseInt(JOptionPane.showInputDialog("Dame un numero: ")));
        t1.calcularTexto();
         JOptionPane.showMessageDialog(null, t1.getTexto());
    }
}
