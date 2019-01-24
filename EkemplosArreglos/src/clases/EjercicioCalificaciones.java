/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Lab2
 */
public class EjercicioCalificaciones {
    public static void main(String[] args) {
        double [] calificaciones; //Declarando
        int n=0;
        double promedio=0.0; //<---
        int suma=0; //<---
        DecimalFormat df= new DecimalFormat("0.00");
        
        n= Integer.parseInt(JOptionPane.showInputDialog("Cuantos alumnos tienes?"));
        calificaciones= new double[n]; //Creacion del arreglo
        for(int i=0; i<n; i++){
            calificaciones[i]= Double.parseDouble(JOptionPane.showInputDialog("Dame calificacion "+(i+1)));
            suma+= calificaciones[i];
        }
        promedio= (double)suma/n;
        JOptionPane.showMessageDialog(null, "El promedio del grupo es "+df.format(promedio));
    }
    
    
}//End
