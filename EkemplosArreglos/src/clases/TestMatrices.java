/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Scanner;

/**
 *
 * @author Lab2
 */
public class TestMatrices {

    public static void main(String[] args) {
        int[][] m1 = new int[3][4];
        int[][] m2 = new int[3][4];
        int[][] m3;
        Scanner teclado= new Scanner (System.in);

        //entrada de datos primera matriz
        System.out.print("Datos de la primera matriz");
        for (int i = 0; i < 3; i++) {
            for(int j=0; j<4; j++){
                System.out.print("Dato ["+i+", "+j+"]?");
                m1[i][j]= teclado.nextInt();
            }
        }
        
        System.out.print("Datos de la segunda matriz");
        for (int i = 0; i < 3; i++) {
            for(int j=0; j<4; j++){
                System.out.print("Dato ["+i+", "+j+"]?");
                m2[i][j]= teclado.nextInt();
            }
        }
        
        //Calculando
        m3=Matrices.sumar(m1, m2);
        
        //Mostrando resultados
        System.out.println("Matriz A");
        Matrices.mostrar(m1);
        System.out.println("Matriz B");
        Matrices.mostrar(m2);
        System.out.println("La primera Matriz resultante es: ");
        Matrices.mostrar(m3);
    }

}//End
