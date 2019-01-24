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
public class TestVentas2 {
    public static void main(String[] args) {
        Ventas2 v2= new Ventas2();
        v2.setVentas(0, 0, 1000);
        v2.setVentas(0, 1, 1500);
        v2.setVentas(0, 2, 1800);
        v2.setVentas(1, 0, 1000);
        v2.setVentas(2, 0, 1400);
        v2.setVentas(3, 3, 2000);
        
        v2.calcularVentasTotales();
        v2.mostrarDatos();
        System.out.println("Las ventas totales son "+v2.getVentasTotales());
    }
    
}//End
