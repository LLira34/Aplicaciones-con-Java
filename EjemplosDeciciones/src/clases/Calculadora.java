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
public class Calculadora {

    public static void main(String[] args) {
        String operacion = "";
        double num1 = 0.0;
        double num2 = 0.0;
        double resultado = 0.0;
        int ope = 0;//<----

        do {
            operacion = JOptionPane.showInputDialog("Escoge tu operacion: " + "\n1]Sumar" + "\n2]Restar" + "\n3]Multiplicar" + "\n4]Dividir" + "\n5]Salir");
            ope = Integer.parseInt(operacion);
            if (ope>=1&&ope<=4) {
                num1 = Double.parseDouble(JOptionPane.showInputDialog("Dame primer numero"));
                num2 = Double.parseDouble(JOptionPane.showInputDialog("Dame segundo numero"));
            }

            switch (ope) {
                case 1:
                    resultado = num1 + num2;
                    break;
                case 2:
                    resultado = num1 - num2;
                    break;
                case 3:
                    resultado = num1 * num2;
                    break;
                case 4:
                    resultado = num1 / num2;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Operacion invalida");
            }
            JOptionPane.showMessageDialog(null, "El resultado es " + resultado);
        } while (ope != 5);
    }

}//Fin
