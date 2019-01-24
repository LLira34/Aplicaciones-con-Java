/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import javax.swing.JOptionPane;

/**
 *
 * @author ATrejo
 */
public class Calculadora {

    public static void main(String[] args) {
        String operacion = "";
        double num1 = 0.0;
        double num2 = 0.0;
        double resultado = 0.0;
        int ope = 0;//<----
        do {
            operacion = JOptionPane.showInputDialog("Escoge tu operación:"
                    + "\n1]SUMAR"
                    + "\n2]RESTAR"
                    + "\n3]MULTIPLICAR"
                    + "\n4]DIVIDIR"
                    + "\n5]SALIR");
            try {
                ope = Integer.parseInt(operacion);//<-----
                try {
                    if (ope >= 1 && ope <= 4) {  //<---
                        num1 = Double.parseDouble(JOptionPane.showInputDialog(
                                "Dame primer número:"));
                        num2 = Double.parseDouble(JOptionPane.showInputDialog(
                                "Dame segundo número:"));
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Error, la entrada debe ser un valor numérico");
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
                    case 5:
                        JOptionPane.showMessageDialog(null, "Game Over");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Operación invalida");
                }
                JOptionPane.showMessageDialog(null, "El resultado es " + resultado);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error, deben ser numeros enteros");
            }
        } while (ope != 5);
    }
}//End
