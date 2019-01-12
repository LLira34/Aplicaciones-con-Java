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
public class InsercionDirectaTest {
    public static void main(String[] args) {
        int[] datos;
        int tam;
        tam= Integer.parseInt(JOptionPane.showInputDialog("Cuántos elementos tiene tu arreglo? "));
        //Creacion de arreglo
        datos= new int[tam];
        //Ciclo de lectura
        for (int i = 0; i < tam; i++) {
            datos[i]= Integer.parseInt(JOptionPane.showInputDialog("Elemento "+(i+1)+": "));
        }
        Ordenamientos.insercionDirecta(datos);
        
    }
}//End
