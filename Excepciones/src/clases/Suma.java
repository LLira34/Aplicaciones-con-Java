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
public class Suma {

    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        int resultado = 0;
        boolean ban = false;

        do {
            //Entrada
            try {
                num1 = Integer.parseInt(JOptionPane.showInputDialog("Dame primer numero"));
                num2 = Integer.parseInt(JOptionPane.showInputDialog("Dame segundo numero"));
                ban = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error de entrada, debe ser un entero, pendejo");
            }
        } while (!ban); //Mientras sea falso

        //Calculo
        resultado = num1 + num2;

        //Salida
        JOptionPane.showMessageDialog(null, "La suma es: " + resultado);
    }
}//End
