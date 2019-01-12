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
public class BurbujaTest {
    public static void main(String[] args) {
        int[] data;
        int tam;
        tam = Integer.parseInt(JOptionPane.showInputDialog(null, "Tamaño del arreglo?"));
        //creating array
        data = new int[tam];
        //Ciclo read
        for (int i = 0; i < tam; i++) {
            data[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Elemento " + (i+1) + ":"));
        }
        //Ordenamientos.burbuja(data);
        Ordenamientos.upgradedBubble(data);
    }
}
