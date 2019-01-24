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
public class Grupo {
    private int total=0;
    private double promedio=0;
    private int n=0;
    
    public void setN(int n){
        this.n= n;
    }
    public double getPromedio(){
         return promedio;
     }
    
    public void calcularPromedio(){
      promedio=(double)(total)/n;
    		 
     }
    public void leerCalif(){
        int calif=0;
        for(int i=1; i<=n; i++){
            calif=Integer.parseInt(JOptionPane.showInputDialog("Dame calificación: "));
            total+=calif;
        }
    
    }
    
}
