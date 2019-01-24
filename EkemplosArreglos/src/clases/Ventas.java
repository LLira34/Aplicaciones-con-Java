/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Lab2
 */
public class Ventas {
    private double[] ventas= new double [12];
    private double total;
    private double maxima;

    public void setVentas(int mes, double monto) {
        ventas[mes-1]= monto;
    }
    
    public void calcularTotal(){
        for(int i=0; i<12; i++){
        total+= ventas[i];
        }
    }

    public double getTotal() {
        return total;
    }

    public double getVentas(int mes) {
        return ventas[mes-1];
    }
    
}//End
