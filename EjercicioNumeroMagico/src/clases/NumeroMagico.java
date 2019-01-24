/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Random;

/**
 *
 * @author Lab2
 */
public class NumeroMagico {
    //Atributos
    private int numero;
    private byte intentos;
    private String pista;
    private int valor;
    private boolean banOk;
    private String jugador;
    
    //Constructor
    public NumeroMagico(String jugador){
        this.jugador= jugador;
    }
    
    //Metodos
    public void setValor(int valor){
        this.valor= valor;
    }
    
    /**
     * Metodo que calcula un numero magico del 1 al 1000
     */
    public void calcularNumero(){
        Random r1= new Random();
        numero= r1.nextInt(1000)+1;
    }
    
    public void verificarNumero(){
        intentos++;
        if(valor==numero){
            banOk= true;
            pista= "Le atinaste en "+intentos+" intentos!!";
        }else if(valor>numero){
            pista= "Fallaste, el numero es menor";
        }else{
            pista= "Fallaste, el numero es mayor";
        }
        
    }
    public String getPista(){
        return pista;
    }
    
    public byte getIntentos(){
        return intentos;
    }
    
    public boolean isBanOk(){
        return banOk;
    }
    
    public int getNumero(){
        return numero;
    }
    
    
}//Fin clase
