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
     * Método que llena arreglos de enteros
     * @param vector
     * @return vector
     */
    public static int[] llenarVector(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            vector[i]= Integer.parseInt(JOptionPane.showInputDialog("Dame elemento " + i));
        }
        return vector;
    }
    
    /**
     * Método que suma los elementos de un vector de enteros
     * @param vector
     * @return sumatoria
     */
    public static int sumarVector(int[] vector){
        int suma=0;
        for (int elemento: vector ) {
            suma += elemento;
        }
        return suma;
    }
}//End
