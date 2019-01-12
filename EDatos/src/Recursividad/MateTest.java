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
public class MateTest {
    public static void main(String[] args) {
        int x=0;
        int y=0;
        int r=0;
        
        x= Integer.parseInt(JOptionPane.showInputDialog("Primer numero"));
        y= Integer.parseInt(JOptionPane.showInputDialog("Segundo numero"));
        
        r= Mate.fm(x, y);
        //System.out.println("" + x + " X " + y + " = " + r);
        JOptionPane.showMessageDialog(null, "El resultado es " + x + " entre " + y + " es " + r);
    }
}
