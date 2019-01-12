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
public class FibonacciTest {
    public static void main(String[] args) {
        int n=2;
        int f=0;
        
        f= Fibonacci.fibo(n);
        //System.out.println("Fibo (" +n+")= " + f);
        JOptionPane.showMessageDialog(null, ("Fibo (" +n+ ")= " + f));
    }
}
