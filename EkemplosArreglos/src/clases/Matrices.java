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
public class Matrices {
    public static int[][] sumar(int[][] a, int[][] b){
        int [][] c= new int [a.length][a[0].length];
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                c[i][j]= a[i][j]+b[i][j];
            }
        }
        return c;
    }
    public static void mostrar(int[][] a){
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                System.out.println("\t"+a[i][j]);
            }
            System.out.println("");
        }
    }
}//End
