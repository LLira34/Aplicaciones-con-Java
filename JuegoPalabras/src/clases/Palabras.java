/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Random;

/**
 *
 * @author Daniel Loza
 */
public class Palabras {
    private String[] Ingles={"DOG","CAT","CAR","APPLE","BLACK"};
    private String[] Español={"PERRO","GATO","CARRO","MANZANA","NEGRO"};
    
    private String palabra;
    private String respuesta;
    private String respUser;
    private int aciertos;
    private int errores;
    
    public void setRespUser(String respUser){
        this.respUser= respUser;
    }
    
    public void seleccionarPalabra(){
        Random r1=new Random();
        int x=0;
        x=r1.nextInt(Ingles.length);
        palabra= Ingles[x];
        respuesta=Español[x];
    }
    public String getPalabra(){
        return palabra;
    }
    public String getRespuesta(){
        return respuesta;
    }
    public int getAciertos(){
        return aciertos;
    }
    public int getErrores(){
        return errores;
    }
    public boolean verificar(){
        if(respUser.equalsIgnoreCase(respuesta)){
            aciertos++;
            return true;
        }else{
            errores++;
            return false;
        }
    }
}
