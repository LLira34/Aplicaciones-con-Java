/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

/**
 *
 * @author LLira
 */
public class Busquedas {
    
    public static int busquedaBinaria(int[] data, int elem, int start, int end){
        
        //int pos = -1;
        int m = (end+start)/2;
        
        if (start > end) {
            return -1;
        }
        
        if (data[m] == elem) {
            return m;
        }else if(elem<data[m]){//se va a la left a search
            return busquedaBinaria(data, elem, start, m-1);
        }else {
            return busquedaBinaria(data, elem, m+1, end);
        }
        
    }
    
}
