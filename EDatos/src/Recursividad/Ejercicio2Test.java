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
public class Ejercicio2Test {
    public static void main(String[] args) {
        int n=0;
        int m=0;
        int r=0;
        
        n= Integer.parseInt(JOptionPane.showInputDialog("Primer numero"));
        m= Integer.parseInt(JOptionPane.showInputDialog("Segundo numero"));
        
        r= Ejercicio2.residuoDiv(n,m);
        JOptionPane.showMessageDialog(null, "El resultado es " + n + " entre " + m + " es " + r);
    }
}
