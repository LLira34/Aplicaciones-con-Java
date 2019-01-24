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
public class TestArreglos {
    public static void main(String[] args) {
        Arreglos a1= new Arreglos();
        char[] letras;
        letras= a1.createArreglo();
        //Acceder a los elementos de un arreglo 
        for(int i=0; i<letras.length; i++){
            System.out.print("\t"+letras[i]);
        }
    }
}
