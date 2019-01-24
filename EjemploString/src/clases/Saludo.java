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
public class Saludo {
    public static void main(String [] args){
        String cadena1=null; //Declaracion (Reservando el espacio) (Al no tener nada es null)
        String cadena3;
        String cadena4;
        int tam=0;
        int pos=0;
        char letra;
        
        cadena1="Lira Korver";
        tam= cadena1.length(); //Tamaño de la cadena
        cadena3= cadena1.toUpperCase();
        cadena4= cadena3.toLowerCase();
        System.out.println(cadena1);
        System.out.println("tamaño: "+tam);
        System.out.println(cadena3);
        System.out.println(cadena4);
        pos= cadena1.indexOf("ve");
        System.out.println("Posicion: "+pos);
        letra= cadena1.charAt(0);
        System.out.println("Letra: "+letra);
        for(int i=0;i<tam;i++){
            letra= cadena1.charAt(i);
            System.out.println(letra);
        }
        cadena4= cadena1.substring(5);
        System.out.println(cadena4);
        String nombre= cadena1.substring(0, 4);
        System.out.println(nombre);
        
        /* //Comentario de bloque
        cadena1= new String ("Hola "); //Instanciacion (Crear objeto)
        String cadena2= "Mundo";
        System.out.println(cadena1);
        System.out.println(cadena2);
        
        cadena3= cadena1.concat(cadena2);
        System.out.println(cadena3);
        cadena4= cadena3.concat(" UTNG");
        //cadena4= cadena3+" UTNG";
        //System.out.println(cadena3 +" UTNG");
        System.out.println(cadena4);
        
        tam=cadena3.length();
        System.out.println("La cadena \""+cadena3+"\" tiene "+tam+" letras");
        */
        
    }
}
 