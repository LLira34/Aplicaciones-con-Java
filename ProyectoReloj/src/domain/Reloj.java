/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author ATrejo
 */
public class Reloj {
    private int hora;
    private int minuto;
    private int segundo;
    private boolean banAM;
    
    public Reloj(){
        hora=12;
        banAM= true;
    }
    
    public void setHora(int hora){
        this.hora= hora;
    }
    
    public void setMinuto(int minuto){
        this.minuto= minuto;
    }
    
    public void setSegundo(int segundo){
        this.segundo= segundo;
    }
    
    public void setBanAM(boolean banAM){
        this.banAM= banAM;
    }
    
    public String mostrarHora(){
        String salida="";
        salida= hora+":"+minuto+":"+segundo;
        if(banAM){
            salida= salida+" AM";
        }else{
            salida= salida+" PM";
        }
        return salida;
    }
}
