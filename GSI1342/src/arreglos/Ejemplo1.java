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
        
        int[] datos; //Declaracion de un arreglo de intz
        datos = new int [10]; //Creacion del arreglo
        int suma = 0;
        
        datos = Misc.llenarVector(datos);
        
        
        //Calculacion de las weas fomes para sumar de todo el arrayZ anteriorZ
        
        
        JOptionPane.showMessageDialog(null, "La suma del arrayZ es: " + Misc.sumaVector(datos));
        
    }
}
