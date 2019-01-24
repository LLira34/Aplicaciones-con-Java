/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Lira
 */
public class Textos {

public static String invertir(String texto) {

        String salida = "";
        
        for (int i = texto.length() - 1; i >= 0; i--) {// Se lee la longitud de la cadena(menos 1, para evitar un error),y se asigana a la i, si i es mayor es igual 0, se va a ir restando, y se ira pegando a la varialbe salida.
        salida+=texto.charAt(i);
        }
        return salida; 
    }

    public static String calcularPalindromo(String texto) {
        String resp;
        String sal1 = Textos.invertir(texto);
        if (texto.equalsIgnoreCase(sal1)) {//Se compara el texto con la nueva variable declarada, resultante del metodo anterior
            resp = "Es un palindromo "+ sal1;
        } else {
            resp = "No es un palindromo "+ sal1 ;
        }
        return resp;   
    }
    public static int calcularFrase(String texto){

        int cont = 0; //Contador de las palabras
        String resp = ""; 
        
        if(!texto.isEmpty()){ 
            cont = 1;
        }
        
        for(int i = 0; i <= texto.length(); i++){ 
            
            resp = texto.substring(i);  
                                        
            if(resp.startsWith(" ")){  
                cont++;                
            }
            
            
        }
        
        return cont;
        
    }
}
