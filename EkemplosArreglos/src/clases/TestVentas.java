/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Lab2
 */
public class TestVentas {
    public static void main(String[] args) {
        Ventas v1= new Ventas();
        double venta=0.0;
        DecimalFormat df= new DecimalFormat("$#,###.00");
        
        for(int i=1; i<=12; i++){
            venta= Double.parseDouble(JOptionPane.showInputDialog("Ventas del mes "+i));
            v1.setVentas(i, venta);
        }
        v1.calcularTotal();
        JOptionPane.showMessageDialog(null, "El total de ventas es "+df.format(v1.getTotal()));
    }
}//End
