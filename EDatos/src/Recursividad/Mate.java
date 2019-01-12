/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursividad;

/**
 *
 * @author LLira
 */
public class Mate {
    /**
     * Metodo recursivo que calcula el producto de dos numeros enteros
     * @param a primer numero
     * @param b segundo numero
     * @return  entero
     */
    public static int fm(int a, int b){
        if(a == 0){
            return 0;
        }else{
            return fm(a-1, b ) + b;
        }
    }
    
    public static int pot(int a, int b){
        if(b == 0){
            return 1;
        }else{
            return pot(a, b-1) * a;
        }
    }
}//End
