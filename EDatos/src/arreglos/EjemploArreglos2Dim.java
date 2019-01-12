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
        double[][] calif; //Declaración arreglos con las calificaciones de todas las materias de los primeros 4 cuatrimestres
        double [] prom; //Declaracion vector con los promedios de cada cuatrimestre 
        double promGral;
        calif = new double[4][]; //Construye el arreglo
        calif[0] = new double[8];
        calif[1] = new double[7];
        calif[2] = new double[8];
        calif[3] = new double[6];
        
        lecturaDatos(calif);
        prom= calcularPromedios(calif);
        //Listado de calificaciones
        for (int i = 0; i < calif.length; i++) { //recorrido por filas
            for (int j = 0; j < calif[i].length; j++) {
                System.out.print("" + calif[i][j] + "\t");
            }
            System.out.println("");
        }
        //Listado de promedios
        for (int i = 0; i < prom.length; i++) {
            System.out.println("Promedio de cuatrimestre " + (i+1)+ " = " + prom[i]);
        }
    }
    
    public static void lecturaDatos(double[][] datos){
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                datos[i][j] = Double.parseDouble(JOptionPane.showInputDialog(
                        "Dame calificaicion del cuatrimestre " + (i+1) + " \nMateria " + (j+1)));
                
            }
        }
    }
    
    public static double[]calcularPromedios(double[][] datos){
        double[] prom = new double[4];
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                prom[i] += datos[i][j];
            }
            prom[i]/= datos[i].length;
        }
        return prom;
    }
    
    public static double calcularPromedioGral(double[] promedios){
        return 0;
        
    }
    
}//End
