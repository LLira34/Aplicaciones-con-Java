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
public class Arreglos {
   public char[] createArreglo(){
       char[] s; //Declarando
       
       s= new char[26]; //Creando
       //Inicializando el arreglo 
       for(int i=0; i<=26; i++){
           s[i] = (char) ('A' + i);
       }
       return s;
   }
}//Fin de la clase
