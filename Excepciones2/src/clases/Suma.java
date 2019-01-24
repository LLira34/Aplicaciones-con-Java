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
public class Suma {

    static int num1;
    static int num2;
    static int resultado;

    public static void main(String[] args) {
        boolean banOk = false;
        do {
            try {
                leerNumeros();
                banOk = true;
                calcularSuma();
                mostrarResultados();
            } catch (NumberFormatException e) {
                System.err.println("Error de entrada de datos, debe ser entero");
            }
        } while (!banOk);
    }

    public static void leerNumeros() throws NumberFormatException {
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Dame primer numero: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Dame segundo numero: "));
    }

    public static void calcularSuma() {
        resultado = num1 + num2;
    }

    public static void mostrarResultados() {
        JOptionPane.showMessageDialog(null, "La suma es: " + resultado);
    }
}//End
