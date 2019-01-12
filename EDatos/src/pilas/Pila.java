/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilas;

/**
 *
 * @author LLira
 */
public class Pila {
    private char[] datos;
    private int tope;
    
    public Pila(int tam){
        datos= new char[tam];
        tope = -1; //Pila vacía
    }
    
    /**
     * Método que permite meter un elemento en la pila
     * @param elemento tipo char
     */
    public void push(char elemento){
        datos[++tope]= elemento;
    }
    
    /**
     * Método que permite sacar un elemento de la pila
     * @return elemento tipo char
     */
    public char pop(){
        return datos[tope--];
    }
    
    /**
     * Método que permite mirar el elemento  que se encuentra en el tope de la 
     * pila
     * @return 
     */
    public char seek(){
        return tope >-1 ? datos[tope] : ' ';
    }
    
    /**
     * Método que indica si la pila esta vacia
     * @return true=´pila vacia, false=pila con elemento 
     */
    public boolean isEmpty(){
        return (tope==-1);
    }
    
    /**
     * Método que indica si la pila está llena
     * @return true= pila llena; false= pila con elemento
     */
    public boolean isFull(){
        return (tope==datos.length-1);
    }
    
    
    
    
}//End
