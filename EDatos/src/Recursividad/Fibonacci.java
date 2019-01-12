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
public class Fibonacci {
    public static int fibo(int n){
        /*
        if(n==0 || n==1){
            return n;
        }else{
            return fibo(n-2) + fibo (n-1);
        }*/
        
        if(n==0){
            return 0;
        }else if (n==1){
            return 1;
        }else{
            return fibo(n-2) + fibo (n-1);
        }
    }
}//End
