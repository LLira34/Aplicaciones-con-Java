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
public class TestPersona {
    public static void main(String[] args) {
        Persona p1= new Persona();
        String nombre="";
        String apellidoP="";
        String apellidoM="";
        String fechaNac="";
        JOptionPane.showMessageDialog(null,"Cálculo del RFC");
        nombre= JOptionPane.showInputDialog(null, "Ingrese Nombre");
        apellidoP=JOptionPane.showInputDialog(null, "Ingrese Apellido Paterno");
        apellidoM= JOptionPane.showInputDialog(null, "Ingrese Apellido Materno");
        fechaNac= JOptionPane.showInputDialog(null, "Ingrese Fecha de Nacimiento (dd/mm/aaaa)");
        p1.setNombre(nombre);
        p1.setApellidoP(apellidoP);
        p1.setApellidoM(apellidoM);
        p1.setFechaNac(fechaNac);
        p1.calcularRfc();
        JOptionPane.showMessageDialog(null, "El RFC es: "+p1.getRfc());
    }
    
}
