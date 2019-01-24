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
public class Fecha {
    static boolean esBisiesto(int year){
       
        if(year%4==0 && year%100!=0 || year%400==0){
            return true;
        }else{
            return false;
        }
        
        
       
        
   
    }
    
}//Fin clase
