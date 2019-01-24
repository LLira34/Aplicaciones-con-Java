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
public class Textos {
    static String invertir(String texto){
        String salida= "";
        int i =0;
        int tam = texto.length();
        char letra=' ';
        
        for(i =0; i<tam; i++){
            letra= texto.charAt(i);
            salida = letra+salida;
        }
        return salida;
    }

    
}//Fin de la clase
