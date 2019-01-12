/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursividad;

import javax.swing.JOptionPane;

/**
 *
 * @author LLira
 */
public class FaTest {
    public static void main(String[] args) {
        int n=0;
        int x=0;
        
        n= Integer.parseInt(JOptionPane.showInputDialog("Numero?"));
        x= Ejercicio.fa(n);
        JOptionPane.showMessageDialog(null, "El resultado es: " + x);
        //System.out.println("El resultado es: " + x);
    }
}//End
