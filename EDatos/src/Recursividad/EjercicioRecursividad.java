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
public class EjercicioRecursividad {
    public static void hanoi(int nDiscos, char origen, char destino, char aux){
	//Poner el código aquí
        if(nDiscos==1){
            System.out.println("Mover de " + origen + " a " + destino);
        }else {
            hanoi(nDiscos-1, origen, aux, destino);
            System.out.println("Mover de " + origen + " a " + destino);
            hanoi(nDiscos - 1, aux, destino, origen);
        }
    } 
    public static void main(String[] args) {
        //hanoi(2, 'A' , 'B', 'C');
        hanoi(8, 'C' , 'B', 'A');
    }

}//End
