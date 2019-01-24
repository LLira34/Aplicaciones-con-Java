/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import javax.swing.JOptionPane;

/**
 *
 * @author Lira
 */
public class TestMedia {

    public static void main(String[] args) {
        Media m1 = new Media();

        float a = 0f;
        float b = 0f;
        float c = 0f;
        float d = 0f;

        m1.setNum1(a = Float.parseFloat(JOptionPane.showInputDialog("Dame el primer numero: ")));
        m1.setNum2(b = Float.parseFloat(JOptionPane.showInputDialog("Dame el segundo numero: ")));
        m1.setNum3(c = Float.parseFloat(JOptionPane.showInputDialog("Dame el tercer numero: ")));
        m1.setNum4(c = Float.parseFloat(JOptionPane.showInputDialog("Dame el cuarto numero: ")));

        JOptionPane.showMessageDialog(null, "La media es: "+ m1.calcularMedia());

    }
}
