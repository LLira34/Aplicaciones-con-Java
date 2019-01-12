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
public class Ejercicio {
    public static int fa(int n){
        if(n==0){
            return 1;
        }else {
            return (int)Math.pow(2, n) + fa (n-1);
        }
    }
}//End
