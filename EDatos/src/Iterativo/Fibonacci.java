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
public class Fibonacci {
   public static void iter(int num){
       int a =0; //Limite para inicio
       int b =1; //Limite para la secuencia
       int fibo = a + b; //Secuencia del Fibonacci
       
       for(int i=1; i<=num; i++){
           System.out.println(fibo); //Mostrará el numero del Fibonacci
           fibo = (a + b);
           a = b;
           b = fibo;
       }
   }
}//End class
