/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilas;

import javax.swing.JOptionPane;

/**
 *
 * @author LLira
 */
public class TestNotaciones {
    public static void main(String[] args) {
        String infija;
        String postfija;
        infija= JOptionPane.showInputDialog(null, "Introducir tu expresión Infija");
        postfija= Notaciones.convertirInToPost(infija);
        JOptionPane.showMessageDialog(null, "Notación postfija : " + postfija);
    }
}//End
