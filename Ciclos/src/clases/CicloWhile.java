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
public class CicloWhile {

    public static void main(String[] args) {
        int a = 1;
        //Ciclo infinito, imprime puros 1's
//        while(a<5){
//            System.out.println(a);
//        }
        //Este ciclo imprime de 1 al 4
//        while(a<=5){
//            System.out.println(a);
//            a++;
//        }
            //Se cicla sin hacer nada
//         while(a<=5); {
//            System.out.println(a);
//            a++;
//        }
          while (a<=5){
              System.out.println(a++);
          }  
    }

}//Fin
