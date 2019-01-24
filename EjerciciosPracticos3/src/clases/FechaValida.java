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
public class FechaValida {
     public static void main(String[] args) {
        int mes = 0;
        int dias = 0;

        mes = Integer.parseInt(JOptionPane.showInputDialog("Que mes desea?"
                + "\n1]Enero"
                + "\n2]Febrero"
                + "\n3]Marzo"
                + "\n4]Abril"
                + "\n5] Mayo"
                + "\n6]Junio"
                + "\n7]Julio"
                + "\n8]Agosto"
                + "\n9]Septiembre"
                + "\n10]Octubre"
                + "\n11]Nomviembre"
                + "\n12]Diciembre"));

        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dias = 31;
                break;
            case 2:
                dias = 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dias = 30;
                break;
            default:
                JOptionPane.showMessageDialog(null, "No existe ese mes");
                break;
        }//Fin del switch

        JOptionPane.showMessageDialog(null, "El mes tiene: " + dias + " días");

    }
}
