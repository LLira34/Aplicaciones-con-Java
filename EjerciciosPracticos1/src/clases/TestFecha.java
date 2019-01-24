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
public class TestFecha {
    public static void main(String[] args) {
        
        String fecha="";
        int dias=0;
        int mes=0;
        int año=0;
        
        mes=Integer.parseInt(JOptionPane.showInputDialog(null, "Dame el mes: "));
        año=Integer.parseInt(JOptionPane.showInputDialog(null, "Dame el año: "));
        
        JOptionPane.showMessageDialog(null, "El mes tiene: " + Fecha.calcularDias(mes, año)+ " dias");
//        fecha=JOptionPane.showInputDialog(null, "Dame la fecha: ");
//       
//          
//        if(Fecha.esValida(fecha)){
//            JOptionPane.showMessageDialog(null, "La fecha es válida, el mes tiene: " + Fecha.calcularDias(mes, dias)+ "dias");
//           
//        }else{
//            JOptionPane.showMessageDialog(null, "La fecha no es válida");
//        }
        
    }
}

