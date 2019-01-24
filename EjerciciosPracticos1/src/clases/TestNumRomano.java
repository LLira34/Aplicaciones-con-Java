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
public class TestNumRomano {
    public static void main(String[] args) {
        NumRomano r1= new NumRomano();
        int valor = 0;
        
        r1.setNum(valor=Integer.parseInt(JOptionPane.showInputDialog("Dame un numero: ")));
        r1.calcularRomano();
        JOptionPane.showMessageDialog(null, r1.getRomano());
       
        
    }
}
