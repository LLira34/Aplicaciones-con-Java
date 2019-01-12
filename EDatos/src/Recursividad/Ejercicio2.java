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
public class Ejercicio2 {
    public static int residuoDiv (int n, int m){
        if(n < m){
            return n;
        }else{
            return residuoDiv(n - m, m);
        }
    }
}//End
