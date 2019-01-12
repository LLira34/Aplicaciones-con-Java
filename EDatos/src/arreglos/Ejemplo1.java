/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

import javax.swing.JOptionPane;

/**
 *
 * @author LLira
 */
public class Ejemplo1 {
    public static void main(String[] args) {
        int[] datos; //Declaracion del arreglo
        datos = new int[10]; //Creacion del arreglo
        int suma = 0;

        //Llenado del vector
        datos = Misc.llenarVector(datos);

        //Calculo de la suma de todos los elementos
        suma = Misc.sumarVector(datos);
        JOptionPane.showMessageDialog(null, "La suma es: " + suma);
    }
}//End
