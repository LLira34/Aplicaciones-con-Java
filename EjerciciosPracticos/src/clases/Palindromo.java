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
public class Palindromo {
    public static String invertir(String texto){
       
        String salida="";
        for(int i=texto.length()-1; i>=0; i--){// Se lee la longitud de la cadena(menos 1, para evitar un error),y se asigana a la i, si i es mayor es igual 0, se va a ir restando, y se ira pegando a la varialbe salida.
        }
        return salida; //Se retorna la variable para que se use en le metodo main. 
    }
    public static String calcularPalindromo(String texto){
        String resp;
        String sal1=Textos.invertir(texto);//se declara una nueva variable del metodo anterior
        if(texto.equals(sal1)){//Se compara el texto con la nueva variable declarada, resultante del metodo anterior
            resp=sal1+ "\n Es un palindromo";
        }else{
           resp=sal1+ "\n No es un palindromo";
        }
     return resp;  //Se tiene que retornarla la variable cuando se este utlizando en la clase main. 
    }
}//Fin clase
