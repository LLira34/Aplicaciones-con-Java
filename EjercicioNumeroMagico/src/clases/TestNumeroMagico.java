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
public class TestNumeroMagico {

    public static void main(String[] args) {
        NumeroMagico nm;
        String nombre = "";
        int numero = 0;

        nombre = JOptionPane.showInputDialog("Como te llamas? ");
        nm = new NumeroMagico(nombre);
        nm.calcularNumero();
        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Dame un numero del 1 al 1000"));

            nm.setValor(numero);
            nm.verificarNumero();
            JOptionPane.showMessageDialog(null, nm.getPista());
        } while (nm.isBanOk() == false && nm.getIntentos() < 15);
        if (nm.isBanOk() == false) {
            JOptionPane.showMessageDialog(null, "El numero es: " + nm.getNumero());
        }
    }

}//Fin
