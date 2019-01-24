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
public class TestImc {
    public static void main(String[] args) {
        Persona2 p1= new Persona2();
        String nombre="";
        double peso=0.0;
        double estatura=0.0;
        String dato=""; //auxiliar de entrada
        
        nombre= JOptionPane.showInputDialog("Nombre?");
        dato= JOptionPane.showInputDialog("Peso?");
        peso= Double.parseDouble(dato);
        dato= JOptionPane.showInputDialog("Estatura?");
        estatura= Double.parseDouble(dato);
        
        p1.setEstatura(estatura);
        p1.setPeso(peso);
        p1.setNombre(nombre);
        
        p1.calcularImc();
        p1.calcularSalud();
        JOptionPane.showMessageDialog(
          null,"IMC: "+p1.getImc()+"\nSalud: "+p1.getSalud());
    }
}
