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
public class JuegoVolados {
    //Atributos
    private boolean volado;
    private char tiro;
    private int apuesta;
    private int saldo;
    private String jugador;
    
    //Constructor
    public JuegoVolados(String jugador, int saldo){
        this.jugador= jugador;
        this.saldo= saldo;
    }
    
    //Metodos
    public void setTiro(char tiro){
        this.tiro= tiro;
    }
    
    public void setApuesta(int apuesta){
        this.apuesta= apuesta;
    }
    
    public String lanzarVolado(){
        String lanzamiento="";
        Random r1= new Random();
        volado= r1.nextBoolean();
        if(volado){
            lanzamiento="SOL";
        }else{
            lanzamiento="AGUILA";
        }
        return lanzamiento;
    }
    
    public boolean verificarVolado(){
        if(tiro=='S' &&volado||tiro=='A'&&volado==false){
            saldo= saldo+apuesta;
            return true;
        }else{
        saldo= saldo-apuesta;
        return false;
        }
    
    }
    
    public int getSaldo(){
        return saldo;
    }
    
} //Fin de la clase
