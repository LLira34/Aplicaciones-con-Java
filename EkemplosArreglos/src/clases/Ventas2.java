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
public class Ventas2 {
    private int[][] ventas; //Declaracion
    private int ventasTotales;
    
    public Ventas2(){
        ventas= new int[5][4];
    }
    
    public void setVentas(int year, int trim, int valor){
        ventas[year][trim]= valor;
    }
    
    public void calcularVentasTotales(){
        for(int i=0; i<5; i++){
            for(int j=0; j<4; j++){
                ventasTotales+= ventas[i][j];
            }
        }
    }
    
    public int getVentasTotales(){
        return ventasTotales;
    }
    
    public void mostrarDatos(){
        for(int i=0; i<ventas.length; i++){ //Numero de arreglos o filas
            for(int j=0; j<ventas[i].length; j++){ //Nuemrm de elementos de esa filas o arreglos
                System.out.print("\t"+ventas[i][j]);
            }
            System.out.println("");
        }
    }
    
       
    
}//End
