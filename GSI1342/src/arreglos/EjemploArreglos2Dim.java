/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

import javax.swing.JOptionPane;

/**
 *
 * @author LLira
 */
public class EjemploArreglos2Dim {
    
    public static void main(String[] args) {
        double[][] calif;
        double[] prom; //declaracion de un vectorZ
        calif = new double[4][]; //Generates the arrayZ (una matriz)
        calif[0] = new double[7];
        calif[1] = new double[7];
        calif[2] = new double[8];
        calif[3] = new double[6];
        
        lecturaDatos(calif);
        
        prom = calcularProms(calif);
        
        for (int i = 0; i < calif.length; i++) { //Recorrido by filas
            
            for (int j = 0; j < calif[i].length; j++) {
                System.out.print(""+calif[i][j]+"\t");
            }
            System.out.println("");
        }
        //litar proms
        
        for (int i = 0; i < prom.length; i++) {
            System.out.println("Promedio del cuatrimestre " + (i+1) +" : " + prom[i]);
        }
    }
    
    public static void lecturaDatos (double[][] datos){
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                datos[i][j] = Double.parseDouble(JOptionPane.showInputDialog(null, "Dame calificacion del " + (i+1) + " \ny materia " + (j+1)));
            }
        }
    }
    
    public static double[] calcularProms(double[][] datos){
        
        double[] prom = new double[4];
        
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                prom[i]+=datos[i][j];
            }
            prom[i]/=datos[i].length;
        }
        return prom;
    }
    
}
