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
public class Stack {
    private int tope;
    private double[] datos;
    private int tam;
    
    public Stack(int tam){
        this.tam= tam;
        datos= new double[tam];
        tope=-1;
    }
    
    public void push(double valor){
        datos[++tope]= valor;
    }
    
    public double pop(){
        return datos[tope--];
    }
    
    public double seek(){
        return datos[tope];
    }
    
    public boolean isEmpty(){
        return (tope==-1);
    }
    
    public boolean isFull(){
        return (tope==tam-1);
    }
    
}//End
