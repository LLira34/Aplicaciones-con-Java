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
public class TestImc {
    public static void main(String[] args) {
        Persona2 p1= new Persona2();
        String nombre;
        double peso=0.0;
        double estatura=0.0;
        String dato="";//Auxiliar de entreda
        
        nombre= JOptionPane.showInputDialog("Nombre?");
        dato= JOptionPane.showInputDialog("Peso?");
        peso= Double.parseDouble(dato);
        dato= JOptionPane.showInputDialog("Estatura?");
        estatura= Double.parseDouble(dato);
        
        p1.setEstatura(estatura);
        p1.setPeso(peso);
        p1.setNombre(nombre.toUpperCase());
        
        p1.calcularImc();
        p1.calcularSalud();
        JOptionPane.showMessageDialog(null,"Usted: "+p1.getNombre()+"\nIMC: "+p1.getImc()+"\nSalud: "+p1.getSalud());
        
    }
}
