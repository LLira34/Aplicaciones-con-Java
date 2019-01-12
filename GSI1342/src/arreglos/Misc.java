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
public class Misc {
    
    /**
     * Método para llenar un arreglo de enteros
     * @param vector Nombre del vector a llenar
     * @return Regresa un arreglo de enteros con los valores asignados
     */
    public static int[] llenarVector(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            vector[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Dame un numero entero prro" + " cuenta = " + (i+1)));
        }
        return vector;
    }
    
    /**
     * Método que suma los elementos contenidos en un vector (arreglo) de enteros
     * @param arreglo El nombre del vector al cual se le efectuara la suma de sus elementos
     * @return Regresa una suma de todos los elementos contenidos en el vector 
     */
    public static int sumaVector(int[] arreglo){
        int suma = 0;
        for (int item : arreglo) {
            suma+= item;
        }
        return suma;
    }
    
}
