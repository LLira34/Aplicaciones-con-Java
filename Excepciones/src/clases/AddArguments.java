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
public class AddArguments {
    public static void main(String[] args) {
        int suma=0;
        for(String arg : args){
            suma += Integer.parseInt(arg);
        }
        System.out.println("Suma = "+suma);
    }
}//End
