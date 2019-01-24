/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import javax.swing.JOptionPane;

/**
 *
 * @author Lira
 */
public class TestGrupo {
    public static void main(String[] args) {
        Grupo g1= new Grupo();
        int tam=0;
        
        tam=Integer.parseInt(JOptionPane.showInputDialog(null, "Dame el tamaño del grupo: "));
        g1.setN(tam);
        g1.leerCalif();
        g1.calcularPromedio();
        JOptionPane.showMessageDialog(null, "El promedio del grupo es de: "+ g1.getPromedio());
        
    }
}
