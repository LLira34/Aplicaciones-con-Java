/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import javax.swing.JOptionPane;

/**
 *
 * @author Alondra
 */
public class CuentaBancariaTest {

    public static void main(String[] args) {
        CuentaBancaria cb1 = new CuentaBancaria();
        int op = 0;
        double monto = 0.0;
        do {
            try{
            op = Integer.parseInt(JOptionPane.showInputDialog("Menú"
                    + "\n 1] Depositar"
                    + "\n 2] Retirar"
                    + "\n 3] Consultar"
                    + "\n 4] Salir"));
            
            switch (op) {
                case 1:
                    try{
                    monto = Double.parseDouble(
                            JOptionPane.showInputDialog("Cuanto desea depositar? "));
                    cb1.ingresar(monto);
                    JOptionPane.showMessageDialog(null, cb1.mostrarInfo());
                    }catch(java.lang.NumberFormatException e){
                        JOptionPane.showMessageDialog(null,"Error, debe de ser un valor númerico");
                    }
                    break; 
                    case 2:
                    try{
                    monto = Double.parseDouble(
                            JOptionPane.showInputDialog("Cuanto desea retirar? "));
                    JOptionPane.showMessageDialog(null, cb1.restirar(monto));
                    }catch(java.lang.NumberFormatException e){
                        JOptionPane.showMessageDialog(null,"Error, debe de ser un valor númerico");
                    }
                    break;
                    
                case 3:
                    JOptionPane.showMessageDialog(null, cb1.mostrarInfo());
                     break;          
                default:
                    JOptionPane.showMessageDialog(null, "Opción no validad");
            }
            }catch(java.lang.NumberFormatException e){
                JOptionPane.showMessageDialog(null,"ERROR, las opciones validas son del 1 al 4");
            }
        } while (op != 4);
        JOptionPane.showMessageDialog(null, "Gracias por su preferencia");
        
        

    }

}
