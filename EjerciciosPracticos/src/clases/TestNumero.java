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
public class TestNumero {
    public static void main(String[] args) {
        int numero=0;
        String texto="";
        numero= Integer.parseInt(JOptionPane.showInputDialog("Numero a convertir?"));
        texto= Numero.convertirATexto(numero);
        JOptionPane.showMessageDialog(null, "El numero es "+texto);
        
    }
    
}
