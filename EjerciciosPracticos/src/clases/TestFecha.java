/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import javax.swing.JOptionPane;

/**
 *
 * @author Lab2
 */
public class TestFecha {

    public static void main(String[] args) {
        int year;
        year = Integer.parseInt(JOptionPane.showInputDialog("Dame un año: "));

        if (Fecha.esBisiesto(year)) {
            JOptionPane.showMessageDialog(null, "El año es bisiesto");
        } else {
            JOptionPane.showMessageDialog(null, "El año no es bisiesto");
        }

    }
}
