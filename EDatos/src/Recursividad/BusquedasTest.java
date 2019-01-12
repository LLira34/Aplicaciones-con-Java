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
public class BusquedasTest {
    public static void main(String[] args) {
      int[] arreglo = {9, 14, 18, 21, 30, 32};
      int x= 30;
      boolean banOk;
      int pos;
      
      banOk= Busquedas.busquedaBin(arreglo, 0, arreglo.length-1, x);
      if(banOk){
          System.out.println("El valor " + x + " Si se encuentra en el arreglo");
      }else{
          System.out.println("El valor " + x + " No se encuentra en el arreglo");
      }
      
      pos= Busquedas.busquedaBin2(arreglo, 0, arreglo.length-1, x);
      if(pos!=-1){
            System.out.println("El valor " + x + " se encuentra la posicion " + pos + " arreglo");
      }else{
          System.out.println("El valor " + x + " No se encuentra en el arreglo");
      }
        
    }
}//End
