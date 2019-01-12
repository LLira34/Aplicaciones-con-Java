/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad1;

/**
 *
 * @author LLira
 * Materia Estructura de datos
 * Profesor: Apolinar Trejo
 * Unidad 1. Conceptos basicos
 */
public class TDAPila {
    private int [] datos;
    private int cima;

    //Constructor
    public TDAPila(int tam) {
        datos= new int[tam];
    }
    
    public void meter(int elemento){ //Pasar el parametro
        datos[cima++] = elemento; //Posterior
        //cima++;
    }
    
    public int sacar(){
        //cima--;
        return datos[--cima]; //Reduce el valor de la cima, luego lo usa.
    }
    
    public boolean estaVacia(){
        /*if(cima == 0){
            return true;
        }else{
            return false;
        }*/
        return (cima==0);
    }
    
    
}//Fin
