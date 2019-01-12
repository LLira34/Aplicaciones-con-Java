/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author LLira
 */
public class Pila {
    private int tope;
    private char[] datos;
    
    public Pila(int tam){
        datos= new char[tam];
        tope = -1;
    }
    
    public void push(char valor){
        datos[++tope]= valor;
    }
    
    public char pop(){
        return datos[tope--];
    }
    
    public char seek(){
        return tope >-1 ? datos[tope] : ' ';
    }
    
    public boolean isEmpty(){
        return (tope==-1);
    }
    
    public boolean isFull(){
        return (tope==datos.length-1);
    }
    
}//End
