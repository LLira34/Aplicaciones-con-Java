/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iterativo;

/**
 *
 * @author LLira
 */
public class Factorial {
    public static long fact(int n){
        int f=1;
        for(int i=1; i<n; i++){
            f*= i; //f = f*i
        }
        return f;
    }
    
    
}//End
