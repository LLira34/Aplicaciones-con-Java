/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.Scanner;

/**
 *
 * @author DLira
 */
public class Matrix {
    public static void main(String[] args) {
        int matrix [][] = new int [3][3];
        
        //row one
        matrix[0][0] = 5;
        matrix[0][1] = 8;
        matrix[0][2] = 1;
        
        //row two
        matrix[1][0] = 9;
        matrix[1][1] = 7;
        matrix[1][2] = 2;
        
        //row three
        matrix[2][0] = 10;
        matrix[2][1] = 15;
        matrix[2][2] = 25;
        
        Scanner inside = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.println("Insert to item");
                matrix[i][j] = inside.nextInt();
            }
        }
    }
}//End
