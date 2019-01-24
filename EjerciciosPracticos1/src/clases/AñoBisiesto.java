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
public class AñoBisiesto {
    public static void main(String[] args) {
        int num=0;
        num=Integer.parseInt(JOptionPane.showInputDialog(null, "Dame un año:"));
        if(Fecha.esBisiesto(num)){
            JOptionPane.showMessageDialog(null, "El año es bisiesto");
        }else{
            JOptionPane.showMessageDialog(null,"El año no es bisiesto");
        }
    }
}
