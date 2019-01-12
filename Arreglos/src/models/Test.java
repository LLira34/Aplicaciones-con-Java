/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author DLira
 */
public class Test {
    public static void main(String[] args) {
        //Declared of arrays and instance
        int x[] = new int[3];
        
        //Initialization arrays
        x[0] = 10;
        x[1] = 5;
        x[2] = 19;
        
        //Print
        for (int i = 0; i < x.length; i++) {
            System.out.println("Array on index: " + i + " it's:" + x[i]);
        }
    }
}//End
