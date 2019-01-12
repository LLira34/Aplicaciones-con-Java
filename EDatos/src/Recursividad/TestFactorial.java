/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursividad;

import javax.swing.JOptionPane;
import Iterativo.Factorial;

/**
 *
 * @author LLira
 */
public class TestFactorial {
    public static void main(String[] args) {
        int num=0;
        long f=0;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Que factorial desea? "));
        f= Iterativo.Factorial.fact(num);
        JOptionPane.showMessageDialog(null, "" + num + "!= " +f);
    }
}
