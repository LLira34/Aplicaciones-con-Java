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
public class MesesDias {
    public static void main(String[] args) {
        int mes=0;
        int dias=0;
        
        mes= Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de mes"));
        switch(mes){
            case 1:
                dias = 31;
                break;
            case 2:
                dias = 28;
                break;    
            case 3:
                dias = 31;
                break;
            case 4:
                dias = 30;
                break; 
            case 5:
                dias = 31;
                break;
            case 6:
                dias = 30;
                break;
            case 7:
                dias = 31;
                break;
            case 8:
                dias = 31;
                break;
            case 9:
                dias = 30;
                break;
            case 10:
                dias = 31;
                break;
            case 11:
                dias = 30;
                break;
            case 12:
                dias = 31;
                break; 
                
            default :
                JOptionPane.showMessageDialog(null, "Mes no válido!");  
        }
        JOptionPane.showMessageDialog(null,"El mes tiene "+dias+" días");
    }
    
}//Fin clase
