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
        Persona2 p1 = new Persona2();
        String nombre = "";
        double peso = 0.0;
        double estatura = 0.0;
        String dato = ""; 
        boolean canContinue = false; 

        nombre = JOptionPane.showInputDialog("Nombre?");

        
        do {
            try {
                dato = JOptionPane.showInputDialog("Peso?");
                peso = Double.parseDouble(dato);                 
                canContinue = true;
            } catch (java.lang.NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error, debe de ser un valor númerico");
                canContinue = false;
            } catch (java.lang.NullPointerException e) {
                JOptionPane.showMessageDialog(null, "Por favor instrodusca un dato");
                canContinue = false;
            }
        } while (!canContinue);

        do {
            try {
                canContinue = false;
                dato = JOptionPane.showInputDialog("Estatura?");
                estatura = Double.parseDouble(dato);             
                canContinue = true;
            } catch (java.lang.NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error, debe de ser un valor númerico");
                canContinue = false;
            } catch (java.lang.NullPointerException e) {
                JOptionPane.showMessageDialog(null, "Por favor instrodusca un dato");
                canContinue = false;
            }
        } while (!canContinue);

        p1.setEstatura(estatura);
        p1.setPeso(peso);
        

        p1.calcularImc();
        p1.calcularSalud();
        JOptionPane.showMessageDialog(
                null, "IMC: " + p1.getImc() + "\nSalud: " + p1.getSalud());
    }
}
