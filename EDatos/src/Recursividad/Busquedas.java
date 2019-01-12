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
public class Busquedas {
    public static boolean busquedaBin(int[] datos, int inicio, int fin, int valor){
        int mitad;
        mitad = (inicio + fin) / 2;
        if(datos[mitad] == valor){
            return true;
        }else if (inicio == fin){
            return false;
        }else{
            if (valor < datos[mitad]){
                //Busqueda del lado izquierdo de la mitad
                return busquedaBin(datos, inicio, mitad-1, valor);
            }else {
                //Busqueda del lado derecho 
                return busquedaBin(datos, mitad+1, fin, valor);
            }
        }
    }
    /**
     * Metodo que busca un valor en el arreglo por medio del algoritmo
     * Divide y vencerás.
     * @param datos arreglo de enteros
     * @param inicio posicion inicial del arreglo
     * @param fin posicion final del arreglo
     * @param valor elemento a buscar
     * @return  la posicion del elemento del valor a buscar, en caso de no encontrarse devuelve -1
     */
    
    public static int busquedaBin2(int[] datos, int inicio, int fin, int valor){
        int mitad;
        mitad = (inicio + fin) / 2;
        if(datos[mitad] == valor){
            return mitad;
        }else if (inicio == fin){
            return -1;
        }else{
            if (valor < datos[mitad]){
                //Busqueda del lado izquierdo de la mitad
                return busquedaBin2(datos, inicio, mitad-1, valor);
            }else {
                //Busqueda del lado derecho 
                return busquedaBin2(datos, mitad+1, fin, valor);
            }
        }
    }
}//End
